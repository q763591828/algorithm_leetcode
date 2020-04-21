package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

public class test_938 {
    private int sign_L = 0,ans = 0 ;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)    return  0;


        if(root!=null){
            rangeSumBST(root.left,L,R);

            if(root.val == L || sign_L==1){
                ans+=root.val;
                sign_L = 1;
            }

            if(root.val == R ){
                //ans += root.val;
                sign_L = 0;
                return ans;
            }

            rangeSumBST(root.right,L,R);

        }

        return ans;
    }

    public static void main(String[] args){
        TreeNode root_1 = new TreeNode(10),root_2 = new TreeNode(5),root_3 = new TreeNode(15),root_4 = new TreeNode(3),root_5 = new TreeNode(7),root_6 = new TreeNode(18);
        root_1.left = root_2;
        root_1.right = root_3;
        root_2.left = root_4;
        root_2.right = root_5;
        root_3.right = root_6;

        test_938 test = new test_938();
        int ans = test.rangeSumBST(root_1,7,15);
        return;
    }

}
