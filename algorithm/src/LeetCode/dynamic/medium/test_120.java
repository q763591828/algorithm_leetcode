package LeetCode.dynamic.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_120 {



    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();

        for(int i = size - 2; i >-1 ; i--){
            for(int j = 0; j < triangle.get(i).size() ; j++){
                int a = triangle.get(i+1).get(j);
                int b = triangle.get(i+1).get(j+1);
                int c = triangle.get(i).get(j);
                triangle.get(i).set(j,Math.min(a,b)+ c);
            }
        }

        return triangle.get(0).get(0);
    }

    public static void main(String[] args){
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(2));
        lists.add(Arrays.asList(3,4));
        lists.add(Arrays.asList(6,5,7));
        lists.add(Arrays.asList(4,1,8,3));
        test_120 test = new test_120();
        test.minimumTotal(lists);
    }
}
