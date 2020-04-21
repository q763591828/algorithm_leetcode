package LeetCode.match.match_2020;

import java.util.*;

public class test_3 {
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int[] n_i = {0,0,0};
        int[] res = new int[requirements.length];
        int[] sign = new int[requirements.length];
        Map<Integer,int[]> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =0 ; i< requirements.length ; i++){
            res[i] = -1;
            map.put(i,requirements[i]);
            l.add(i);
        }

        Collections.sort(l,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int[] r1 = map.get(o1);
                int[] r2 = map.get(o2);

                if(r1[0] != r2[0])
                    return r1[0]-r2[0];
                if(r1[1] != r2[1])
                    return r1[1]-r2[1];

                return r1[2]-r2[2];
            }

        });

        int t_j = 0;
        for(int i = -1 ; i< increase.length ; ++i){
            if(i > -1) {
                n_i[0] += increase[i][0];
                n_i[1] += increase[i][1];
                n_i[2] += increase[i][2];
            }

            for(int j = 0 ; j < map.size() ; ++j){
                int[] t_i = map.get(j);
                if(sign[j] == 1 )
                    continue;
                if( n_i[0] >= t_i[0] ) {
                    if (n_i[1] >= t_i[1] && n_i[2] >= t_i[2]) {
                        res[j] = i + 1;
                        sign[j] = 1;
                    }
                }else
                    continue;

            }
        }

        return res;
    }

    public static void main(String[] args){
        test_3 test_3 = new test_3();
        int[][] i = {{2,8,4},{2,5,0},{10,9,8}};
        int[][] r = {{2,11,3},{15,10,7},{9,17,12},{8,1,14}};
        test_3.getTriggerTime(i,r);
    }

    /*PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int[] r1 = map.get(o1);
                int[] r2 = map.get(o2);

                if(r1[0] != r2[0])
                    return r1[0]-r2[0];
                if(r1[1] != r2[1])
                    return r1[1]-r2[1];

                return r1[2]-r2[2];
            }
        });

        for(int i = 0 ; i< requirements.length ; ++i){
            res[i] = -1;
            map.put(i,requirements[i]);
            pq.add(i);
        }

        for(int i = -1 ; i < increase.length; ++i) {
            int t = pq.peek();
            int[] t_i = map.get(t);

            if (i > -1) {
                n_i[0] += increase[i][0];
                n_i[1] += increase[i][1];
                n_i[2] += increase[i][2];
            }

            if(n_i[0] >= t_i[0] && n_i[1] >= t_i[1] && n_i[2] >= t_i[2] ){
                res[t] = i+1;
                pq.poll();
            }
        }

        return res;*/
}
