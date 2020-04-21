package Offer;

public class Offer_50 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length < 1)
            return false;
        for(int i = 0 ; i < length ; i++){
            if(numbers[i] < 0 || numbers[i] > length-1)
                return false;
            int tmp = 0;
            while ( numbers[i] != i){
                if(numbers[numbers[i]] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                tmp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = tmp;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Offer_50 offer_50 = new Offer_50();
        int [] numbers = {2,3,1,0,2,5,3};
        offer_50.duplicate(numbers,numbers.length,numbers);
    }
}
