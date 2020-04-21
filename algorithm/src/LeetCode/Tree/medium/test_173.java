package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;



class BSTIterator {

    private List<Integer> list = new ArrayList<>();
    private int sign= 0;

    public void createIterator(TreeNode root){
        if(root == null) return;

        createIterator(root.left);
        list.add(root.val);
        createIterator(root.right);
    }

    public BSTIterator(TreeNode root) {
        if(root==null)  return;

        createIterator(root);
    }

    /** @return the next smallest number */
    public int next() {
        return list.get(sign++);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(sign>=list.size()) return false;
        else    return true;
    }



    public static void main(String[] args){

        TreeNode root_1 = new TreeNode(7),root_2 = new TreeNode(3),root_3 = new TreeNode(15), root_4= new TreeNode(9),root_5=new TreeNode(20);

        root_1.left = root_2;
        root_1.right = root_3;
        root_3.left = root_4;
        root_3.right = root_5;


        //test_173 test = new test_173();

        BSTIterator iterator = new BSTIterator(root_1);
        iterator.next();    // 返回 3
        iterator.next();    // 返回 7
        iterator.hasNext(); // 返回 true
        iterator.next();    // 返回 9
        iterator.hasNext(); // 返回 true
        iterator.next();    // 返回 15
        iterator.hasNext(); // 返回 true
        iterator.next();    // 返回 20
        iterator.hasNext(); // 返回 false

    }
}
