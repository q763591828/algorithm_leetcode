package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.Stack;

public class test_236_new {

    Stack<TreeNode> workS = new Stack<>();
    int sign = 0;

    public TreeNode solve(TreeNode root, TreeNode p, TreeNode q,TreeNode find1,TreeNode find2 ){
        if(root == null)
            return null;

        workS.push(root);

        if(sign == 1 && (root == p || root == q)){
            return workS.get(workS.size()-2);
        }

        if(root == p ){
            if(find1 == null )
                find1  = p;
            else  //直接找到最近公共祖先
                return find1;
        }
        if(root == q){
            if(find1 == null)
                find1 = q ;
            else
                return find1;
        }

        TreeNode res_l = solve(root.left,p,q,find1,find2);
        if(res_l != null)
            return res_l;

        TreeNode res_r = solve(root.right,p,q,find1,find2);
        if(res_r !=null)
            return res_r;

        TreeNode tmp = workS.pop();
        if(tmp == find1){
            sign = 1;
        }

        return null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root== null)
            return null;

        TreeNode res = solve(root,p,q,null,null);
        return res;
    }

    public static void main(String [] args){
        TreeTool tool = new TreeTool();
        int nums[] = {3,5,1,6,2,0,8,-100,-100,7,4};
        TreeNode root = tool.generateTree(nums);

        test_236_new test_236_new = new test_236_new();
        TreeNode res = test_236_new.lowestCommonAncestor(root , root.left.left ,root.right.left);
        return;
    }
}
