package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

public class test_617 {

    public void merge(TreeNode t1 , TreeNode t2 , TreeNode t1_before , int left_right){
        if(t1 != null){ //在t1不为null 的情况下
            if(t2!=null){ //在t2不为null的情况下
                t1.val = t1.val + t2.val;
            }else { //在t2为null的情况下
                return;
            }
            merge(t1.left,t2.left,t1,1);
            merge(t1.right,t2.right,t1,2);
        }else {
            if(t2 == null)
                return;
            else{
                if(left_right == 1){
                    t1_before.left = t2;
                }else {
                    t1_before.right = t2;
                }
                return;
            }

        }

    }



    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        merge(t1,t2,t1,1);

        return t1;
    }

    public static void main(String[] args){

    }
}
