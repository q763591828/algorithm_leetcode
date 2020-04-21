package LeetCode.array.medium;

import java.util.*;

public class test_347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int new_num = map.get(nums[i]) + 1;
                map.put(nums[i],new_num);
            }else {
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> map.get(i1) - map.get(i2));

        /*PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });*/

        for(Integer key : map.keySet()){
            if(pq.size() < k){
                pq.add(key);
            }else if(map.get(key) > map.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }
        while (!pq.isEmpty()){
            list.add(pq.remove());
        }

        return list;
    }

    public static void main(String[] args){
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        test_347 test = new test_347();
        test.topKFrequent(nums,k);

    }
}
