package LeetCode.other;

import java.util.Arrays;

public class test_016 {

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int begin = 0 , middle = nums.length/2 , end = nums.length-1  , remain = 0;

        int remain_begin_abs=0;
        int remain_middle_abs=0;
        int remain_end_abs = 0;

        while(begin != middle-1 || middle != end-1 ){
            remain = target - nums[begin] - nums[middle] - nums[end];

            if(remain == 0){
                break;
            }else if( remain > 0 ){
                //int tmp = -1000;
                if(begin != middle-1){
                    remain_begin_abs = Math.abs(remain - (nums[begin + 1] - nums[begin]));
                }else {
                    remain_begin_abs = 100000;
                }

                if(middle != end -1 ){
                    remain_middle_abs = Math.abs(remain - (nums[middle+1] - nums[middle]));
                }else {
                    remain_middle_abs =100000;
                }

                if( remain_begin_abs > remain && remain_middle_abs > remain){
                    //找到了最终的3个数
                    break;
                }else if(remain_begin_abs <= remain_middle_abs ){
                    begin++;
                }else {
                    middle++;
                }
            }else{

                if(middle != begin+1){
                    remain_middle_abs = Math.abs(remain - (nums[middle - 1] - nums[middle]));
                }else {
                    remain_middle_abs = 10000;
                }

                if(end != middle+1){
                    remain_end_abs = Math.abs(remain - (nums[end - 1] - nums[end]));
                }else {
                    remain_end_abs = 10000;
                }


                if(remain_middle_abs > -remain && remain_end_abs > -remain){
                    break;
                }else if(remain_end_abs <= remain_middle_abs){
                    end--;
                }else{
                    middle--;
                }
            }
        }

        return nums[begin]+nums[middle]+nums[end];
    }

    public static void main(String[] args){

        int[] nums = {-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33};
        int target = 1;

        int result = threeSumClosest(nums, target);

        return;

    }
}
