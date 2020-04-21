package LeetCode.greedy.easy;

public class test_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        for(int i = 0 ; i < gas.length ; i++){
            cost[i] = gas[i]-cost[i];
        }

        int sign = -1,sum = 0,all_sum =0;
        for(int i = 0 ; i < gas.length ; i++){
            all_sum+=cost[i];
            sum+=cost[i];
            if(sum < 0 ){
                sign=-1;
            }else {
                if(sign==-1)
                    sign = i;
            }
            if(sum <0){
                sum = 0;
            }
        }

        if(all_sum <0)
            return -1;
        else{
            return sign;
        }
    }

    public static void main(String[] args){
        test_134 test = new test_134();
        /*int gas[] = {2,3,4};
        int cost[] = {3,4,3};*/
        int []gas={3,1,1};
        int [] cost = {1,2,2};
        test.canCompleteCircuit(gas,cost);
    }
}
