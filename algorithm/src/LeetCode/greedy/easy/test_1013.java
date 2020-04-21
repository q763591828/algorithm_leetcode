package LeetCode.greedy.easy;

import java.util.*;

public class test_1013 {

    public boolean canThreePartsEqualSum(int[] A) {
        if (A == null || A.length < 3) return false;
        int sum =0;    // 求和
        for(int i = 0; i < A.length ; i++) {
            sum+=A[i];
        }
        // 不能整除也返回false
        if (sum % 3 > 0) return false;
        int target = sum / 3;   // 每个部分的和
        int partSum = 0;    // 当前部分的和
        int parts = 0;   //  当前已有几部分满足
        for (int i = 0; i < A.length; i++) {
            partSum += A[i];
            if (partSum == target) {
                parts++;
                partSum = 0;
            }
        }
        // 分析：flag >= 3的意思是，如果超过3个，而每部分的和还一样，证明有N个部分的和是0，可以归到任何一个部分中，最终结果可看做3个
        // 例如[1,-1,1,-1,1,-1,1,-1]，这里的flag = 4，但是可以把最后一个1,-1归到第三部分中，也就是[1,-1][1,-1][1,-1,1,-1]
        // 所以判断是成立的
        return parts >= 3;

    }

    public static void main(String[] args) {
        test_1013 test_1013 = new test_1013();
        int[] nums = {2,1,1,1,1,1,5,4,5};
        test_1013.canThreePartsEqualSum(nums);
        return;
    }
}
