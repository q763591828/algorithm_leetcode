package LeetCode.match.match_185;

import java.util.ArrayList;
import java.util.List;

public class test_5388 {
    public String reformat(String s) {
        List<Character> l_c = new ArrayList<>();
        List<Character> l_n = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c >=  'a' && c <= 'z')
                l_c.add(c);
            else
                l_n.add(c);
        }
        List<Character> l_1 = l_n;
        List<Character> l_2 = l_c;
        if(l_c.size() > l_n.size()){
            l_1 = l_c;
            l_2 = l_n;
        }
        if(l_1.size() - l_2.size() > 1){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < l_1.size() ; ++i){
            sb.append(l_1.get(i));
            if(i < l_2.size())
                sb.append(l_2.get(i));
        }

        return sb.toString();

    }

    public static void main(String[] args){
        test_5388 test_5388 = new test_5388();
        String s = "covid2019";
        test_5388.reformat(s);
    }
}
