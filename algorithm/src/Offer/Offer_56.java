package Offer;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;


public class Offer_56 {

    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null)
            return null;

        ListNode p_1 = new ListNode(-1);
        ListNode p_2 = new ListNode(-2);
        p_1.next = p_2;
        p_2.next = pHead;

        ListNode p1 = p_1,p2 = p_2 , p3= pHead,result = p_2;
        int tmp = p2.val,sign =0;
        while (p3!=null){
            if(p2.val==p3.val){
                sign = 1;   //标记有重复
            }else { //发现了p2和p3不相等的情况
                if (sign == 1) { //在有重复的情况下只是把p2指向了p3
                    p2 = p3;
                    sign = 0;
                } else {  //无重复的情况下
                    p1.next = p2; //p1应该连接 下一个无重复点p2
                    p1 = p2; //p1变为 p2
                    p2 = p3; //p2 变为 p3
                }
            }
            p3 = p3.next;
        }
        //最后的p3一定为 null 只需判断p2与p1的关系来决定p1是否要连接p2
        if(p1.val == p2.val || sign == 1)
            p1.next = null;
        else if(p1.val != p2.val && sign!= 1)
            p1.next = p2;


        return result.next;
    }

    public static void main(String[] args){
        LinkListTool tool = new LinkListTool();
        int[] nums = {2,2,3,3,4,5,5,6,6,7};
        ListNode p = tool.generateLinkList(nums).next;

        Offer_56 offer_56 = new Offer_56();
        ListNode r = offer_56.deleteDuplication(p);

        return;

    }
}
