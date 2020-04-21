package LeetCode.array.easy;

import java.util.*;

public class test_977 {

    public int[] sortedSquares(int[] A) {
        List<Integer> list = new ArrayList<>();
        for(int a : A){
            list.add(a*a);
        }

        Collections.sort(list);
        for(int i = 0 ; i< A.length ;i++){
            A[i] = list.get(i);
        }

        return A;
    }

    public static void main(String[] args){
        test_977 test = new test_977();
        int[]A={-4,-1,0,3,10};
        test.sortedSquares(A);
    }
}
