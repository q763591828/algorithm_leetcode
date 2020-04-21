package LeetCode.math.easy;

public class test_1281 {
    public int subtractProductAndSum(int n) {
        int p= 1;
        int s = 0;
        int tmp =0;

        while( n != 0){
            tmp = n%10;
            p *= tmp;
            s += tmp;
            n = n/10;
        }

        return p-s;
    }

}
