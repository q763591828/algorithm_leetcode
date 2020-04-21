package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class Offer_58 {

    boolean judge(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null )
            return true;
        else if((root1 == null && root2!=null) || (root1 != null && root2 == null))
            return false;

        if(judge(root1.left,root2.right)==false ) return false;
        if(judge(root1.right,root2.left)==false) return false;

        if(root1.val==root2.val)
            return true;
        else
            return false;

    }

    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null)
            return true;

        return judge(pRoot.left,pRoot.right);
    }

    public static void main(String[] args) {
        Offer_58 offer_58 = new Offer_58();
        TreeTool tool = new TreeTool();
        int nums[] = {8,6,6,5,-100,-100,5};
        TreeNode treeNode = tool.generateTree(nums);
        boolean b =offer_58.isSymmetrical(new TreeNode(10));
        return;
    }
}
