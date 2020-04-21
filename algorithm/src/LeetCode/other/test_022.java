package LeetCode.other;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test_022 {


    public static void combination(String s , int n_1, int n_2 ,int n, List <String> result){

        if(n_1 == 0 && n_2 == 0){
            result.add(s);
        }

        if(n_1>0){
            combination(s + "(",n_1-1,n_2,n,result);
        }

        if( n_2 >n_1){
            combination(s + ")",n_1,n_2 - 1,n ,result);
        }

    }


    public static List<String> generateParenthesis(int n) {

        List <String> result = new LinkedList<>();

        int n_1 = n , n_2 = n;
        String s = new String();
        combination(s , n_1 , n_2 ,n , result);

        return result;

    }

    public static void main(String[] args){
/*        String s = "123";
        s =s.substring(0,2);*/
        int n = 4;
        generateParenthesis(n);

    }
}
