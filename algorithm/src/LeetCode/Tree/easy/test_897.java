package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class test_897 {
    TreeNode head = new TreeNode(0);
    TreeNode ans_head = head;

    public TreeNode increasingBST(TreeNode root) {
        if(root == null)
            return null;

        increasingBST(root.left);

        head.right = root;
        root.left = null;
        head = root;

        increasingBST(root.right);

        return  ans_head.right;
    }

    public static void main(String[] args){
        test_897 test = new test_897();
        TreeTool tool = new TreeTool();
        int nums[] = {5,3,6,2,4,-100,8,1};
        TreeNode head = tool.generateTree(nums);
        TreeNode tmp =  head.right.right;
        tmp.left = new TreeNode(7);
        tmp.right = new TreeNode(9);
        test.increasingBST(head);
    }
}
