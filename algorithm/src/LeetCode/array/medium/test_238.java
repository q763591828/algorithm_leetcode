package LeetCode.array.medium;

public class test_238 {

    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return nums;

        int[] B = new int[nums.length];
        B[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            B[i] = B[i-1] * nums[i-1];
        }
        int tmp = 1;
        for(int i = nums.length - 2;i > -1 ; i--){
            tmp *= nums[i+1];
            B[i] = B[i] * tmp;
        }
        return B;
    }

    public static void main(String[] args){
        test_238 test_238 = new test_238();
        int[] nums = {1,2,3,4};
        test_238.productExceptSelf(null);
    }
}
