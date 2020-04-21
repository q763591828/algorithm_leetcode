package LeetCode.other;

public class test_026 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return  nums.length;

        int begin = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[begin])
                continue;
            else {
                nums[++begin] = nums[i];
            }
        }
        return begin+1;
    }

    public static void main(String[] args){
        int nums[] = {0,0,1,1,1,2,2,3,3,4};

        int result = removeDuplicates(nums);
        return;
    }
}
