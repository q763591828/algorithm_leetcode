package Offer;

public class Offer_09 {

    int db[] = new int[1000];

    public int JumpFloorII(int target) {
        if(target== 0)
            return 1;
        if(db[target]!=0)
            return db[target];

        int sum = 0;
        for(int i = 1; i <= target-1 ; i++){
            sum += JumpFloorII(target-i);
        }
        db[target] = sum+1;

        return db[target];
    }


    public static void main(String[] args){
        Offer_09 offer_09 = new Offer_09();
        int a = offer_09.JumpFloorII(8);
        return;
    }
}
