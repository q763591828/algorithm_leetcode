package LeetCode.dynamic.easy;

public class test_070 {

    int n_1 = 1,n_2 = 0,n,sum,tmp;

    public int solve(int i){
        if(i == n){
            return n_1 + n_2;
        }
        tmp =n_1;
        n_1 = n_1+ n_2;
        n_2 = tmp;
        return solve(i+1);
    }



    public int climbStairs(int n) {
        this.n = n;
        return solve(1);
    }

    public static void main(String[] args){
        test_070 test = new test_070();
        int a = test.climbStairs(6);

        return;
    }
}
