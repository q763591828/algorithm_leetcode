package LeetCode.Tree.easy;

import LeetCode.Tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test_590 {
    private List<Integer> list = new LinkedList<>();

    public List<Integer> postorder(Node root) {
        if(root == null) return list;
        for(int i = 0 ; i < root.children.size() ; i++){
            postorder(root.children.get(i));
        }
        list.add(root.val);
        return list;
    }

    public List<Integer> postorder_no_recursion(Node root){
        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            Node tmp_node = stack.peek();
            for(int i = tmp_node.children.size() - 1 ; i >= 0  ; i--){
                stack.add(tmp_node.children.get(i));
            }
            tmp_node = stack.pop();
            list.add(tmp_node.val);
        }

        return list;

    }
}
