package LeetCode.linklist.easy;

import LeetCode.linklist.ListNode;

public class test_141 {

    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;

        ListNode null_p = new ListNode(0);
        null_p.next = head;
        ListNode p1 = null_p,p2 = null_p;

        while (p2!= null){
            if(p2.next == null)
                return  false;
            p2 = p2.next.next;
            p1 = p1.next;

            if(p1 == p2)
                return true;
        }

        return false;


    }
}
