package LeetCode.dynamic.easy;

import java.util.*;

public class test_784 {

    List<String > ans  = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public boolean islower(char c){
        if(c >='a' && c<='z')
            return true;
        else
            return false;
    }

    public boolean isUpper(char c){
        if( c>='A' && c<='Z')
            return true;
        else
            return false;
    }

    public void findList(int i,StringBuilder s){
        if(i >= list.size()){
            ans.add(s.toString());
            return;
        }

        int index = list.get(i);
        char c = s.charAt(index);
        if(c >='a'&& c<='z'){
            c= (char)(c-'a'+'A');
        }else
            c = (char)(c-'A'+'a');

        StringBuilder tmp_s = new StringBuilder(s);
        s.setCharAt(index,c);
        findList(i+1,tmp_s);
        findList(i+1,s);
    }


    public List<String> letterCasePermutation(String S) {
        StringBuilder s = new StringBuilder(S);
        for(int i = 0 ; i < S.length() ; i++){
            /*if(islower(S.charAt(i)) || isUpper(S.charAt(i)))
                list.add(i);*/
            char c=S.charAt(i);
            if((c >='a' && c<='z') || (c >='A' && c <='Z'))
                list.add(i);
        }
        findList(0,s);
        return ans;
    }

    public static void main(String[] args){
        test_784 test = new test_784();
        String S = "a1b2";
        test.letterCasePermutation(S);
    }
}
