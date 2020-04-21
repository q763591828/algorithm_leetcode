package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;

public class test_701 {

    public void insert(TreeNode root , int val , TreeNode before_node, int sign){
        if(root == null){
            if(sign==0){
                before_node.left = new TreeNode(val);
                return;
            }else if(sign ==1){
                before_node.right = new TreeNode(val);
                return;
            }else
                return;
        }

        if(root.val >= val) insert(root.left,val,root,0);
        else insert(root.right,val,root,1);

    }





    public TreeNode insertIntoBST(TreeNode root, int val) {
        insert(root,val,null,2);

        return root;
    }

    public static void main(String[] args){
        test_701 test = new test_701();
        test.insertIntoBST(null,0);

    }

}
