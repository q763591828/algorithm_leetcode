package LeetCode.array.medium;

import java.util.ArrayList;
import java.util.List;

public class test_216 {
    List<List<Integer>> lists = new ArrayList<>();

    public void find(int index ,int rest_k,int rest_n, List<Integer> list){
        if(rest_n<0)
            return;
        if(rest_n==0 && rest_k == 0){
            lists.add(list);
            return;
        }

        if(index > 9)
            return;

        //选了index的数
        List<Integer> new_list = new ArrayList<>(list);
        new_list.add(index);
        find(index+1,rest_k-1,rest_n-index,new_list);
        //没有选index的数
        find(index+1,rest_k,rest_n,list);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        find(1,k,n,list);

        return lists;
    }

    public static void main(String[] args){
        test_216 test = new test_216();
        test.combinationSum3(3,9);
    }
}
