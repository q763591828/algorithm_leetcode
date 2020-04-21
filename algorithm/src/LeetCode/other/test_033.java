package LeetCode.other;

import javax.print.attribute.standard.NumberUp;

public class test_033 {

    public static void find(int[]nums,int target , int begin ,int end){

    }


    public static int search(int[] nums, int target) {

        int begin = 0 ,end = nums.length-1,mid = (begin + end)/2;
        int sign_b_m_reverse = 0 , sign_m_e_reverse = 0;

        while (begin <= end){

            mid = (begin+end)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[begin] > nums[mid]){
                sign_b_m_reverse = 1;
            }else {
                sign_b_m_reverse = 0;
            }
            if(nums[mid] > nums[end]){
                sign_m_e_reverse = 1;
            }else {
                sign_m_e_reverse = 0;
            }

            if((sign_b_m_reverse == 1 && (nums[begin] <=target || nums[mid] >= target ))|| (nums[begin] <= target && nums[mid] >= target)){
                end = mid;
            }else if((sign_m_e_reverse == 1 && (nums[end] >= target || nums[mid] <= target))|| (nums[end] >= target   && nums[mid] <= target)){
                begin = mid+1;
            }else {
                return -1;
            }
        }

        return  -1;



    }


    public static void main(String[] args){
        /*int[] nums = {4,5,6,7,9,10,0,1,2};
        int target = 2 ;*/
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8 ;
        int result = search(nums,target);
        return;

    }
}
