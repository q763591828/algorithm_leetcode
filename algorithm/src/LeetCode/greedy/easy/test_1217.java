package LeetCode.greedy.easy;

public class test_1217 {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0,even = 0;
        for(int i = 0 ; i < chips.length ; i++){
            if(chips[i]%2 ==1)
                odd++;
            else
                even++;
        }
        return Math.min(odd,even);
    }
}
