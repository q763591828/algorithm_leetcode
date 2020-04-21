package Offer;

public class Offer_33 {
    public int GetUglyNumber_Solution(int index) {
        if(index == 0)
            return 0;
        int[] db = new int[index];
        db[0] = 1;
        int p2 = 0 , p3 = 0 , p5 = 0;
        int tmp ;
        for(int i = 1 ; i< index ; i++){
            tmp = 0 ;
            tmp = Math.min( db[ p2 ] * 2, Math.min( db[p3] * 3 , db[p5] * 5 ));
            if(tmp == db[p2]*2 )
                p2++;
            if(tmp == db[p3] * 3)
                p3++;
            if(tmp == db[p5] * 5)
                p5++;

            db[i] = tmp;
        }


        return db[index - 1];



        /*int[] dp = new int[index];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < index; i++) {
            int min = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (min == dp[i2] * 2) i2++;
            if (min == dp[i3] * 3) i3++;
            if (min == dp[i5] * 5) i5++;
            dp[i] = min;
        }
        return dp[index - 1];*/

    }

    public static void main(String[] args){
        Offer_33 offer_33 = new Offer_33();
        offer_33.GetUglyNumber_Solution(10);

    }
}
