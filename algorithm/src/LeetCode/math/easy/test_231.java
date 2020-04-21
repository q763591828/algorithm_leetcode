package LeetCode.math.easy;

public class test_231 {

    public boolean isPowerOfTwo(int n) {
        if(n < 1)
            return false;

        while (n%2 == 0){
            n/=2;
        }

        return n==1;
    }

    public static void main(String[] args){
        test_231 test_231 = new test_231();
        boolean r = test_231.isPowerOfTwo(1024);
        return;
    }
}
