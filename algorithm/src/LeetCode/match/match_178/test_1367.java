package LeetCode.match.match_178;

import LeetCode.Tree.TreeNode;
import LeetCode.linklist.ListNode;

public class test_1367 {

    public boolean find(ListNode head , TreeNode root){
        if(root == null && head != null)
            return false;

        if(head == null )
            return true;

        if(head.val == root.val){
            boolean l = find(head.next,root.left);
            if(l == true)
                return true;

            boolean r = find(head.next , root.right);
            if(r == true)
                return true;

            return false;
        }else
            return false;

    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        while (root!= null){
            boolean mid = find(head,root);
            if(mid == true)
                return true;

            boolean l = isSubPath(head,root.left);
            if(l == true)
                return true;
            boolean r = isSubPath(head,root.right);
            if(r == true)
                return true;

            return false;
        }

        return false;
    }

}
