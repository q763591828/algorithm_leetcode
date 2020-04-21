package LeetCode.string.easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test_409 {

    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char c;
        int counter=0 , tmp = 0 , sign = 0;
        for(int i = 0 ; i < s.length() ; ++i ){
            c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if(tmp%2 == 0){
                counter += tmp;
            }else {
                sign = 1;
                counter += tmp - 1;
            }
        }
        if(sign == 1)
            return ++counter;
        else
            return counter;
    }

    public static void main(String[] args){
        test_409 test_409 = new test_409();
        test_409.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
    }


}
