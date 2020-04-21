package LeetCode.other;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test_040 {

    private List<List<Integer>> result = new LinkedList<>();

    public void findcombination(int[] candidates , int target , int tmp_i , List<Integer> tmp_list){
        if(target < 0)
            return;
        if(target == 0){
            //浅拷贝 当前tmp_list中的数据，避免在修改tmp_list中的数据的时候 间接的修改了result中的数据
            List<Integer> tmp_add = new LinkedList<>(tmp_list);
            if(!result.contains(tmp_add)){
                result.add(tmp_add);
            }
            return;
        }

        /*if(tmp_i >= candidates.length ||candidates[tmp_i] > target){
            return;
        }*/


        for(int i = tmp_i ; i < candidates.length ;i++){
            if(i>tmp_i){
                if(candidates[i] == candidates[i-1])
                    continue;
            }

            tmp_list.add(candidates[i]);
            int index_tmp = tmp_list.size()-1;
            findcombination(candidates,target-candidates[i] , i+1 ,tmp_list);
            tmp_list.remove(index_tmp);

        }

        /*tmp_list.add(candidates[tmp_i]);
        int index_tmp = tmp_list.size()-1;
        //要选择此刻的candidates坐标的数
        findcombination(candidates,target-candidates[tmp_i] , tmp_i+1 ,tmp_list);
        tmp_list.remove(index_tmp);
        //不选择

        if(candidates[tmp_i] == candidates[tmp_i+1] )
            return;
        else
            findcombination(candidates,target,tmp_i+1,tmp_list);*/

    }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> tmp_list = new LinkedList<>();

        findcombination(candidates,target,0,tmp_list);

        return result;
    }




    public static void main(String[] args){

        int[] candidates = {2,5,2,1,2};
        int target = 5;
        test_040 test = new test_040();
        test.combinationSum2(candidates  , target);

    }






}
