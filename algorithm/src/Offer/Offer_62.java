package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class Offer_62 {

    int i = 0;

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null)
            return null;
        TreeNode l =KthNode(pRoot.left,k);
        if(l != null) return l;
        i++;
        if(k == i)
            return pRoot;

        TreeNode r = KthNode(pRoot.right,k);
        if(r!= null) return r;
        return null;
    }

    public static void main(String[] args){
        Offer_62 offer_62 = new Offer_62();

        //int nums [] = {5,3,7,2,4,6,8};
        //int nums [] = {2,1,4,-100,-100,3};
        int nums[] = {9,-100,20};
        TreeTool tool = new TreeTool();
        TreeNode root = tool.generateTree(nums);
        TreeNode a = offer_62.KthNode(root,2);
        return;
    }
}
