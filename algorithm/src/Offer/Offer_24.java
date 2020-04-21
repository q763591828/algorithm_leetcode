package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.ArrayList;

public class Offer_24 {

    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public void solve(TreeNode root, int target , ArrayList list){
        if(root == null)
            return;

        target -= root.val;
        list.add(root.val);

        if(root.left == null && root.right==null){
            if(target == 0){
                lists.add(list);
            }
            return;
        }

        ArrayList list1 = new ArrayList(list);
        solve(root.left,target,list1);

        ArrayList list2 = new ArrayList(list);
        solve(root.right,target,list2);
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null)
            return lists;
        //从根节点开始target - root.val
        //再递归左子树，再递归右子树
        ArrayList<Integer> list = new ArrayList<>();
        solve(root,target,list);

        return lists;
    }

    public static void main(String[] args){
        Offer_24 offer_24 = new Offer_24();
        TreeTool tool = new TreeTool();
        int [] nums = {10,5,-100,4};
        TreeNode root = tool.generateTree(nums);

        offer_24.FindPath(root,22);
        return;
    }
}
