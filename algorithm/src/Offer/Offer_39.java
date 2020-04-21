package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class Offer_39 {

    public int[] solve(TreeNode root){
        int [] res = {-1,1};
        if(root== null){
            return res;
        }
        int[] l = solve(root.left);
        if(l[1] == 0){
            res[1] = 0;
            return res;
        }

        int[] r = solve(root.right);

        if(r[1] == 0){
            res[1] = 0;
            return res;
        }

        l[0]++;r[0]++;
        res[0]=Math.max(l[0],r[0]);
        if(l[0]==r[0] || l[0] == r[0]-1 || l[0] == r[0]+1)
            res[1] = 1;
        else
            res[1] = 0;

        return res;
    }



    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)
            return true;

        int[] res = solve(root);
        if(res[1] == 1)
            return true;
        else
            return false;
    }


    public static void main(String[] args){
        Offer_39 offer_39 = new Offer_39();

        TreeTool tool = new TreeTool();
        int[] nums = {1,2,3,4,5,-100,6,-100,-100,7};
        TreeNode root = tool.generateTree(nums);
        TreeNode root1 = new TreeNode(10);
        //root.right.right.right = new TreeNode(10);
        offer_39.IsBalanced_Solution(root1);
    }
}
