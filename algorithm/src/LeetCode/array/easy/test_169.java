package LeetCode.array.easy;

public class test_169 {

    public int majorityElement(int[] nums) {
        int sum = 0 ;
        int tmp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(sum == 0){
                tmp = nums[i];
            }
            if(tmp == nums[i]){
                ++sum;
            }else {
                --sum;
            }
        }

        return tmp;
    }

    public static void main(String[] args){
        test_169 test_169 = new test_169();
        int[] nums = {2,2,1,1,1,2,2};
        test_169.majorityElement(nums);
    }
}
