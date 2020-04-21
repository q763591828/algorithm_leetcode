package LeetCode.array.easy;

public class test_121 {

    public int maxProfit(int[] prices) {
        /*
         * 1、如果到达点比之前买入点还要小修改买入点 进入下一次循环
         * 2、没有比买入点小，则比较 它与买入点的差是否大于 max
         *      1）如果大于max则修改max
         *      2）不做任何处理
         */
        int max = 0;
        int min_buy = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length ; ++i ){
            if(prices[i] < min_buy){
                min_buy = prices[i];
            }else {
                int sub = prices[i] - min_buy;
                if(sub > max){
                    max = sub;
                }
            }
        }

        return max;
    }

    public static void main(String[] args){
        test_121 test_121 = new test_121();
        //int[] nums = {7,1,5,3,6,4};
        int[] nums = {100,1,2,9,4,5,10};
        //int[] nums = {7,6,4,3,1};
        test_121.maxProfit(nums);
    }
}
