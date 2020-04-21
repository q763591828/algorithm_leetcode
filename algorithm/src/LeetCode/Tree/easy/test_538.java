package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

public class test_538 {

    int sum = 0;
    int tmp = 0;

    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return null;

        convertBST(root.right);
        tmp = root.val;
        root.val += sum;
        sum += tmp;
        convertBST(root.left);
        return root;
    }

}
