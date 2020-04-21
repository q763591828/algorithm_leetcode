package LeetCode.recursion.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test_078 {

    private List<List<Integer>> lists = new ArrayList<>();

    public void find_set(int[] nums , int index , List<Integer> list){
        if(index >= nums.length) {
            lists.add(list);
            return;
        }

        List<Integer> new_list = new ArrayList<>(list);
        new_list.add(nums[index]);
        find_set(nums,index+1,new_list);    //选了该index的情况
        find_set(nums,index+1,list);        //没选该index的情况
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        find_set(nums,0,list);

        return lists;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        test_078 test = new test_078();
        test.subsets(nums);
    }

}
