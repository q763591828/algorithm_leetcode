package LeetCode.math;

import java.util.ArrayList;
import java.util.List;

public class test_60 {
    //private String ans = new String();



    public String getPermutation(int n, int k) {

        String ans = new String();
        List<Integer> list = new ArrayList<>();

        int now_n_fact = 1,tmp_n = n-1,res_n = k,sign =0;

        for(int i = 1 ; i< n ;  i ++){
            list.add(i);
            now_n_fact *= i;
        }
        list.add(n);

        for(int i = 0 ; i< n ; i++){
            int index = (res_n-1)/now_n_fact;
            ans += list.get(index);
            list.remove(index);

            res_n = res_n % now_n_fact;
            if(res_n == 0){
                sign = 1;
                break;
            }

            now_n_fact /= tmp_n;
            tmp_n--;
        }

        if(sign == 1){
            for(int i = list.size()-1 ; i >= 0 ; i--){
                ans+= list.get(i);
            }
        }

        return ans;



    }


    public static void main(String[] args){
        test_60 test = new test_60();
        int n = 4, k = 9;
        test.getPermutation(4,10);




    }
}
