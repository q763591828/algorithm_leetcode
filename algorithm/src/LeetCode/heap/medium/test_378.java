package LeetCode.heap.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class test_378 {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ;j<matrix[0].length ;j++){
                pq.add(matrix[i][j]);
            }
        }

        int target = 0;
        int ans =0;
        while (target < k){
            target++;
            ans = pq.poll();
            if(target == k){
                return ans;
            }
        }

        return 0;
    }
}
