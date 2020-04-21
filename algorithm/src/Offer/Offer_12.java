package Offer;

public class Offer_12 {
    public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;

        int sign =0;
        if(exponent< 0 ) {
            exponent = -exponent;
            sign=-1;
        }
        for(int i = 1 ; i < exponent ; i++){
            base*=2;
        }

        if (sign < 0){
            return  1/base;
        }else
            return base;

    }

    public static void main(String [] args){
        Offer_12 offer_12 = new Offer_12();
        offer_12.Power(2,-3);
        return;
    }
}
