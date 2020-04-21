package LeetCode.other;

import java.util.Arrays;

public class test_031 {

    public static void nextPermutation(int[] nums) {

        int end = nums.length;
        int min = 10 , seg = 0;//用来标记找到的最小的值的位置，此值的后面所有的
        int sign = 0;

        for(int i = end -1 ; i>0 ; i--){
            if(nums[i-1] < nums[i]){
                seg = i;
                break;
            }
        }

        int b = seg , e = end-1;
        while ( b < e){
            int tmp = nums[b];
            nums[b] = nums[e];
            nums[e] = tmp;
            b++;
            e--;
        }

        if(seg == 0)
            return;

        if (seg == end -1){
            sign = seg;
        }else {
            for(int i = seg ; i < end  ; i++){
                if(nums[i] > nums[seg-1]){
                    sign = i;
                    break;
                }
            }
        }

        int tmp = nums[seg-1];
        nums[seg-1] = nums[sign];
        nums[sign] = tmp;
    }

    public static void main(String[] args){
        //int[] nums = {2,3,9,8,7,5,4,3,2};
        int[] nums = {3,2,1};

        nextPermutation(nums);
    }
}
