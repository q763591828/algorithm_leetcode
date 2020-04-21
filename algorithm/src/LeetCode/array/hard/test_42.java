package LeetCode.array.hard;

import java.util.Map;
import java.util.Stack;

public class test_42 {

    public int trap(int[] height) {

        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int max_left = 0, max_right = 0;
            for (int j = i; j >= 0; j--) { //Search the left part for max bar size
                max_left = Math.max(max_left, height[j]);
            }
            for (int j = i; j < size; j++) { //Search the right part for max bar size
                max_right = Math.max(max_right, height[j]);
            }
            ans += Math.min(max_left, max_right) - height[i];
        }
        return ans;
/*
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i = 0 ; i< height.length ; i++){
            //当加入的高度比栈顶的高度小那么就直接入栈
            if( stack.isEmpty()||height[i] <= height[stack.peek()]){
                stack.push(i);
                continue;
            }
            //执行后续的前提是，处理的高度比栈顶高，所以要开始计算积水
            int min = Math.min(height[i],height[stack.get(0)]);
            //在栈为1的时候很明显没有积水,只要栈里面还有比当前的高度低的就要继续处理计算积水
            while(min > height[stack.peek()] && stack.size() > 1){


                int tmp_i = stack.peek(),pop_i=stack.pop();

                while (!stack.isEmpty() &&  height[tmp_i] ==  height[stack.peek()]){
                    pop_i = stack.pop();
                }
                tmp_i = stack.peek();
                int min_high = Math.min(height[tmp_i],height[i]);

                //int high = height[tmp_i] - height[pop_i];
                int high = min_high - height[pop_i];
                int wide = i - tmp_i - 1;
                ans += high * wide;
            }
            if(height[i] < height[stack.get(0)]){
                stack.push(i);
            }else {
                stack.removeAllElements();
                stack.push(i);
            }

        }

        return ans;*/

    }


    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height_1 = {0,6,0,0,0,6,8};
        int[] height_2 = {4,3,2,1,0,1,2,3,4};
        int[] height_3 = {4,2,3};
        int[] height_4 = {2,1,0,2};
        int[] height_5 = {3,1,0,0,3};
        int[] height_6 = {0};
        int[] height_7 = {1,2};
        int[] height_8 = {5,5,1,7,1,1,5,2,7,6};
        test_42 test = new test_42();
        int a = test.trap(height);      // 6
        int b = test.trap(height_1);    // 18
        int c = test.trap(height_2);    // 16
        int d = test.trap(height_3);    // 1
        int e = test.trap(height_4);    // 3
        int f = test.trap(height_5);    // 8
        int g = test.trap(height_6);    // 0
        int h = test.trap(height_7);    // 0
        int i = test.trap(height_8);    // 23


        return;
    }
}
