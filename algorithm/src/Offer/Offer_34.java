package Offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Offer_34 {
    public int FirstNotRepeatingChar(String str) {

        /*if(str == null || str.length()==0) return -1;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!list.contains(ch)){
                list.add(Character.valueOf(ch));
            }else{
                list.remove(Character.valueOf(ch));
            }
        }
        if(list.size() <=0) return -1;
        return str.indexOf(list.get(0));*/


        if(str.equals(""))
            return -1;
        Map<Character,Integer> map = new HashMap<>();
        for(int i= 0 ; i <str.length() ; i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for(int i = 0 ; i < str.length() ; i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Offer_34 offer_34 = new Offer_34();
        String s = "google";
        offer_34.FirstNotRepeatingChar(s);
    }
}
