package Offer;

import java.util.HashMap;
import java.util.Map;

public class test_grammer {


    public static void main(String[]args){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(13,1);
        map.put(14,2);

        boolean a = map.containsKey(13);
        int value = map.get(13);

        return ;
    }

}
