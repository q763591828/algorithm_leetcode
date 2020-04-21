package LeetCode.array.easy;

public class test_283 {

    public void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums.length == 1)    return;
        int i = 0 , j= 0 ,end = nums.length-1;
        while (j <= end){
            while (nums[j] == 0){
                j++;
                if(j >end )
                    return;

            }

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j++;
        }

    }

    public static void  main(String[] args){
        int[] nums = {1,0,0,0,0};
        test_283 test = new test_283();
        test.moveZeroes(nums);
        return;
    }
}
