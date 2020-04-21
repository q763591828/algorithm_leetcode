package LeetCode.other;

import java.util.HashMap;
import java.util.Map;

public class test_013 {

    public static int romanToInt(String s) {
        int result = 0;

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i = 0 ; i < s.length();i++){
            if(i != s.length() -1){
                if( s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                    result += 4;
                    i++;
                }else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                    result += 9;
                    i++;
                }else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                    result += 40;
                    i++;
                }else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                    result += 90;
                    i++;
                }else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                    result += 400;
                    i++;
                }else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                    result += 900;
                    i++;
                }else {
                    result += map.get(s.charAt(i));
                }

            }else {
                result += map.get(s.charAt(i));
            }


        }

        return result;
    }




    public static void main(String[] args){

        String s = "MCMXCIV";
        System.out.println(s.charAt(0));

        romanToInt(s);
        //maxArea(height);
    }
}
