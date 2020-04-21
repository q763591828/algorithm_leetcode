package Offer;

public class Offer_51 {

    public int[] multiply(int[] A) {

        int[] B = new int[A.length];
        if(A.length == 0)
            return B;
        B[0] = 1;
        for(int i =1; i < A.length ; i++){
            B[i] = B[i-1]* A[i-1];
        }
        int tmp = 1;
        for(int i = A.length -2 ; i> -1 ; i--){
            tmp *= A[i+1];
            B[i] *= tmp;
        }
        return B;
    }

    public static void main(String[] args){
        Offer_51 offer_51 = new Offer_51();
        int[] A = {};
        int[] B = offer_51.multiply(A);
        return;
    }


}
