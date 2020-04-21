package LeetCode.dynamic.medium;

public class test_486 {

    public boolean PredictTheWinner(int[] nums) {
       int size = nums.length;
       int[][] dp = new int[size][size];
       for(int i= 0 ; i < size ; ++ i){
           dp[i][i] = nums[i];
       }

       for(int i = size - 2 ; i >=0 ; --i ){
           for(int j = i + 1 ; j < size ; ++j ) {
               dp[i][j] = Math.max(nums[i]- dp[i+1][j],nums[j]-dp[i][j-1]);
           }
       }

       return dp[0][size-1] >= 0;
    }


    public static void main(String[] args){
        test_486 test_486 = new test_486();

        int[] nums = {1,5,2};
        boolean a = test_486.PredictTheWinner(nums);
        return;
    }
}
