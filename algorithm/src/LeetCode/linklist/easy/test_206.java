package LeetCode.linklist.easy;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;

public class test_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode p = new ListNode(0),tmp_head =null,tmp_p =null;
        while (head!=null){
            tmp_head = head.next;

            tmp_p = p.next;
            p.next = head;
            head.next = tmp_p;
            head = tmp_head;
        }
        return p.next;

        /*ListNode p1 = head,p2=head.next,tmp_node = null,last = head;
        while (p2!= null){
            tmp_node = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = tmp_node;
            p1.next = p2;
        }
        last.next = head;
        return p1;*/
    }

    public static void main(String[] ars){
        test_206 test = new test_206();
        int nums[] = {1,2,3,4,5};
        LinkListTool tool = new LinkListTool();
        ListNode head = tool.generateLinkList(nums).next;

        test.reverseList(head);
        return;
    }
}
