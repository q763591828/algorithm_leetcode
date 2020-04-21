package Interview.easy;

public class test_16_17 {

    public int maxSubArray(int[] nums) {
        int  t_sum = Integer.MIN_VALUE , sum =Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length  ;i++){
            if(t_sum < nums[i] && t_sum < 0){
                    t_sum = nums[i];
            }else {
                t_sum += nums[i];
            }
            if(t_sum > sum){
                sum = t_sum;
            }
        }

        return sum;
    }

    public static void main(String[] args){
        test_16_17 test_16_17 = new test_16_17();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4,11,-100,1};
        test_16_17.maxSubArray(nums);
    }
}
