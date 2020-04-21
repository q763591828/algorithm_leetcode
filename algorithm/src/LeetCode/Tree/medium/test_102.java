package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.*;

public class test_102 {
    /*
     * 用两个队列进行处理，能够很好的编程
     * 最好的方式是利用递归，但是需要传递一个层数的参数。
     */

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null)
            return lists;
        Queue<TreeNode> q1 = new LinkedList();
        Queue<TreeNode> q2 = new LinkedList();
        q1.add(root);

        while (!q1.isEmpty() || !q2.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            Queue<TreeNode>t_q1 = q1;
            Queue<TreeNode>t_q2 = q2;
            if(q1.isEmpty() && !q2.isEmpty()){
                t_q1 = q2;
                t_q2 = q1;
            }

            while (!t_q1.isEmpty()){
                TreeNode tmp = t_q1.poll();
                if(tmp == null)
                    break;

                list.add(tmp.val);
                if(tmp.left !=null)
                    t_q2.add(tmp.left);

                if(tmp.right!=null)
                    t_q2.add(tmp.right);
            }
            lists.add(list);

        }

        return lists;
    }

    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        int nums[] = {3,9,20,-100,-100,15,7};
        TreeNode root = tool.generateTree(nums);

        test_102 test_102 = new test_102();
        List<List<Integer>> lists = test_102.levelOrder(root);
        return;
    }
}
