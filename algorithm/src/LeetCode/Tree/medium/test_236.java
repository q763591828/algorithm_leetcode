package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.Stack;

public class test_236 {

    Stack<TreeNode> workS = new Stack<>();
    Stack<TreeNode> stack1 ;
    Stack<TreeNode> stack2 ;

    public void find(TreeNode root , TreeNode p , TreeNode q , int sign){
        if(root == null)
            return;

        workS.push(root);
        if(root == p ){
            stack1 = (Stack<TreeNode>) workS.clone();
            sign++;
        }
        if(root == q){
            stack2 = (Stack<TreeNode>) workS.clone();
            sign++;
        }
        if(sign == 2)
            return;
        find(root.left,p,q,sign);
        find(root.right,p,q,sign);
        workS.pop();
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root== null)
            return null;

        find(root,p,q,0);

        for(int i = stack1.size()-1 ; i> -1 ; i--){
            for(int j = stack2.size() -1  ; j > -1 ; j--){
                if(stack1.get(i) == stack2.get(j)){
                    return stack1.get(i);
                }
            }
        }
        //如果没有找到的话返回null
        return null;
    }

    public static void main(String [] args){
        TreeTool tool = new TreeTool();
        int nums[] = {3,5,1,6,2,0,8,-100,-100,7,4};
        TreeNode root = tool.generateTree(nums);

        test_236 test_236 = new test_236();
        TreeNode res = test_236.lowestCommonAncestor(root , root.left,root.left);
        return;
    }
}
