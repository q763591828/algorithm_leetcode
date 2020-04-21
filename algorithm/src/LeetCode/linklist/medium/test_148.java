package LeetCode.linklist.medium;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;

import java.util.ArrayList;

public class test_148 {

    ListNode f = null;
    /*
     * 采用快速排序的方式（每一次直接找到一个点的最终位置）
     *
     * 1.找到首节点最终应该放在的位置
     *      如果发现首节点后面节点就是划分节点那么结束该步骤
     *      1）后续节点通过与首节点进行比较如果比首节点小则放在首节点前面如果比首节点大则放在首节点之后
     * 2.对首节点的前面和后面 进行再一次 找到首节点应该放在的位置
     *
     */
    public ArrayList<ListNode>  partition(ListNode head, ListNode last){
        ArrayList list = new ArrayList<>();
        if(head == null)
            return list;

        ListNode mid = head.next;
        ListNode p = head.next , p_f = head,p_l  = p, p_mid = head;

        while (p != last){
            if(p.val < head.val){
                ListNode tmp = p.next;
                p.next = p_f.next;
                p_f.next = p;
                head.next = tmp;
                head = head.next;
                p = tmp;
            }else {
                p_l = p;
                p = p.next;
                //p_mid = p_mid.next;
            }
        }


        list.add(mid);
        list.add(p_l.next);
        return list;

    }


    public void quickSort(ListNode head,ListNode last){
        if(head == last || head.next == last)
            return;

        ArrayList<ListNode> list = partition(head,last);
        if(list.size() == 0 || list.get(0) == list.get(1))
            return;


        quickSort(head,list.get(0));
        quickSort(list.get(0),list.get(1));


    }





    public ListNode sortList(ListNode head) {

        if(head == null)
            return head;

        ListNode mid = head;
        ListNode p = head , p_f = new ListNode(0),p_l  = p, p_mid = head;
        p_f.next = head;

        f = p_f;
        while (p != null){
            if(p.val < head.val){
                ListNode tmp = p.next;
                p.next = p_f.next;
                p_f.next = p;
                head.next = tmp;
                head = head.next;
                p = tmp;
            }else {
                //p_l = p;
                p = p.next;
                //p_mid = p_mid.next;
            }
        }

        quickSort(p_f.next,mid);
        quickSort(mid,null);

        return p_f.next;
    }

    public static  void main(String[] args){
        LinkListTool tool = new LinkListTool();
        int [] nums = {5,3,6,1,10,2,9,0
        };
        ListNode head = tool.generateLinkList(nums).next;
        test_148 test_148 = new test_148();
        test_148.sortList(head);
    }
}
