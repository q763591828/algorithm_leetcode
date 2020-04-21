package LeetCode.dynamic.medium;

public class test_322 {

    int db[];
    int[] C;

    public int solve(int i){
        if(i<0)
            return  10000;
        else if(i==0)
            return db[0];
        else if(i>0 && db[i]!=0)
            return db[i];

        int min =1000;
        for(int j = 0 ; j < C.length; j++){
            min = Math.min(min,solve(i-C[j])+1);
        }
        db[i] = min;
        return min;
    }

    public int coinChange(int[] coins, int amount) {
        db = new int[amount+1];
        C = coins;
        int ans = solve(amount);
        if(ans == 1000)
            return -1;
        else
            return ans;
    }

    public static void main(String[] args){
        test_322 test = new test_322();
        int[] coins = {1,2,5};
        int amount = 11;
        test.coinChange(coins,amount);

    }
}
