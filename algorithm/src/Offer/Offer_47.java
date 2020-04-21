package Offer;

public class Offer_47 {

    private static Offer_47 unique;


    public static int sum = 0;
    public static int i = 0;

    public Offer_47() {
        i++;
        sum+=i;
    }

    /*public synchronized Offer_47 facorty(){


        if(unique == null){
            return new Offer_47();
        } else
            return unique;
    }*/

    public int Sum_Solution(int n) {
        Offer_47[] offer_47 = new Offer_47[n];
        return sum;
    }

    public static void main(String[] args){
        Offer_47 offer_47 = new Offer_47();
        offer_47.Sum_Solution(3);
    }
}
