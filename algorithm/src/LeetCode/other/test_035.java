package LeetCode.other;

public class test_035 {
    public static int searchInsert(int[] nums, int target) {
        int sign = -1;
        /*if(target <= nums[0] || nums.length == 0){
            return 0;
        }*/
        int left = 0 , right = nums.length , mid = 0;
        while (left < right){
            mid = (left + right)/2;
            if( nums[mid] == target)
                System.out.println(mid);
            if(target > nums[mid])
                left = mid+1;
            else
                right = mid;

        }

        if(nums[mid] >= target)
            return mid;
        else
            return mid+1;
    }


    public static int binarysearch(int[] nums, int target){
        int len = nums.length;
        int left = 0;
        int right = len -1;

        while (left < right){
            int mid = (left + right + 1) >>> 1;

            if(nums[mid] == target)
                return mid;

            if(nums[mid] > target)
                right = mid -1;
            else
                left =mid;
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,5,6,7,9};
        int target = 7;
        //searchInsert(nums,target);
        binarysearch(nums,target);
    }
}
