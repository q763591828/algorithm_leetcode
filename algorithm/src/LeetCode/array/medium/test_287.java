package LeetCode.array.medium;

import java.util.Arrays;

public class test_287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int tmp = -1;
        for(int i = 0 ; i< nums.length ;i++){
            if(nums[i] == tmp)
                return tmp;
            else
                tmp = nums[i];
        }

        return 0;

    }

    public static  void main(String[] args){

    }
}
