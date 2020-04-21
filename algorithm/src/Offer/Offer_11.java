package Offer;

public class Offer_11 {

    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;

        while(flag!=0){
            if((n & flag )!= 0)
                count++;

            flag = flag<<1;
        }
        return count;
    }

    public static void main(String [] args){
        Offer_11 offer_11 = new Offer_11();
        int a = offer_11.NumberOf1(-1);
        return;
    }
}
