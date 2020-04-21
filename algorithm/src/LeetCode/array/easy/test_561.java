package LeetCode.array.easy;

import java.util.Arrays;

public class test_561 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0 ;
        for(int i = 0 ; i<nums.length ; i+=2){
            ans +=nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        test_561 test = new test_561();
        int[] nums = {1,4,3,2};
        test.arrayPairSum(nums);

    }
}
