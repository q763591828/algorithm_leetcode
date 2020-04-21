package Offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class test_40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        int res[] = new int[k];
        if(k == 0 || arr.length == 0) return res;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i = 0 ; i < arr.length ; ++i ){
            if(pq.size() < k){
                pq.add(arr[i]);
            }else {
                if(arr[i] < pq.peek()){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
        }
        for(int i = 0 ; i < res.length ; ++i){
            res[i] = pq.poll();
        }
        return res;

    }

    public static void main(String[] args){
        test_40 test_40 = new test_40();
        int[] arr = {};
        int k = 2;
        test_40.getLeastNumbers(arr,k);
    }
}
