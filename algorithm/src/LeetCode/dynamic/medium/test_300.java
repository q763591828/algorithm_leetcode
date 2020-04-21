package LeetCode.dynamic.medium;

public class test_300 {
    int[] nums;
    int[] db;
    public int find(int b , int e ,int i){
        if(b < e){
            int mid = (b+e) >> 1;
            if(db[mid] > nums[i]){
                return find(b,mid,i);
            }else if(db[mid] < nums[i]){
                return find(mid+1,e,i);
            }else {
                return mid;
            }
        }
        return b;
    }

    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        this.nums = nums; db = new int[nums.length];
        int j = 0 , t = 0;
        db[0] = nums[0];
        for(int i = 1; i < nums.length ; ++i){
            if( nums[i] > db[j]){
                db[++j] = nums[i];
            }else {
                t = find(0,j+1, i);
                db[t] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args){
        test_300 test_300 = new test_300();
        //int[] nums = {10,9,2,5,3,7,101,18,10,11,6,7,8,9};
        int[] nums = {};

        test_300.lengthOfLIS(nums);
    }

}
