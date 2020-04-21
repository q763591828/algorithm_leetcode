package LeetCode.match.match_182;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test_5368 {

    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; ++i ){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int res = -1,a,b;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            a= next.getKey();
            b= next.getValue();
            if(a == b && b > res){
                res = b;
            }
        }
        return res;
    }


}
