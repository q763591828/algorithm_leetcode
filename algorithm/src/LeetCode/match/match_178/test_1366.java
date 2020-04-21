package LeetCode.match.match_178;

import java.util.*;

public class test_1366 {
    public String rankTeams(String[] votes) {
        int size = votes[0].length();
        Map<Character,int[]> map = new HashMap<>();
        for(int i = 0 ; i< votes.length ; ++i){
            String s = votes[i];
            for(int j = 0 ; j < s.length() ; ++j){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    int[] t_a = map.get(c);
                    t_a[j] += 1;
                }else {
                    int[] array = new int[size];
                    array[j] += 1;
                    map.put(c,array);
                }
            }
        }
        PriorityQueue<Character> pq = new PriorityQueue(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int[] a1 = map.get(o1);
                int[] a2 = map.get(o2);
                for(int i = 0 ; i < a1.length ; ++i){
                    if(a1[i] != a2[i]){
                        return a2[i] - a1[i];
                    }
                }

                return o1-o2;
            }
        });

        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Character next = iterator.next();
            pq.add(next);
        }

        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()){
            res.append(pq.poll());
        }

        return res.toString();



    }

}
