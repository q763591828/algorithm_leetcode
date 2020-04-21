package Offer;

import LeetCode.linklist.ListNode;

public class Offer_16 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode head = new ListNode(0),result = head;

        while (list1!= null || list2!= null){
            if(list1==null) {
                head.next = list2;
                break;
            }
            if(list2==null) {
                head.next = list1;
                break;
            }

            if(list1.val < list2.val){
                head.next=list1;
                list1 = list1.next;
            }else{
                head.next=list2;
                list2=list2.next;
            }
            head = head.next;

        }
        return result.next;

    }

    public static void main(String[] args){
        /*ListNode head = new ListNode(1);
        ListNode p2 = new ListNode(8);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);

        head.next = p2;

        p3.next = p4;
        p4.next = p5;*/

        Offer_16 offer_16 = new Offer_16();
        offer_16.Merge(null,null);
    }
}
