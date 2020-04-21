package LeetCode.linklist.easy;

import LeetCode.linklist.LinkListTool;
import LeetCode.linklist.ListNode;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

public class test_083 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        ListNode before_n = new ListNode(0),ans = head;
        before_n.next = head;
        while (head!=null){
            if(!list.contains(head.val)){
                list.add(head.val);
                before_n = before_n.next;
                head=head.next;
            }else {
                before_n.next = head.next;
                head = head.next;
            }
        }
        return ans;

    }

    public static void main(String[] args){
        LinkListTool tool = new LinkListTool();
        int[] nums = {1,1,2};
        ListNode head = tool.generateLinkList(nums).next;
        test_083 test = new test_083();
        test.deleteDuplicates(head);
    }
}
