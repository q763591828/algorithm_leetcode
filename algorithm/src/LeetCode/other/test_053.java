package LeetCode.other;

public class test_053 {

    public void find(int[] nums , int[] db , int[]begin , int [] end){


    }


    public int maxSubArray(int[] nums) {
        //Arrays.sort(nums);
        int sum = nums[0],ans = nums[0];

        for(int i = 1 ;i < nums.length ; i++){
            if(sum < 0) //因为前面的一部分 加起来一定任然为负数 所以应该去掉
                sum = nums[i];
            else
                sum+=nums[i];

            ans = Math.max(sum,ans);
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //int [] nums = {8,-19,5,-4,20};
        int [] nums_1 = {-4,-1,-7};
        test_053 test = new test_053();
        test.maxSubArray(nums_1);

    }
}
