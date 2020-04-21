package Offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Offer_28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < array.length ; i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }

        Set<Integer> set = map.keySet();
        Iterator iterator = set.iterator();
        int tmp;
        while (iterator.hasNext()){
            tmp = (int)iterator.next();
            if(map.get(tmp) > array.length/2)
                return tmp;
        }
        return 0;
    }

    public static void main(String[] args){
        //int[] nums = {1,2,3,2,2,2,5,4,2};
        int[] nums = {};
        Offer_28 offer_28 = new Offer_28();
        offer_28.MoreThanHalfNum_Solution(nums);
    }
}
