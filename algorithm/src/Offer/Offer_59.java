package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Offer_59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(pRoot == null)
            return lists;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s2.add(pRoot);
        TreeNode p = null;

        while (!s1.isEmpty() || !s2.isEmpty()){
            ArrayList list = new ArrayList();
            while (!s1.isEmpty ()){
                p = s1.pop();
                if(p.right != null) s2.add(p.right);
                if(p.left!= null) s2.add(p.left);
                list.add(p.val);

                if(s1.isEmpty())
                    lists.add(list);
            }

            list = new ArrayList();
            while (!s2.isEmpty()){
                p = s2.pop();
                if(p.left!=null) s1.add(p.left);
                if(p.right!=null) s1.add(p.right);
                list.add(p.val);

                if(s2.isEmpty())
                    lists.add(list);
            }
        }

        return lists;
    }

    public static void main(String[] args){
        Offer_59 offer_59 = new Offer_59();
        TreeTool tool = new TreeTool();
        int nums[] = {8,6,10,5,-100,9,11};
        TreeNode treeNode = tool.generateTree(nums);

        offer_59.Print(null);
    }
}
