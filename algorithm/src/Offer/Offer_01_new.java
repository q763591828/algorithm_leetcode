package Offer;

public class Offer_01_new {

    public boolean Find(int target, int [][] array) {
        int c = array[0].length,r = array.length;
        int i = 0 ,j = c-1;

        while (i<=r-1 && j >= 0){
            if(array[i][j] == target)
                return true;
            else if(array[i][j] > target){
                j--;
            }else {
                i++;
            }
        }
        return false;

    }


    public static void main(String [] args){
        int [][] array = {{1,3,5,9},{2,4,7,14},{4,5,9,15},{8,10,14,20}};
        Offer_01_new offer_01_new = new Offer_01_new();
        boolean a = offer_01_new.Find(21,array);
        return;

    }
}
