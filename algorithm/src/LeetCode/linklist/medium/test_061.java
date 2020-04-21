package LeetCode.linklist.medium;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;

public class test_061 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;

        ListNode head1 = head,target = head,last = head,before_t = head;

        int num = 0;
        while (head!=null){
            num++;
            last = head;
            head = head.next;

        }
        k = num - k%num;
        if(k == 0 || k == num)
            return head1;

        int i = 0;
        while (i < k){
            before_t = target;
            target = target.next;
            i++;
        }
        before_t.next = null;
        last.next = head1;

        return target;
    }

    public static void main(String[] args){
        int nums[] = {1};
        LinkListTool tool = new LinkListTool();
        ListNode head = tool.generateLinkList(nums).next;
        test_061 test = new test_061();
        test.rotateRight(head,1);
        return;

    }
}
