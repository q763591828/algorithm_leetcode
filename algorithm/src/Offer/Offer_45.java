package Offer;

public class Offer_45 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length == 0)
            return false;

        int[] times = new int[14];
        for(int i = 0 ; i < numbers.length ;i++){
            times[numbers[i]]++;
        }

        int sign =0;
        for(int i = 1 ; i<times.length ; i++){
            if(times[i] > 1)
                return false;

            if(sign == 0 && times[i] == 1 ) {
                sign = 1;
            }else if(times[i]!= 1 && sign == 1){
                if(times[0]!=0)
                    times[0]--;
                else
                    sign = 2;
            }else if( sign == 2 && times[i] != 0){
                    return false;
            }
        }

        return true;
    }


    public static void main(String[] args){
        Offer_45 offer_45 = new Offer_45();
        int nums[] = {0,0,1,3,7};
        offer_45.isContinuous(nums);
    }
}
