package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;

public class test_814 {

    public int solve(TreeNode root){
        if(root == null) return 0;

        int left_sign = solve(root.left);
        int right_sign = solve(root.right);
        if(left_sign == 0)
            root.left =null;
        if (right_sign == 0)
            root.right = null;

        if(left_sign !=0 || right_sign != 0)
            return 1;

        return root.val;
    }

    public TreeNode pruneTree(TreeNode root) {
        TreeNode tmp_root = root;
        if(root == null) return null;

        solve(root);
        return root;


    }




    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode root_2 = new TreeNode(0),root_3 = new TreeNode(0) , root_4 = new TreeNode(1);
        root.right = root_2;
        root_2.left = root_3;
        root_2.right = root_4;

        test_814 test = new test_814();
        test.pruneTree(root);
    }
}
