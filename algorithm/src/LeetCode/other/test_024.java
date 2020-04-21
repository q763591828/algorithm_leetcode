package LeetCode.other;

import java.util.List;

public class test_024 {

     public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode swapPairs(ListNode head) {

        /*ListNode p_1 = new ListNode(0), p_2 = new ListNode(1) , p_3 =new ListNode(2), p_quick ,p_slow , p_begin ,result;
        p_1.next = p_2;
        p_2.next = p_3;
        p_3.next = head;
        p_begin = p_1;
        p_slow = p_2;
        p_quick = p_3;
        result = p_1;

        while (p_2 != null && p_1 != null){
            ListNode tmp = p_quick.next;
            p_begin.next = p_quick;
            p_quick.next = p_slow;
            p_slow.next = tmp;

            if(p_slow.next == null || p_slow.next.next ==null){
                return p_1.next.next.next;
            }
            p_begin = p_slow;
            p_quick = p_slow.next.next;
            p_slow = p_slow.next;
        }
        return p_1.next.next.next;*/

        //递归法

        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;

    }


    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        //ListNode head3 = new ListNode(3);

        //ListNode head4 = new ListNode(4);

        head.next = head2;
        /*head2.next = head3;
        head3.next = head4;*/
        ListNode result_list = swapPairs(head);

        return;
    }


}
