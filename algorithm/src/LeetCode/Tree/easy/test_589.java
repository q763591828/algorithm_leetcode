package LeetCode.Tree.easy;

import LeetCode.Tree.Node;

import java.util.*;

public class test_589 {
    private List<Integer> list = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        if(root==null) return list;

        list.add(root.val);
        for(int i = 0 ; i< root.children.size() ;i++){
            preorder(root.children.get(i));
        }
        return list;
    }

    public List<Integer> preorder_no_recursive(Node root){

        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            Node tmp_node = stack.pop();
            list.add(tmp_node.val);

            for(int i = tmp_node.children.size() - 1 ; i >= 0  ; i--) {
                stack.add(tmp_node.children.get(i));
            }
        }

        return list;
    }

    public static void main(String[] args){
        test_589 test = new test_589();
        test.preorder_no_recursive(null);
    }
}
