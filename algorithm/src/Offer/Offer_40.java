package Offer;

public class Offer_40 {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res=0,num=1;
        for(int i = 0 ; i < array.length ; i++){
            res^=array[i];
        }

        while (res>>1!=0){
            res=res>>1;
            num=num<<1;
        }

        num1[0]= 0;
        num2[0] = 0;
        for(int i = 0 ; i<array.length ; i++){
            if((array[i]&num) != 0 ){
                num1[0] = array[i]^num1[0];
            }else
                num2[0] = array[i]^num2[0];
        }



        return;
    }

    public static void main(String[] args){
        Offer_40 offer_40 = new Offer_40();

        int array[] = { 1,3,3,4,4,5,5,9};
        int[] n1 = {0};
        int[] n2 = {0};
        offer_40.FindNumsAppearOnce(array,n1,n2);
    }
}
