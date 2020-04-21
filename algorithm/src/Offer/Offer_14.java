package Offer;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;

public class Offer_14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null)
            return null;
        if(k <= 0 )
            return null;


        ListNode p1 = head, p2=head;

        int i = 0;
        while(p1.next!= null){
            p1 = p1.next;
            i++;
            if(i>=k)
                p2 = p2.next;
        }
        if(i < k-1){
            return  null;
        }

        return p2;
    }

    public static void main(String[] args){
        Offer_14 offer_14 = new Offer_14();

        LinkListTool tool = new LinkListTool();
        ListNode head = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);

        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        offer_14.FindKthToTail(head,6);
    }


}
