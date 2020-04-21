package LeetCode.greedy.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer,int[]> map = new HashMap<>();
        int[] t;
        for(int i = 0; i < groupSizes.length ; i++){
            if(map.containsKey(groupSizes[i])){
                t = map.get(groupSizes[i]);
                t[0]--; //该容器的容量减1
                lists.get(t[1]).add(i); //找到该容器并且将数据放入
                if(t[0] == 0){
                    map.remove(groupSizes[i]); //如果容器放满了，就删除该key。
                }

            }else {
                ArrayList<Integer> list = new ArrayList<>();
                int [] nums ={0,0};
                nums[0] = groupSizes[i]-1;
                nums[1] = lists.size();
                list.add(i);
                lists.add(list);
                if(nums[0]!= 0)
                    map.put(groupSizes[i],nums);

            }
        }
        return lists;
    }

    public static void main(String[] args){
        test_1282 test_1282 = new test_1282();
        int[] nums = {3,3,3,3,3,1,3,1};
        test_1282.groupThePeople(nums);


    }

}
