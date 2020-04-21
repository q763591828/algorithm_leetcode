package LeetCode.other;

import java.util.*;

public class test_017 {

    /*public static Map<Character,List<String>> map = new HashMap<>();

    public static List<String> combination_detail(String digits ,List<String> list_left , List<String> list_right){

        List<String> combin_list = new LinkedList<>();

        for(int i = 0 ; i< list_left.size() ; i++){
            for(int j  = 0 ; j < list_right.size();j++){
                combin_list.add( list_left.get(i) + list_right.get(j));
            }
        }
        return combin_list;
    }



    public static List<String> combination(String digits,int n , int left ,int right ){
        List<String> combin_list = new LinkedList<>();

        if(left == right){
            combin_list = map.get(digits.charAt(left));
        }else if(left < right){
            int mid = (left + right) / 2;
            List list_left = combination(digits , n , left ,mid);
            List list_right = combination(digits , n , mid+ 1 , right);
            combin_list = combination_detail(digits , list_left , list_right );
        }

        return combin_list;

    }


    public static List<String> letterCombinations(String digits) {
        map.put('2',Arrays.asList("a","b","c"));
        map.put('3',Arrays.asList("d","e","f"));
        map.put('4',Arrays.asList("g","h","i"));
        map.put('5',Arrays.asList("j","k","l"));
        map.put('6',Arrays.asList("m","n","o"));
        map.put('7',Arrays.asList("p","q","r","s"));
        map.put('8',Arrays.asList("t","u","v"));
        map.put('9',Arrays.asList("w","x","y","z"));

        int n = digits.length();

        return combination(digits , n , 0 , n-1);
    }*/
    public static Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public  static List<String> output = new ArrayList<String>();

    public static void backtrack(String combination, String next_digits) {
        // if there is no more digits to check
        if (next_digits.length() == 0) {
            // the combination is done
            output.add(combination);
        }
        // if there are still digits to check
        else {
            // iterate over all letters which map
            // the next available digit
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                // append the current letter to the combination
                // and proceed to the next digits
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }




    public static void main(String[] args){

        String digits = "234";

        letterCombinations(digits);
    }
}
