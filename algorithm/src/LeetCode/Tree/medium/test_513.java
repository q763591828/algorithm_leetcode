package LeetCode.Tree.medium;

import LeetCode.Tree.Node;
import LeetCode.Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class test_513 {

    private int max=0,target;

    public void findLeft(TreeNode root,TreeNode before_node , int deep ) {
        if(root == null)    return ;
        deep++;
        if(deep > max){
            max = deep;
            target = root.val;
        }
        findLeft(root.left,root,deep);
        findLeft(root.right,root,deep);
    }

    public int findBottomLeftValue(TreeNode root) {
        findLeft(root,null,0);
        return target;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        TreeNode root_2 = new TreeNode(1);
        TreeNode root_3 = new TreeNode(3);
        root.left = root_2;
        root.right = root_3;

        test_513 test = new test_513();
        test.findBottomLeftValue(root);

    }
}
