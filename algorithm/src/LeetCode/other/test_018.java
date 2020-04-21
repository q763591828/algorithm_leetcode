package LeetCode.other;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test_018 {

    public static  List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new LinkedList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 3 ; i++){

            //前4数太小
            if(nums[i] + nums[i+1 ] + nums[i+2] + nums[i+3] > target){
                continue;
            }


            //还要考虑是否会有重复4元组的情况
            if(i!= 0 && nums[i] == nums[i-1] ){
                continue;
            }

            for(int j = i + 1 ; j < nums.length - 2 ; j++ ){
                if(j!= i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int begin = j + 1, end = nums.length - 1, remain = target - nums[i] - nums[j];
                while (begin < end){
                    if(begin != j+1 && nums[begin] == nums[begin-1]){ //遇到了重复的数字
                        begin++;
                        continue;
                    }

                    if(remain == nums[begin] + nums[end]){
                        lists.add(Arrays.asList(nums[i],nums[j],nums[begin],nums[end]));
                        if(begin != end - 1){
                            begin++;
                            continue;
                        }else {
                            break;
                        }

                    }

                    if(begin == end - 1){
                        break;
                    }else if(remain > nums[begin] + nums[end] ){
                        begin++;
                        continue;
                    }else{
                        end--;
                        continue;
                    }
                }
            }
        }

        return lists;
    }

    public static void main(String[] args){
        int[] nums = {1,-2,-5,-4,-3,3,3,5};

        /*for( int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
            i++;
            continue;
        }*/



        int target = -11;
        fourSum(nums,target);

    }
}
