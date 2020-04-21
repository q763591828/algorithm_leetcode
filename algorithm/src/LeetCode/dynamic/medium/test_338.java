package LeetCode.dynamic.medium;

public class test_338 {
    private int[] ans;

    public int solve(int i){
        if(ans[i]!=0)
            return ans[i];

        if(i==0){
            ans[i] = 0;
            return 0;
        }

        ans[i] = solve(i>>1) + i%2;
        return ans[i];
    }

    public int[] countBits(int num) {
        ans = new int[num+1];
        for(int i = 0 ; i<= num; i++){
            solve(i);
        }

        return ans;
    }

    public static void main(String[] args){
        test_338 test = new test_338();
        test.countBits(7);
    }
}
