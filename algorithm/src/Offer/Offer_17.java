package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class Offer_17 {

    public boolean compare(TreeNode root1,TreeNode root2){
        if(root1 == null )
            return true;

        if((root1!=null && root2==null) || root1.val != root2.val )
            return false;
        if(compare(root1.left,root2.left)==false)
            return false;
        if(compare(root1.right,root2.right)==false)
            return false;
        return true;
    }



    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;

        boolean result = true;
        if(root1.val == root2.val){
            result = compare(root2,root1);
            if(result == true)
                return true;
        }

        result = HasSubtree(root1.left,root2);
        if(result==true)
            return true;
        result = HasSubtree(root1.right,root2);
        if(result == true)
            return true;

        return false;
    }


    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        //int[] nums = {8,8,7,9,2,-100,-100,-100,-100,4,7};
        int[] nums = {8,8,7,9,3,-100,-100,-100,-100,4,7};
        //int[] nums = {8,-100,8-100,9,-100,2,-100,5};
        TreeNode root1 = tool.generateTree(nums);
        int[] nums2 = {8,9,2};
        //int[] nums2 = {8,-100,9,3,2};

        TreeTool tool2 = new TreeTool();
        TreeNode root2 = tool2.generateTree(nums2);

        Offer_17 offer_17 = new Offer_17();
        offer_17.HasSubtree(root1,root2);

        return;
    }
}
