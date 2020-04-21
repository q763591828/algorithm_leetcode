package LeetCode.match.match_183;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_5376 {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0 , half_s = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        half_s = sum/2;
        int t_s = 0;
        for(int i = nums.length - 1;  i >= 0 ; --i){
            t_s += nums[i];
            list.add(nums[i]);
            if(t_s > half_s){
                return list;
            }
        }
        return list;
    }
    public static void main(String[] args){
        test_5376 test_5376 = new test_5376();
        int[] nums = {6};
        test_5376.minSubsequence(nums);
    }

}
