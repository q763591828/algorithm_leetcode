package LeetCode.match.match_184;

import java.util.ArrayList;
import java.util.List;

public class test_5380 {

    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        String s;
        String l;
        for(int i =0  ; i< words.length ; ++i){
            int length = words[i].length();
            for(int j = i+1 ;j  < words.length  ; ++j){
                if(length > words[j].length()){
                    s = words[j];
                    l = words[i];
                }else {
                    s = words[i];
                    l = words[j];
                }
                int sign = 0;
                for(int k = 0; k < l.length() ; ++k){
                    if(l.charAt(k) == s.charAt(0)){
                        for(int m = 0 ; m < s.length() ; ++m){
                            if(k+m >= l.length() || s.charAt(m) != l.charAt(k+m))
                                break;
                            if(m == s.length()-1){
                                if(!list.contains(s))
                                    list.add(s);
                                sign =1;
                            }
                        }
                    }
                    if(sign == 1)
                        break;
                }
            }
        }

        return list;
    }

    public static void main(String[] args){
        test_5380 test_5380 = new test_5380();
        String[] words = {"ga","ugao","dbh","a"};
        test_5380.stringMatching(words);
    }

}
