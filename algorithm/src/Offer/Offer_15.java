package Offer;

import LeetCode.linklist.ListNode;

public class Offer_15 {
    ListNode n_head ;

    public ListNode reverse(ListNode head){
        if(head.next == null)
            return n_head = head;

        /*ListNode next_n = reverse(head.next);
        next_n.next = head;*/
        return reverse(head.next).next =head;
    }


    public ListNode ReverseList(ListNode head) {
        if(head ==null)
            return null;
        //ListNode null_n = new ListNode(0);
        //null_n.next = head;

        ListNode result = reverse(head);
        head.next =null;
        return n_head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);

        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        Offer_15 offer_15 = new Offer_15();
        offer_15.ReverseList(head);
    }
}
