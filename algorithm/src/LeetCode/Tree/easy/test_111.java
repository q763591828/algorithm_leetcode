package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

public class test_111 {

    public int findDepth(TreeNode root , int depth){
        if(root.left == null && root.right == null){
            return ++depth;
        }
        else {
            depth++;
            if(root.left == null) return  findDepth(root.right,depth);
            if(root.right == null) return findDepth(root.left,depth);
            else return Math.min(findDepth(root.left,depth),findDepth(root.right,depth));
        }

    }


    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;


        int ans = findDepth(root,0);
       /* if(root.left == null && root.right ==null)
            return 1;

        int left = 10000,right =10000;
        if(root.left != null)
            left = findDepth(root.left,1);
        if(root.right!=null)
            right = findDepth(root.right,1);*/

        return ans;
    }

    public static void main(String[] args){
        test_111 test = new test_111();
        TreeNode root = new TreeNode(1),root_2 =new TreeNode(2),root_3 = new TreeNode(3),root_4 = new TreeNode(4),root_5 = new TreeNode(5);
        root.left = root_2;
        root.right = root_3;
        root_2.left = root_4;
        root_3.right = root_5;
        //root.right = new TreeNode(1);
        test.minDepth(root);


    }
}
