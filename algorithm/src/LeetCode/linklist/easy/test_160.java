package LeetCode.linklist.easy;

import LeetCode.linklist.ListNode;

public class test_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode p1 = headA, p2 = headB;
        int num1 = 0 , num2 = 0;
        while (p1!= null){
            p1 = p1.next;
            ++num1;
        }
        while (p2!=null){
            p2 = p2.next;
            ++num2;
        }
        if(num1 < num2) {
            p1 = headB;
            p2 = headA;
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }else {
            p1 = headA;
            p2 = headB;
        }

        while ( p1 != p2){
            if(num1 > num2){
                p1 = p1.next;
                --num1;
            }else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }

        return p1;
    }


    public static void main(String[] args){
        test_160 test_160 = new test_160();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node4;
        node3.next = node4;
        test_160.getIntersectionNode(node3,node1);
    }
}
