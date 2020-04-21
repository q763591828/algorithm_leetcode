package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class test_965 {

    private int target = 0;

    public boolean isUnival(TreeNode root){
        if(root == null) return true;
        if(root.val != target) return false;
        return (isUnival(root.left) && isUnival(root.right));
    }

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;
        target = root.val;
        return isUnival(root);
    }

    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        int[] nums = {1,1,1,1,1,-100,1};
        TreeNode root = tool.generateTree(nums);
        test_965 test = new test_965();
        test.isUnivalTree(root);

    }
}
