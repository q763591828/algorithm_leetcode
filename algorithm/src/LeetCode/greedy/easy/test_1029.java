package LeetCode.greedy.easy;

import java.util.*;

public class test_1029 {

    public int twoCitySchedCost(int[][] costs) {
        int ans=0;
        Map<Integer,Integer> map = new TreeMap<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for(int i = 0; i < costs.length ; i++){
            map.put(i,costs[i][0] - costs[i][1]);
        }
        for(int i = 0 ; i< costs.length ; i++){
            pq.add(i);
        }

        int length = costs.length,half = costs.length/2;
        int[] A = new int[half],B=new int[half];
        for(int i = 0 ,j=0; i< length; i++){
            if(i<half){
                A[i] = pq.poll();
            }else {
                B[j] = pq.poll();
                j++;
            }
        }

        for(int i = 0 ; i< half;i++){
            ans += costs[A[i]][0];
        }

        for(int i = 0 ; i< half;i++){
            ans += costs[B[i]][1];
        }
        return  ans;

    }

    public static void main(String args[]){
        test_1029 test = new test_1029();
        int[][] costs ={{10,20},{30,200},{400,50},{30,20}};
        test.twoCitySchedCost(costs);
    }
}
