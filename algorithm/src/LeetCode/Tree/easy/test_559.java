package LeetCode.Tree.easy;

import LeetCode.Tree.Node;

import java.util.ArrayList;
import java.util.List;

public class test_559 {


    public int maxDepth(Node root) {
        if(root == null) return 0;

        if(root.children == null )
            return 1;

        int max = 0 ;
        for(int i = 0 ; i< root.children.size(); i++){
            int tmp = maxDepth(root.children.get(i));
            if(tmp > max)
                max = tmp;
        }
        return max+1;
    }



    public static void main(String[] args){
        test_559 test = new test_559();
        List<Node> _children_2 = new ArrayList<>();


        Node node_5 = new Node(5,null),node_6 = new Node(6,null);
        _children_2.add(node_5);
        _children_2.add(node_6);

        Node node_2 = new Node(3,_children_2),node_3=new Node(2,null),node_4 = new Node(4,null);

        List<Node> _children = new ArrayList<>();
        _children.add(node_2);
        _children.add(node_3);
        _children.add(node_4);
        Node node = new Node(1,_children);
        int  a = test.maxDepth(node);
        return;
    }


}
