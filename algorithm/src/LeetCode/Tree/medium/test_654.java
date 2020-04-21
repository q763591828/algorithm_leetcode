package LeetCode.Tree.medium;

import LeetCode.Tree.TreeNode;

public class test_654 {

    public TreeNode construct(int[] nums, TreeNode root , int begin , int end , int left_or_right){
        int max = -1,max_index = 0;
        for(int i = begin; i<= end ; i++){
            if(max < nums[i]){
                max = nums[i];
                max_index =i;
            }
        }

        TreeNode new_node = new TreeNode(max);
        if(root== null) root = new_node;

        if(left_or_right == 0 ){
            if(begin == end){
                return root;
            }
        } else if(left_or_right == -1){
            if(begin > end)    return root;
            root.left = new_node;
        }
        else{
            if(begin> end) return root;
            root.right = new_node;
        }
        construct(nums,new_node,begin,max_index-1,-1);
        construct(nums,new_node,max_index+1,end,1);

        return root;
    }



    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0)    return null;

        TreeNode root = construct(nums,null,0,nums.length-1,0);

        return root;

    }

    public static void main(String[] args){

        int nums[] = {3,2,1,6,0,5};
        test_654 test = new test_654();
        test.constructMaximumBinaryTree(nums);

    }
}
