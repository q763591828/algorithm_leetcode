package Offer;

import java.util.*;

public class Offer_32 {


    public String PrintMinNumber(int [] numbers) {
        /*String[] arr = {5,4,7,9,2,12,54,21,1};
        //降序
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {

                return 0;
            }
        });*/
        StringBuilder s = new StringBuilder();
        ArrayList<String > list = new ArrayList<>();
        for(int i = 0 ; i < numbers.length ; i++){
            list.add(String.valueOf(numbers[i]));
        }


        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringBuilder s1 = new StringBuilder(o1 + o2);
                StringBuilder s2 = new StringBuilder(o2 + o1);
                for(int i = 0 ; i< s1.length() ; i ++){
                    if(s1.charAt(i) > s2.charAt(i)){
                        return 1;
                    }else if(s1.charAt(i) < s2.charAt(i))
                        return -1;
                }
                return 0;
            }
        });

        for(int i = 0 ; i< list.size() ;i ++){
            if(s.toString().equals("") || s.charAt(0) != '0'){
                s.append(list.get(i));
            }else
                s.insert(0,list.get(i));

        }


        return s.toString();

        /*s = new StringBuilder();
        list = new LinkedList();
        max= 0;
        for(int i = 0  ; i < numbers.length ; i++){
            ArrayList<Integer> l = new ArrayList();
            int tmp_n = numbers[i];
            while (true) {
                l.add(0,tmp_n % 10);
                tmp_n /= 10;
                if (tmp_n == 0)
                    break;
            }
            if(l.size() > max)
                max = l.size();

            list.add(l);
        }
        while (!list.isEmpty()){
            int index = findindex();
            for(int i = 0 ; i< list.get(index).size() ; i++ ){
                s.append(String .valueOf(list.get(index).get(i)));
            }
            //s.append(String.valueOf(numbers[index]));
            list.remove(index);
        }
        return s.toString();*/
    }

    public static void main(String[] args){
        Offer_32 offer_32 = new Offer_32();
        int[] nums = {0,0,1,1};
        offer_32.PrintMinNumber(nums);
    }
}
