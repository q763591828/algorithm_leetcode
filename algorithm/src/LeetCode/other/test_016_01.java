package LeetCode.other;

import java.util.Arrays;

public class test_016_01 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int remain = 0,last_begin=0,last_mid = 0 , last_end=0;
        int min_target_remain = 10000,tmp_target_remain = 10000;
        int sign = 0;
        for(int i = 0 ; i < nums.length-2 ; i++){
            int begin = i+1 , end = nums.length -1 ;
            //if(begin < end){
            remain = target - nums[i];
            while(begin < end ){
                int tmp_sum = nums[begin] + nums[end];
                if(tmp_sum == remain){
                    return target;
                }else if( tmp_sum < remain){ //如果小于了目标值，左边右移动
                    //如果右移后发现超过了之前的值，那么要比较 (目标值 - 之前值) 和 (之后值 - 目标值)谁更小（比绝对值更小）
                    if(begin + 1 == end){
                        break;
                    }
                    int dis_1 = nums[begin+1] + nums[end] - remain;
                    if(dis_1 > 0){
                        int dis_2 = remain - nums[begin] + nums[end];
                        if(dis_1 <= dis_2){ //如果之后的值更接近 目标值，那么begin增加1 否则无作为
                            begin++;
                        }else {
                            break;
                        }
                    }
                    begin++; //右移后还是小于目标值
                }else { //如果大于了目标值 右边左移
                    if(end-1 == begin){
                        break;
                    }

                    int dis_1 = remain - (nums[begin] + nums[end-1]) ; //如果左移发现小于了目标值，那么要比较（之前值 - 目标值） 和（目标值- 之后值）谁更小
                    if(remain > nums[begin] + nums[end-1]){
                        int dis_2 = nums[begin] + nums[end] - remain;
                        if(Math.abs(dis_1) <=dis_2){
                            end--;
                        }else {
                            break;
                        }
                    }
                    end--; //左移后还是大于目标值
                }

            }

            if(begin == end ){
                continue;
            }else if(begin > end){
                break;
            }

            tmp_target_remain=target - (nums[i] + nums[begin] + nums[end]);
            if(Math.abs(tmp_target_remain) < min_target_remain){
                min_target_remain = tmp_target_remain;
                last_begin = i;
                last_mid = begin;
                last_end = end;
            }




        }

        return nums[last_begin] + nums[last_mid] + nums[last_end];
    }


    public static void main(String[] args){

        int[] nums = {1,2,4,8,16,32,64,128};
        int target = 82;

        int result = threeSumClosest(nums, target);

        return;

    }
}
