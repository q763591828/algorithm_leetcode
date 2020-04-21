package LeetCode.string.medium;

import java.util.*;

public class test_890 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        char c,p;
        for(String word : words){
            if(word.length()!=pattern.length())
                break;
            int sign = 0;
            for(int i= 0 ; i<word.length() ; i++){
                c = word.charAt(i);
                p = pattern.charAt(i);

                if(!map.containsKey(c)){
                    if(set.contains(p)){
                        sign=1;
                        break;
                    }else {
                        map.put(c, p);
                        set.add(p);
                    }
                }else {
                    if(!map.get(c).equals(p)){
                        sign=1;
                        break;
                    }
                }
            }
            if(sign == 0)
                list.add(word);
            map.clear();
            set.clear();
        }

        return list;
    }

    public static void main(String[] args){
        test_890 test = new test_890();
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        test.findAndReplacePattern(words,pattern);
    }
}
