package Offer;

public class Offer_08 {
    /*int[] one = new int[100];
    int[] two = new int[100];*/
    int[] db = new int[1000];
    public int JumpFloor(int target) {
        if(target == 0)
            return 0;

        if(db[target]!= 0){
            return db[target];
        }

        if(target == 1){
            db[1] = 1;
            return 1;
        }
        if(target ==2){
            db[2] = 2;
            return 2;
        }

        db[target] = JumpFloor(target-1) + JumpFloor(target-2);
        return db[target];

    }

    public static void main(String[] args){
        Offer_08 offer_08 = new Offer_08();
        int a = offer_08.JumpFloor(5);
        return;
    }

}
