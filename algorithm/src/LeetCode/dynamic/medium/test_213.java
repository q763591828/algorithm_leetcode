package LeetCode.dynamic.medium;

public class test_213 {

    /*int[] nums ;
    int[] db;

    public int solve(int i){
        if(i<0)
            return 0;

        if(db[i]!=-1)
            return db[i];

        db[i] = Math.max(solve(i-2)+nums[i],solve(i-1));
        return db[i];

    }*/

    /*public int rob(int[] nums) {
        db = new int[nums.length];
        for(int i = 0 ; i< db.length ;i++){
            db[i] = -1;
        }
        this.nums = nums;

        return solve(nums.length-1);
    }*/

    /*public int solve(int[] nums,int sign){
        int i,e;
        if(sign == 0){
            i=0;
            e=nums.length-1;
        }else {
            i=1;
            e=nums.length;
        }

        if(nums.length==0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        int[] db = new int[nums.length];
        db[0] = nums[0];
        db[1] = Math.max(nums[0],nums[1]);


        for(; i < e-1 ; i++){
            db[i+2] = Math.max(db[i]+nums[i+2],db[i+1]);
        }
        return db[e-1];
    }*/

    public int solve(int[] nums) {
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

    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        int[] n_b =new int[nums.length-1],n_e =new int[nums.length-1];
        for(int i = 0 ; i< nums.length - 1;i++){
            n_b[i] = nums[i];
            n_e[i] = nums[i+1];
        }
        return Math.max(solve(n_b),solve(n_e));
    }

    public static void main(String[] args){
        test_213 test_213 = new test_213();
        int[] nums = {};
        int res = test_213.rob(nums);
        return;
    }
}
