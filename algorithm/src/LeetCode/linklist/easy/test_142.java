package LeetCode.linklist.easy;

import LeetCode.linklist.ListNode;

public class test_142 {

    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head , p2 = head;
        while (p1 != null && p2 != null){
            p1 = p1.next;
            if(p2.next!=null){
                p2= p2.next.next;
            }else {
                return null; //说明没有环
            }

            if(p1 == p2)
                break;
        }
        if(p1 == null || p2== null)
            return null;
        p1 = head;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[]args){
        test_142 test_142 = new test_142();
        ListNode node1 = new ListNode(1);
        ListNode node2= new ListNode(2);
        node1.next = node2;
        test_142.detectCycle(node1);

    }
}
