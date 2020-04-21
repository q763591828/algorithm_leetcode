package Offer;

public class Offer_13 {
    public void reOrderArray(int [] array) {
        int [] result = new int[array.length];

        int p =0;
        int tmp ;
        for(int i = 0 ; i < array.length;i++){

            if(array[i]%2==1){
                tmp = array[i];
                for(int j = i; j>p ; j--){
                    array[j] = array[j-1];
                }
                array[p] = tmp;
                p++;
            }
        }

    }

    public  static void main(String[] args){
        Offer_13 offer_13 = new Offer_13();
        int[] array = {1,2,3,4,5,6,7,8};
        offer_13.reOrderArray(array);
        return;
    }
}
