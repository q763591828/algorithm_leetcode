package Offer;

import java.util.ArrayList;

public class Offer_67 {

    int db[] = new int[1000];
    int sign = 0;

    public int cutRope(int target) {

        if(db[target] != 0 )
            return db[target];
        if(target == 2){
            if(sign == 0)
                return 1;
            db[2] = 2;
            return 2;
        }
        if(target == 3){
            if(sign == 0)
                return 2;
            db[3] = 3;
            return 3;
        }

        sign =1 ;
        int max = 0 ;
        for(int i = 2 ; i<= target/2 ; i++ ){
            int tmp = cutRope(i)*cutRope(target-i);
            if(tmp > max)
                max = tmp;
        }
        db[target] = max;

        return max;
    }


    public static void main(String[] args){
        Offer_67 offer_67 = new Offer_67();
        int res = offer_67.cutRope(3);
        return;


    }
}
