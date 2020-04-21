package LeetCode.other;

import java.util.LinkedList;
import java.util.List;

public class test_046 {

    public void find (int[] nums ,List<List<Integer>> lists,List<Integer> list, int[] sign ){
        int begin = 0;
        while (begin < sign.length){
            if(sign[begin++] == 0)  break;
        }
        if(begin==sign.length && sign[begin-1]==1){
            lists.add(list);
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){

            if(sign[i] == 1)    continue; //sign[i]=1表示该数已经选了

            sign[i] = 1; //选了sign[i]
            List<Integer> next_list =  new LinkedList<>(list);
            next_list.add(nums[i]);
            //表示选了i

            find(nums,lists,next_list,sign);
            sign[i]= 0;
        }

    }



    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return null;
        }

        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        int[] sign = new int[nums.length];
        find(nums,lists,list,sign);

        return lists;
    }

    public static void main(String[] args){
        test_046 test = new test_046();
        int [] nums = {};

        test.permute(nums);
    }
}
