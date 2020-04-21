package LeetCode.array.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test_1046 {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> list = new LinkedList<>();
        for(int stone : stones) list.add(stone);

        for(int i = list.size()-1 ; i>= 1 && list.size()>=2 ; i =list.size()-1){
            int stone_1 = list.get(i);
            int stone_2 = list.get(i-1);
            int res_stone = 0;
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            if(stone_1> stone_2){
                res_stone = stone_1 - stone_2;
            }else if(stone_2> stone_1){
                res_stone = stone_2 - stone_1;
            }else continue;

            for(int j = 0 ; j < list.size() ; j++){
                if(j==list.size()-1 || list.get(j) > res_stone){
                    list.add(j,res_stone);
                    break;
                }
            }
            if(list.size() == 0 && res_stone != 0 ) list.add(res_stone);
        }

        if(list.size()==0) return 0;
        else return  list.get(0);


    }


    public static void main(String[] args){
        int[] stones = {1};
        test_1046 test = new test_1046();
        test.lastStoneWeight(stones);

    }
}
