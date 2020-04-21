package LeetCode.other;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test_047 {
    private List<List<Integer>> lists = new LinkedList<>();

    public void find (int[] nums ,List<Integer> list, int[] sign , int depth ){

        if (depth == nums.length) {
            List<Integer> list_add = new LinkedList<>(list);
            lists.add(list_add);
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){

            if(sign[i] == 1)    continue; //sign[i]=1表示该数已经选了

            //if(i != 0 && index != -1 && nums[i] == nums[index])  continue; //剪枝操作
            if(i!= 0 && nums[i]== nums[i-1] && sign[i-1]==0) continue;

            sign[i] = 1; //选了sign[i]
            List<Integer> next_list =  new LinkedList<>(list);
            next_list.add(nums[i]);
            //表示选了i
            find(nums,next_list,sign,depth+1);
            sign[i]= 0;
        }

    }




    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length == 0){
            return lists;
        }
        Arrays.sort(nums);
        List<Integer> list = new LinkedList<>();
        int[] sign = new int[nums.length];
        find(nums,list,sign,0);
        lists.size();
        return lists;
    }

    public static void main(String[] args){
        test_047 test = new test_047();
        int[] nums = {1,1,2};
        test.permuteUnique(nums);
    }
}
