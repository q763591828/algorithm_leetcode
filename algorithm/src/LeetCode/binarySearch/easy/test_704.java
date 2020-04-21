package LeetCode.binarySearch.easy;

public class test_704 {

    public int search(int[] nums, int target) {
        int b = 0 , e = nums.length , mid = 0;
        while (b < e){
            mid = (b + e ) >> 1;
            if( nums[mid] < target){
                b = mid+1;
            }else if( nums[mid] > target){
                e = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
