package Offer;

public class test_recurion
{

    private int recursion(int n , int result){

        if(n==0) return result;

        return recursion(n-1,result*n);

    }


    public static void main(String[] args){
        test_recurion test = new test_recurion();

        int sum = test.recursion(6,1);
        return;
    }
}
