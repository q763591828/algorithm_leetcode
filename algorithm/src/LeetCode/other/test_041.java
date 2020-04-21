package LeetCode.other;

public class test_041 {
    public int firstMissingPositive(int[] nums) {

        int min = 100;

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] > 0 && nums[i] < min){
                min = nums[i];
            }


        }

        return 0;



    }


    public static void main(String[] args){
        test_041 test = new test_041();

        int[] nums = {1,2,0};

        test.firstMissingPositive(nums);


    }
}
