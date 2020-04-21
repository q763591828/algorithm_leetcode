package Offer;

public class Offer_10 {
    private int db[]  = new int[100];

    public int RectCover(int target) {
        if(target < 0){
            return 0;
        }
        if(db[target] != 0)
            return db[target];

        if(target== 1 ){
            db[1] = 1;
            return 1;
        }

        if(target==2){
            db[2] =2;
            return 2;
        }

        db[target] = RectCover(target-1) + RectCover(target-2);

        return db[target];
    }

    public static void main(String[] args){
        Offer_10 offer_10 = new Offer_10();
        int a = offer_10.RectCover(6);

        return;
    }
}
