package LeetCode.match.match_183;

import java.util.*;

public class test_5195 {
    StringBuilder s = new StringBuilder();
    int a;int b; int c;

    public void add(int n){
        if (n == a) s.append('a');
        else if (n == b) s.append('b');
        else s.append('c');
    }

    public String longestDiverseString(int a, int b, int c) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',a);
        map.put('b',b);
        map.put('c',c);
        PriorityQueue<Character> pq = new PriorityQueue(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            char tmp =iterator.next();
            pq.add(tmp);
        }

        return s.toString();


    }
}
