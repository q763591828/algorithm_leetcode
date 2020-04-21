package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class test_235 {
    TreeNode target;

    public boolean find(TreeNode root, TreeNode p ,TreeNode q){
        if(root == null)
            return false;
        boolean l = find(root.left,p,q);
        boolean r = find(root.right,p,q);

        if(l==true && r == true ) {
            target = root;
            return false;
        }

        if(root == p || root == q) {
            if(l == true || r == true){
                target = root;
                return false;
            }else {
                return true;
            }
        }else if(l == true || r == true){
            return true;
        }

        return false;
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        find(root,p,q);
        return target;
    }

    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        int nums[] = {3,5,1,6,2,0,8,-100,-100,7,4};
        TreeNode root = tool.generateTree(nums);

        test_235 test_235 = new test_235();
        test_235.lowestCommonAncestor(root,root.left,root.left.right.right);
    }
}
