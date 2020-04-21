package LeetCode.match.match_2020;

public class test_4 {

    public int minJump(int[] jump) {
        int size = jump.length;
        int[] dp = new int[size];
        /*for(int i = 0 ; i < dp.length ; ++i){
            dp[i] = 100000;
        }*/
        for(int i = dp.length -1 ; i >=0  ; --i){
            if(jump[i] +i >= size){
                dp[i] = 1;
            }else {
                dp[i] = dp[i+jump[i]]+1;
            }

            //看某位大佬的，没有这个 优化一直过不了！神来之笔！  j < i + jump[i]
            for(int j = i+1; j < dp.length && j < i + jump[i] && dp[j] > dp[i]; ++j){
                dp[j] = Math.min(dp[i]+1,dp[j]);
            }

        }

        return dp[0];
    }

    public static void main(String[] args){
        test_4 test_4 = new test_4();
        //int[] jump ={2, 5, 1, 1, 1, 1};
        int[] jump = {3,7,6,1,4,3,7,8,1,2,8,5,9,8,3,2,7,5,1,1};
        test_4.minJump(jump);
    }
}
