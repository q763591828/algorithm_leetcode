package LeetCode.array.medium;

public class test_055
{
    public boolean canJump(int[] nums) {
        int i = 0 , end = nums.length-1,back = 1,sign = 0 ;
        while(true){
            if(i<0)   return false;
            if(i >= end || (nums[i] + i) >= end)    return true;

            int max = -1,tra = -1;
            if(nums[i] != 0 && nums[i]!= sign){
                for(int j = 1 ; j <= nums[i] ; j++){
                    if(max <= nums[i+j] + j){
                        max = nums[i+j] + j;
                        tra = j;
                    }
                }

                back = nums[i+tra];
                i += tra;

            }else if(back > 0){
                i--;
                sign++;
                back--;
            }else {
                return false;
            }


        }



    }

    public static void main(String[] args){

        int[] nums = {2,3,1,1,4};
        int[] nums_2 = {3,2,1,0,4};
        int[] nums_3 = {2,0};
        int[] nums_4 = {1,1,0,1};
        int[] nums_5 = {3,0,8,2,0,0,1};
        int[] nums_6 = {0,3,0,1};
        int[] nums_7 = {0,1};
        int[] nums_8 = {2,0,1,0,1};
        int[] nums_9 = {5,9,3,2,1,0,2,3,3,1,0,0};
        int[] nums_10 = {0};
        int[] nums_11 = {4,2,0,0,1,1,4,4,4,0,4,0};
        int[] nums_12 = {3,4,0,1,0,0,3,0};

        test_055 test = new test_055();
        boolean a = test.canJump(nums_3);

        return;



    }
}
