package LeetCode.array.easy;

import java.util.*;

public class test_1207 {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for(Integer times : map.values()){
            if(set.contains(times))
                return false;
            else
                set.add(times);
        }

        return true;
    }


    public static  void main(String[] args){
        test_1207 test = new test_1207();
        int[] arr = {1,2,2,1,1,3};
        test.uniqueOccurrences(arr);
    }

}
