package LeetCode.math.medium;

public class test_365 {

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y < z )
            return false;
        if(x== 0 || y == 0  )
            return z==0 || x+ y == z;
        return z % gcd(x,y) == 0;
    }

    public static void main(String[] args){
        test_365 test_365 = new test_365();
        test_365.gcd(3,4);
    }
}
