package LeetCode.other;

public class test_050 {

    public double pow(double x,long n){

        if(n==0 || x==1)
            return 1;
        else if(n==1 )
            return x;
        else if(n == 2)
            return x*x;
        else if(n>2 && n%2 ==0){
            return pow(x*x , n/2) ;
        }else if(n>2 && n%2 == 1){
            return pow(x*x,n/2)*x;
        }
        return 0D;
    }




    public double myPow(double x, int n) {
        long N = n;
        int sign = 0;
        if(N<0){
            sign =1;
            N= -N;
        }


        if(sign==0)
            return pow(x,N);
        else {
            return pow(1/x,N);
        }

    }

    public static void main(String[] args){
        test_050 test = new test_050();
        Double result = test.myPow(-1.00000,-2147483648);

        return;
    }

}
