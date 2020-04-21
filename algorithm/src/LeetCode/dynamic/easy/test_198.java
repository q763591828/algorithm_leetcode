package LeetCode.dynamic.easy;

public class test_198 {

    int[] nums ;
    int[] db;

    public int solve(int i){
       if(i<0)
           return 0;

       if(db[i]!=-1)
           return db[i];

       db[i] = Math.max(solve(i-2)+nums[i],solve(i-1));
       return db[i];

    }

    /*public int rob(int[] nums) {
        db = new int[nums.length];
        for(int i = 0 ; i< db.length ;i++){
            db[i] = -1;
        }
        this.nums = nums;

        return solve(nums.length-1);
    }*/


    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        int[] db = new int[nums.length];
        db[0] = nums[0];
        db[1] = Math.max(nums[0],nums[1]);
        for(int i = 0; i < nums.length-2 ; i++){
            db[i+2] = Math.max(db[i]+nums[i+2],db[i+1]);
        }

        return db[nums.length-1];


    }
    public static void main(String[] args){
        test_198 test_198 = new test_198();
        int[] nums = {1,2};
        int a = test_198.rob(nums);

        return;
    }
}
