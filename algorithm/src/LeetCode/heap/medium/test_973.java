package LeetCode.heap.medium;

import java.util.*;

public class test_973 {

    public int[][] kClosest(int[][] points, int K) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]*o1[0] + o1[1] * o1[1]) - (o2[0]*o2[0] + o2[1]*o2[1]);
            }
        });

        for(int i = 0 ; i< points.length ;i++){
            pq.add(points[i]);
        }

        int[][] ans = new int[K][2];
        for(int i = 0 ; i< K ; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }

    public static void main(String[] args){
        test_973 test = new test_973();

        int[][] points = {{1,3},{-2,2}};
        int[][] points_2 = {{3,3},{5,-1},{-2,4}};
        int[][] points_3 = {{0,1},{1,0}};
        int k = 1;
        test.kClosest(points_3,2);

    }
}
