package Offer;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;

import java.util.List;

public class Offer_55 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        /*if(pHead == null)
            return null;*/

        ListNode p1 = pHead, p2 = pHead;
        while(p2!=null){
            if(p2.next == null || p2.next.next == null)
                return null;
            p2 = p2.next.next;
            p1 = p1.next;
            if(p1 == p2)
                break;
        }
        if(p2 == null) //说明没有环
            return null;
        p1 = pHead;
        while (p1!= p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return  p1;
    }

    public static void main(String[] args){
        LinkListTool tool = new LinkListTool();
        int[] nums = {1,2,3};
        ListNode p = tool.generateLinkList(nums).next;

        //p.next.next.next = p.next;
        Offer_55 offer_55 = new Offer_55();
        ListNode rp =  offer_55.EntryNodeOfLoop(null);
        return;


    }
}
