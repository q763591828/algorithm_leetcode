package LeetCode.heap.medium;

import java.util.*;

public class test_215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i = 0 ; i < nums.length ; i++){
            pq.add(nums[i]);
        }

        int sign= 0 ,b_num = -100;
        while (!pq.isEmpty()){
            int pq_num = pq.poll();
            if(pq_num == b_num)
                continue;
            else {
                sign++;
                if(sign == k)
                    return pq_num;
            }
        }

        return 0;




       /* Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        int b_i = -100;
        int sign = 1;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == b_i)
                continue;
            else {
                b_i = nums[i];
                if(sign == k){
                    return nums[i];
                }
                sign++;
            }
        }

        return 0;*/
    }

    public static void main(String[] args){
        test_215 test = new test_215();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        test.findKthLargest(nums,4);
    }
}
