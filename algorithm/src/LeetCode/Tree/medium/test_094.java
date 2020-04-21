package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test_094 {

    private  List<Integer> list = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        /*if (root==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;*/

        //迭代版本
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;





    }

    public static void main(String[] args){

    }
}
