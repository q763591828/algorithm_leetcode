package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_22 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode p = root;

        queue.add(root);
        while (true){

            if(p.left!=null){
                queue.add(p.left);
            }if (p.right!=null){
                queue.add(p.right);
            }
            list.add(queue.poll().val);

            if(!queue.isEmpty())
                p = queue.peek();
            else
                break;
        }

        return list;
    }

    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        int nums[] = {8,6,10,5,-100,-100,-100};
        TreeNode root = tool.generateTree(nums);
        Offer_22 offer_22 = new Offer_22();
        offer_22.PrintFromTopToBottom(root);

    }
}
