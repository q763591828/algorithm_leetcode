package Offer;

import LeetCode.Tree.TreeNode;

public class Offer_26_new {


    public TreeNode connect(TreeNode root,TreeNode pre) {
        TreeNode r = connect(root.left,root);
        TreeNode l = connect(root.right,root);

        if(r == null && l == null)
            root.left = pre;
        return null;


    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        return null;
    }
}
