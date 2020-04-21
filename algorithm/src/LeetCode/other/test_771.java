package LeetCode.other;

import java.util.LinkedList;
import java.util.List;

public class test_771 {
    public int numJewelsInStones(String J, String S) {
        int result= 0 ;
        List<Character> list_J = new LinkedList<>();
        for(int i = 0 ; i < J.length() ; i++){
            if(!list_J.contains(J.charAt(i)))   list_J.add(J.charAt(i));
        }
        for(int i = 0 ; i< S.length() ; i++){
            if(list_J.contains(S.charAt(i)))    result++;
        }

        return  result;
    }


    public static void main(String[] args){
        String J = "aA",S = "aAAbbbb";
        test_771 test = new test_771();
        test.numJewelsInStones(J,S);
    }
}
