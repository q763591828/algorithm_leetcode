package LeetCode.Tree.hard;

import LeetCode.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test_145 {
    private  List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        /*if(root==null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);*/

        //递归版本
        if(root==null) return list;

        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        //stack.push(cur);

        while (cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;

                /*if(cur.right!=null && cur.left!=null){
                    stack.push(cur.right);
                    cur = cur.left;
                }else if(cur.right !=null && cur.left == null){
                    cur = cur.right;
                } else { //cur.right == null && cur.left!= null   ||  cur.right ==null && cur.left == null
                    cur = cur.left;
                }*/
            }else if(cur==null){
                cur = stack.pop();
                list.add(cur.val);
                cur = stack.peek();
                cur = cur.right;
            }
        }

        return list;
    }

    public static void main(String[] args){
        TreeNode root_1 = new TreeNode(1),root_2 = new TreeNode(2),root_3 = new TreeNode(3),root_4 = new TreeNode(4),root_5 = new TreeNode(5),root_6 = new TreeNode(6),root_7 = new TreeNode(7);
        root_1.left = root_2;
        root_1.right = root_3;
        root_2.left = root_4;
        root_2.right = root_5;
        root_3.left = root_6;
        root_3.right = root_7;

        test_145 test = new test_145();
        test.postorderTraversal(root_1);

    }
}
