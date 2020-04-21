package LeetCode.other;

public class test_011
{

    public static int maxArea(int[] height) {
        int begin = 0,end = height.length-1,max = 0;
        while (begin != end){
            int tmp = (end-begin) * Math.min(height[begin],height[end]);
            if( max < tmp)
                max = tmp;

            if(height[begin] <= height[end])
                begin++;
            else
                end--;
        }
        return max;
    }

    public static void main(String[] args){

        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }
}
