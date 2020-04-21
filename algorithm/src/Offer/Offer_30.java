package Offer;

public class Offer_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = 0 ;
        int result = -10000;
        int i = 0 ;
        while ( i < array.length ){
            sum+=array[i];
            if(sum < 0) {
                if(sum > result)
                    result = sum;
                sum = 0;
            }else {
                if(sum > result){
                    result = sum;
                }
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        int [] nums = {1,-2,3,10,-4,7,2,-5};
        //int [] nums = {-2,-8,-1,-5,-9};
        //int[] nums = {6,-3,-2,7,-15,1,2,2};
        Offer_30 offer_30 = new Offer_30();
        offer_30.FindGreatestSumOfSubArray(nums);

    }
}
