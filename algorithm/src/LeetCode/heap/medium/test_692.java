package LeetCode.heap.medium;

import java.util.*;

public class test_692 {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i< words.length ; i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else {
                map.put(words[i],1);
            }
        }


        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int tmp = map.get(o2) - map.get(o1);
                if(tmp == 0){
                    int o1_n = o1.length();
                    int o2_n = o2.length();
                    for(int i = 0,j =0;i<o1_n && j<o2_n;i++,j++){
                        tmp = o1.charAt(j) - o2.charAt(i);
                        if(tmp ==0)
                            continue;
                        else
                            return tmp;
                    }
                }else {
                    return tmp;
                }

                return o1.length() - o2.length();
            }
        });


        for(String s :map.keySet()){
            pq.add(s);
        }

        int sign = 0;
        while (sign < k){
            list.add(pq.poll());
            sign++;
        }
        return list;
    }

    public static void main(String[] args){
        test_692 test = new test_692();
        String[] words = {"a", "aa", "aaa"};
        int k= 2;
        test.topKFrequent(words,k);
    }
}
