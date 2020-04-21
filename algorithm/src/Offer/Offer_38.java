package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class Offer_38 {
    int max=0;
    int tmp=0;

    public int TreeDepth(TreeNode root) {
        tmp++;
        if(root == null)
            return max;

        if(tmp > max)
            max = tmp;
        TreeDepth(root.left);
        tmp--;
        TreeDepth(root.right);
        tmp--;
        return max;
    }

    public static void main(String[] args){
        Offer_38 offer_38 = new Offer_38();

        TreeTool tool = new TreeTool();
        int[] nums = {1,2,3,4,5,-100,6,-100,-100,7};
        TreeNode root = tool.generateTree(nums);
        int d = offer_38.TreeDepth(root);
        return;
    }
}
