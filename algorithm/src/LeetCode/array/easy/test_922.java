package LeetCode.array.easy;

import java.util.*;

public class test_922 {

    public int[] sortArrayByParityII(int[] A) {
        List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
        for(int a : A){
            if(a%2 == 1) odd.add(a);
            else even.add(a);
        }
        Collections.sort(odd);
        Collections.sort(even);

        for(int i = 0 ; i<A.length/2 ; i++){
            A[i*2] = even.get(i);
            A[i*2+1] = odd.get(i);
        }
        return A;

    }

    public static void main(String[] args){
        test_922 test = new test_922();
        int[] A = {4,2,5,7};
        test.sortArrayByParityII(A);

    }
}
