package Interview.easy;

import LeetCode.linklist.ListNode;

import java.util.List;

public class test_02_02 {

    public int kthToLast(ListNode head, int k) {
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = head;

        while (fast!= null){
            fast=fast.next;
            if(k == 1){
                slow = slow.next;
            }else
                k--;
        }

        return slow.val;

    }
}
