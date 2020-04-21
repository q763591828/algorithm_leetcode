package LeetCode.linklist;

public class LinkListTool {

    public  ListNode generateLinkList(int nums[]){
        ListNode before_n = new ListNode(0);
        ListNode root = before_n;
        for(int i = 0 ; i < nums.length ; i++){
            before_n.next = new ListNode(nums[i]);
            before_n = before_n.next;
        }
        return root;

    }

}
