package Offer;

public class Offer_06 {
    public int find(int [] array){
        int tmp = array[0];
        for(int i = 0 ; i< array.length ;i++){
            if(tmp > array[i]){
                tmp = array[i];
                break;
            }
        }
        return tmp;
    }


    public int minNumberInRotateArray(int [] array) {
        int b = 0 , e = array.length-1;

        if(array[b] < array[e])
            return array[0];

        while (b < e-1){
            int mid = (b+e)>>>1;
            if(array[b]<array[mid])
                b=mid;
            else
                e=mid;

            if(array[b] == array[mid] && array[mid] == array[e]){
                return find(array);
            }
        }
        return array[e];
    }

    public static void main(String[] args){
        Offer_06 offer_06 = new Offer_06();

        //int[] array = {3,4,5,7,1,2,3};
        //int[] array = {1,2,3,4,5};
        int [] array = {1,1,1,0,1,1};


        int a = 100;
        int c = a>>1;
        int d = offer_06.minNumberInRotateArray(array);

        return;
    }

}
