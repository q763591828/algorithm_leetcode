package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class test_543 {

    /*int max_l = 0;
    int max_r = 0;
    ArrayList<Integer> l_list ;
    ArrayList<Integer> r_list ;
    ArrayList<Integer> tmp_list;

    public ArrayList<Integer> find(TreeNode root){
        int deep = 0;
        if(root == null){
            tmp_list = new ArrayList<>();
            return tmp_list;
        }



        ArrayList l = find(root.left);
        ArrayList r = find(root.right);


        if(l_list.size() + r_list.size() <  l.size()+r.size()){
            l_list.clear();
            r_list.clear();
            l_list = new ArrayList<>(l);
            r_list = new ArrayList<>(r);
        }

        l.add(root.val);
        r.add(root.val);

        if(l.size() > r.size())
            return l;
        else
            return r;
    }*/

    int max_l;
    int max_r;

    public int find(TreeNode root){
        int deep = 0 ;
        if(root == null){
            return deep;
        }

        int l = find(root.left);
        int r = find(root.right);

        if(max_r + max_l < l+r){
            max_l = l;
            max_r = r;
        }


        if(l> r)
            deep= l;
        else
            deep = r;

        return ++deep;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        find(root);

        return max_l+max_r;

    }

    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        int [] nums = {1,2,3,4,5};
        TreeNode root = tool.generateTree(nums);
        test_543 test_543 = new test_543();
        test_543.diameterOfBinaryTree(null);
    }
}
