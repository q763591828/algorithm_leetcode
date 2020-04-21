package Offer;

import LeetCode.Tree.TreeNode;

public class Offer_18 {

    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        Mirror(root.left);
        Mirror(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
