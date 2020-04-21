package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class test_114 {
    private TreeNode root_node ;
    private TreeNode connect_node;


    public void flatten(TreeNode root) {

        if (root == null) return;
        // 前序：注意更新last节点，包括更新左右子树
        if (connect_node != null) {
            connect_node.left = null;
            connect_node.right = root;
        }
        connect_node = root;
        // 前序：注意备份右子节点，规避下一节点篡改
        TreeNode copyRight = root.right;
        flatten(root.left);
        flatten(copyRight);

    }

    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        //int[] nums = {1,2,5,3,4,-100,6};
        int[] nums = {2,1,4,-100,-100,3};
        TreeNode root = tool.generateTree(nums);

        /*TreeNode root = new TreeNode(1),root_2 = new TreeNode(2) , root_3 = new TreeNode(3);
        root.right = root_2;
        root_2.left = root_3;*/

        test_114 test = new test_114();
        test.flatten(root);
    }


}
