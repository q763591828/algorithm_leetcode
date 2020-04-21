package LeetCode.dynamic.hard;

public class test_1406 {

    /*public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int[] dp=new int[n+1];

        dp[n]=0;
        int sum=0;
        for(int i=n-1;i>=0;i--){
            //由于有负值分数，这里注意一下
            dp[i]=Integer.MIN_VALUE;
            sum+=stoneValue[i];
            for(int j=i;j<i+3 && j<n;j++){
                dp[i]=Math.max(dp[i],sum-dp[j+1]);
            }
        }
        int alice=dp[0];
        int bob=sum-dp[0];
        if(alice==bob) return "Tie";
        if(alice>bob) return "Alice";
        return "Bob";
    }*/

    public String stoneGameIII(int[] stoneValue) {
        int size = stoneValue.length;
        int[] dp = new int[size+1];
        int sum = 0;

        for(int i = size- 1 ; i >= 0 ; --i ){
            dp[i] = Integer.MIN_VALUE;
            sum += stoneValue[i];

            for(int j = i + 1 ; j < i+4  && j < size + 1 ; ++j ){
                dp[i] = Math.max(dp[i],sum - dp[j]);
            }
        }
        int a = dp[0];
        int b = sum - dp[0];
        if( a > b)  return "Alice";
        else if( b > a) return "Bob";
        else return "Tie";
    }

    public static void main(String[] args){
        test_1406 test_1406 = new test_1406();
        int[] s = {-1,-2,-3};
        test_1406.stoneGameIII(s);
    }
}
