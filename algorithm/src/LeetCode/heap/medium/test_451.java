package LeetCode.heap.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class test_451 {
    //本题应该有更快的桶排序
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        PriorityQueue<Character> pq  = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return  map.get(o2) - map.get(o1) ;
            }
        });

        for(Character c : map.keySet()){
            pq.add(c);
        }

        while (!pq.isEmpty()){
            char app_c = pq.poll();
            int end = map.get(app_c);
            for(int i =  0 ; i < end ; i++ ) {
                ans.append(app_c);
            }
        }

        return ans.toString();
    }

    public  static void main(String[] args){
        test_451 test = new test_451();
        test.frequencySort("Aabb");
    }
}
