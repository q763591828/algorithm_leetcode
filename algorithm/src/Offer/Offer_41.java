package Offer;

import java.util.ArrayList;

public class Offer_41 {

    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();


    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if(sum <2)
            return lists;
        int s= 0 ;
        int num = 1;

        int[] db = new int[100];
        while ( s < sum){
            s+= num;
            num++;
            db[num] = s;
        }

        int tmp;
        for(int i = num ; i > 1 ; i--){
            tmp = sum;
            tmp -= db[i];
            if ( tmp > 0 && tmp % i == 0 ){
                int t = tmp/i;
                ArrayList<Integer> l = new ArrayList<>();
                for(int j = 0 ;j < i ; j++){
                    l.add(t);
                    t++;
                }
                lists.add(l);
            }
        }
        return lists;


    }

    public static void  main(String[] args){
        Offer_41 offer_41 = new Offer_41();
        offer_41.FindContinuousSequence(3);
    }

}
