package LeetCode.Tree.easy;

import LeetCode.Tree.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class test_108 {

    public TreeNode ToBST(int[] nums ,int left , int right ,TreeNode root , int sign_l_r){
        if(left >= right )
            return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if(left < right && root != null){
            if(sign_l_r == -1 )
                root.left = node;
            else
                root.right = node;
        }

        ToBST(nums,left,mid,node,-1);
        ToBST(nums,mid+1, right , node ,1);

        return node;
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        int left = 0 , right = nums.length;

        TreeNode root =  ToBST(nums,left,right,null,0);

        return root;

        /*if(nums.length== 0) return null;
        //注意队列的初始化要有大小
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root =new TreeNode(nums[0]);
        queue.add(root);

        int i = 1;
        while (i < nums.length ){
            TreeNode  node = queue.poll();

            TreeNode left = new TreeNode(nums[i]);

            node.left = left;

            queue.add(left);


            if(i < nums.length-1 ){
                i++;
                TreeNode right = new TreeNode(nums[i]);
                node.right = right;
                queue.add(right);
                i++;
            }else {
                break;
            }
        }

        return root;*/
    }

    public static void main(String[] args){
        test_108 test = new test_108();
        int nums [] = {-10,-3,0,5,9};
        int nums_1[] = {1,3};
        test.sortedArrayToBST(nums);
        test.sortedArrayToBST(nums_1);
    }
}
