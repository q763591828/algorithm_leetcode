package LeetCode.dynamic.easy;

public class test_509 {

    private int[] db = new int[1000];

    public int fib(int N) {
        if(db[N] != 0)
            return db[N];

        if(N==0)
            return 0;

        if(N == 1 || N == 2){
            db[N] = 1;
            return 1;

        }
        else{
            return fib(N-1)+fib(N-2);
        }
    }

    public static void main(String[] args){
        test_509 test = new test_509();
        int a = test.fib(0);

        return;
    }
}
