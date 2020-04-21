package LeetCode.match.match_2020;

public class test_1 {

    public int minCount(int[] coins) {
        int res = 0 ;
        for(int i =0 ; i < coins.length ; ++i ){
            int t = coins[i] /2;
            int t_r = coins[i] %2 ;
            res = res + t + t_r;
        }
        return res;
    }
}
