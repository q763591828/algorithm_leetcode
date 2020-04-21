package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Offer_26 {

    ArrayList<TreeNode> list  = new ArrayList();

    public void connect(TreeNode root){
        if(root == null)
            return ;
        //一定要中序遍历
        connect(root.left);


        list.add(root);

        connect(root.right);

    }



    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;

        connect(pRootOfTree);
        if(list.size() >1)
            list.get(0).right = list.get(1);

        for(int i = 1; i < list.size() ; i++){

            list.get(i).left = list.get(i-1);

            if(i == list.size()-1)
                break;
            list.get(i).right = list.get(i+1);
        }

        return list.get(0);
    }

    public static void main(String[] args){
        Offer_26 offer_26 = new Offer_26();
        int[] nums = {10,6,14,4,8,12,16};
        TreeTool tool = new TreeTool();
        TreeNode p = tool.generateTree(nums);

        TreeNode a  = offer_26.Convert(p);
        return;
    }
}
