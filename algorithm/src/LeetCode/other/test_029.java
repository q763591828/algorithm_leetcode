package LeetCode.other;

public class test_029
{

    public static int divide(int dividend, int divisor) {
        int sum = 0;
        int sign = 1;
        if(dividend <= 0 && dividend > 0){
            dividend = -dividend;
            sign = -1;
        }else if(dividend>=0 && divisor < 0 ){
            divisor = -divisor;
            sign = -1;
        }else  if( dividend < 0 && divisor < 0){
            dividend = -dividend;
            divisor = -divisor;
        }

        while (dividend > divisor){
            dividend-=divisor;
            sum++;
        }

        if(sign == -1){
            return -sum;
        }

        return  sum;
    }

    public static void main(String[] args){
        int dividend = 7;
        int divisor = -3;
        int result = divide(dividend,divisor);
        return;
    }
}
