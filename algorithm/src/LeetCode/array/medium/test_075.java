package LeetCode.array.medium;

public class test_075 {
    public void sortColors(int[] nums) {
        int i = 0 ,j = nums.length -1 , curr = 0 , tmp =0 ;
        while (i<j && curr <= j){
            if(nums[curr] == 2){
                tmp = nums[j];
                nums[j] = nums[curr];
                nums[curr] = tmp;
                j--;
            }else if (nums[curr] == 0){
                tmp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = tmp;
                i++;
                curr++;
            }else {
                curr++;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {2,0,1};
        test_075 test = new test_075();
        test.sortColors(nums);
        return;
    }
}
