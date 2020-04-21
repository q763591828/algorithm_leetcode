package Offer;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.*;

public class Offer_54 {

    Map<Character,Integer> map = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else {
            map.put(ch,1);
            list.add(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i = 0 ; i < list.size() ; i++){
            char tmp = list.get(i);
            if(map.get(tmp) == 1)
                return tmp;
        }
        return '#';
    }

    public static void main(String[] args){
        Offer_54 offer_54 = new Offer_54();
        String s = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i++){
            offer_54.Insert(s.charAt(i));
            sb.append(offer_54.FirstAppearingOnce());
        }

        char r = offer_54.FirstAppearingOnce();
        return;
    }
}
