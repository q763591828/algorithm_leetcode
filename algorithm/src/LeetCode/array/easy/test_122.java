package LeetCode.array.easy;

public class test_122 {

    public int maxProfit(int[] prices) {
        /*
         * 1、如果当前的数字小于上一个数字，
         *      那么就将pre数字替换为当前的数字
         * 2、如果当前的数字大于上一个数字，那么使用 pre_sum = prices[i] - pre 来做累加统计
         */
        int begin = Integer.MAX_VALUE,pre_sum = 0 , sum = 0 ,pre=Integer.MAX_VALUE;

        for(int i = 0 ;i < prices.length ; i++){
            if(pre > prices[i]){
                begin = prices[i];
                sum+= pre_sum;
                pre_sum =0;
            }else {
                pre_sum = prices[i] - begin;
            }
            pre = prices[i];
        }
        if(pre_sum!=0)
            sum+=pre_sum;

        return sum;
    }

    public static void main(String [] args){
        test_122 test_122 = new test_122();
        int[] nums = {5,4,3,2};
        test_122.maxProfit(nums);
    }
}
