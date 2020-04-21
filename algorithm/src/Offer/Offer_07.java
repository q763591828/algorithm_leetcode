package Offer;

public class Offer_07 {
    int[] db=new int[1000];

    public int Fibonacci(int n) {
        if(n==0)
            return 0;

        if(db[n] != 0)
            return db[n];
        if(n == 1 || n == 2){
            return 1;
        }

        db[n] = Fibonacci(n-1)+Fibonacci(n-2);

        return db[n];


    }

    public static void main(String[] args){
        Offer_07 offer_07 = new Offer_07();
        int a = offer_07.Fibonacci(8);
        return;
    }

}
