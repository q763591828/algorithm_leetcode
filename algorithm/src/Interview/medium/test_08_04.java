package Interview.medium;

import java.util.ArrayList;
import java.util.List;

public class test_08_04 {

    List<List<Integer>> lists;
    int size;
    int [] nums;
    public void solve(int i,List<Integer> list){
        if(i >= size) {
            lists.add(list);
            return;
        }

        List<Integer> t_list = new ArrayList<>(list);
        t_list.add(nums[i]);
        solve(i+1,t_list);
        solve(i+1,list);

    }


    public List<List<Integer>> subsets(int[] nums) {
        lists = new ArrayList<>();
        size = nums.length;
        this.nums = nums;
        List<Integer> list = new ArrayList<>();
        solve(0,list);
        return lists;
    }

    public static void main(String[] args){
        test_08_04 test_08_04 = new test_08_04();
        int [] nums = {};
        test_08_04.subsets(nums);
    }

}
