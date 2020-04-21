package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class test_230 {

    private int index = 0, ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return ans;


        ans = kthSmallest(root.left,k);

        index++;
        if(index==k){
            ans = root.val;
            return ans;
        }else if(index > k){
            return ans;
        }

        ans = kthSmallest(root.right,k);

        return ans;

    }


    public static void main(String[] args){
        int nums[] = {3,1,4,-100,2};
        int nums_2 [] = {5,3,6,2,4,-100,-100,1};
        TreeTool tool = new TreeTool();
        TreeTool tool_2 = new TreeTool();

        TreeNode root = tool.generateTree(nums);
        TreeNode root_2 = tool_2.generateTree(nums_2);

        test_230 test = new test_230();
        test_230 test_2 = new test_230();

        int a = test.kthSmallest(root,1);
        int b = test_2.kthSmallest(root_2,6);

        return;


    }
}
