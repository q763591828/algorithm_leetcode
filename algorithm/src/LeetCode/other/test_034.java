package LeetCode.other;

public class test_034 {


    public static int[] binarySearch( int[] nums , int left , int right , int target){
        int mid = 0;
        int[] result = new int[3];
        result[0] = -1;
        while(left < right){
            mid = left + right/2;
            if(nums[mid] == target){
                result[0] = mid;
                result[1] = left;
                result[2] = right;

                return  result; //表示确实有这个数
            }
            if(target > nums[mid])
                left = mid+1;
            else if( target < nums[mid])
                right = mid;
        }
        return result;
    }



    public static int[] searchRange(int[] nums, int target) {


        int left = 0 , right = nums.length , mid = 0 , sign =0;
        int[] result = new int[2];
        result[1] = nums.length -1;
        while (left < right){
            mid = (left + right)/2;
            if(target == nums[mid]){
                sign =1;
                break;
            }

            if(target > nums[mid])
                left = mid+1;
            else
                right = mid;

        }

        if(sign == 0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        for( int i = mid -1 ; i >= 0 ; i--){
            if(nums[i] != target){
                result[0] = i+1;
                break;
            }
        }

        for (int i = mid + 1 ; i < nums.length; i++){
            if(nums[i] != target){
                result[1] = i-1;
                break;
            }
        }

        return result;



        /*int left = 0 ,right = nums.length;
        int[] result= new int[2];
        int mid = 0 ;
        int[] sign = binarySearch(nums,left,right,target);

        //然后再用二分法找比他小的数
        if(sign[0] != -1){
            binarySearch(nums,sign[1],sign[0],target-);
            binarySearch(nums,sign[0],sign[2],target+1);
        }
        */

    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        int target = 3;
        searchRange(nums,target);
    }
}
