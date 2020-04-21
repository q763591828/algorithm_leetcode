package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

public class test_104 {
    //private int depth = 0;

    //可以不额外使用 depth参数
    public int Depth(TreeNode root , int depth){
        if(root == null)
            return depth;

        /*Depth(root.left,depth+1);
        Depth(root.right,depth+1);*/
        int max_depth = Math.max(Depth(root.left,depth+1),Depth(root.right,depth+1));

        return max_depth;



        /*if(root ==null) return 0;
        if(root.left == null && root.right == null){
            return ++depth;
        }

        int max_depth = Math.max(Depth(root.left,depth+1),Depth(root.right,depth+10));

        return max_depth;*/
    }


    public int maxDepth(TreeNode root) {
        int ans = Depth(root,0);
        return  ans;
    }

    public static void main(String[] args){
        TreeNode root_1 = new TreeNode(1);
        root_1.left = new TreeNode(2);
        test_104 test = new test_104();
        test.maxDepth(root_1);

    }
}
