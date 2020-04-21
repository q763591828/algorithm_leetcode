package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTool {

    private List<TreeNode> list = new ArrayList<>();

    public TreeNode generate(int nums[], int index , int before_i){
        if(index >= nums.length)
            return null;

        TreeNode node = null;
        if(nums[index] != -100){
            node = new TreeNode(nums[index]);
        }
        list.add(node);

        if(before_i != -1){
            if((before_i * 2 + 1) == index) {
                list.get(before_i).left = node;
            }
            else if((before_i * 2  + 2) == index)
                list.get(before_i).right = node;

            generate(nums,index+1,index/2);
        }else {
            generate(nums,index+1,0);
        }

        return node;
    }


    public TreeNode generateTree(int nums[]){
        if(nums.length == 0 ){
            return null;
        }

        return generate(nums,0,-1);
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,4,-100,-100,7};
        TreeTool tool = new TreeTool();
        TreeNode root = tool.generateTree(nums);
        return;
    }
}
