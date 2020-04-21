package LeetCode.heap.easy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class test_703 {

    private int k;
    private int[] nums;
    final private PriorityQueue<Integer> pq ;


    public test_703(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        this.pq = new PriorityQueue<>(k);

        for(int num : nums){
            add(num);
        }
    }

    public int add(int val) {

        if(pq.size() < k){
            pq.add(val);
        }else if(pq.peek() < val){
            pq.poll();
            pq.offer(val);
        }

        return pq.peek();
    }

    public static void main(String[] args){
        int k = 3;
        int[] arr = {4,5,8,2};
        test_703 kthLargest = new test_703(3, arr);
        int a = kthLargest.add(3);//returns 4
        int b = kthLargest.add(5);// returns 5
        int c = kthLargest.add(10);// returns 5
        int d = kthLargest.add(9);// returns 8
        int e = kthLargest.add(4);// returns 8
        return;

    }
}
