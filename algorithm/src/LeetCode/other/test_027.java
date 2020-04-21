package LeetCode.other;

public class test_027 {

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }

        int begin = 0;
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] == val){
                continue;
            }else {
                nums[begin++] = nums[i];

            }
        }

        return begin;
    }

    public static void main(String[] args){
        int nums[] = {3,2,2,3};
        int val = 3;

        int result = removeElement(nums , val);
        return;
    }
}
