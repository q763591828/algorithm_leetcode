package LeetCode.other;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class test_039 {

    public static void findcombine(int[] candiates , int target , List<List<Integer>> result , List<Integer> list_tmp , int tmp_i){

        if(target == 0) {
            //list的浅拷贝
            List add_list = new LinkedList(list_tmp);
            //Collections.copy(add_list,list_tmp);
            result.add(add_list);
            return;
        }

        for(int i = tmp_i ; i < candiates.length ; i++){

            if(target - candiates[i] >= 0){
                list_tmp.add(candiates[i]);
                int tmp_index  = list_tmp.size()-1;
                findcombine(candiates, target - candiates[i], result,list_tmp , i);
                list_tmp.remove(tmp_index);
            }else {
                break;
            }
        }


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> list_tmp = new LinkedList<>();

        findcombine(candidates,target,result,list_tmp,0);

        return result;


    }


    public static void main(String[] args){
        int [] candidates = {2,3,6,7};
        int target = 7;

        combinationSum(candidates,target);

    }
}
