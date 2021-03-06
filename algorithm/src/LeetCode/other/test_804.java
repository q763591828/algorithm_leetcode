package LeetCode.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test_804 {

    public int uniqueMorseRepresentations(String[] words) {
        Map<Character,String>  map = new HashMap<>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");

        Set<String> set = new HashSet<>();

        for(String word : words){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0 ; i < word.length() ; i++){
                stringBuilder.append(map.get(word.charAt(i)));
            }
            set.add(stringBuilder.toString());

        }
        return set.size();
    }

    public static void main(String[] args){
        String[] words = {"gin", "zen", "gig", "msg"};
        test_804 test = new test_804();
        test.uniqueMorseRepresentations(words);




    }

}
