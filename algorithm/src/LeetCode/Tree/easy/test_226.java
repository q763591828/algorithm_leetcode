package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

public class test_226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }

    public static void main(String[] args){



    }
}
