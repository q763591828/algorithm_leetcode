package LeetCode.array.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test_217 {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ;i ++){
            if(map.containsKey(nums[i])){
               return true;
            }else {
                map.put(nums[i],1);
            }
        }
        return false;
        /*Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            if(map.get(iterator.next()) > 1)
                return true;
        }
        return false;*/
    }

    public static void main(String[] args){
        test_217 test_217 = new test_217();
        int nums[] = {1,2,3};
        test_217.containsDuplicate(nums);
    }
}
