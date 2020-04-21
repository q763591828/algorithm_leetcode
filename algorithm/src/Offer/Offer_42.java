package Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Offer_42 {



    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        /*ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i+1;j<array.length;j++){
                if(array[i] + array[j] == sum){
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(array[i] * array[j]);
                }
            }
            if(!list.isEmpty())
                lists.add(list);
        }
        if(lists.size() ==0) return new ArrayList<Integer>();
        //if(lists.size() ==1) return lists.get(0);
        Collections.sort(lists, new Comparator<ArrayList<Integer>>() {

            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(2).compareTo(o2.get(2));

            }
        });

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = lists.get(0);
        for(int i=0;i<temp.size() -1;i++){
            result.add(temp.get(i));
        }

        return result;*/

        ArrayList<Integer> list = new ArrayList<>();
        int[] sign = new int[array.length];
        int tmp;

        int i = 0 , j = array.length - 1;
        while (i<j){
            tmp = array[i] + array[j];
            if(tmp < sum) {
                i++;
                continue;
            } else if(tmp > sum){
                j--;
                continue;
            }else {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
        }

        return list;
    }

    public static void main(String[] args){
        Offer_42 offer_42 = new Offer_42();

        int[] array = {1,2,3,4,5,6,7,8};
        offer_42.FindNumbersWithSum(array,-10);
    }
}
