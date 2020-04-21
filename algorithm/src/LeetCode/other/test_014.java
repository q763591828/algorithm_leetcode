package LeetCode.other;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class test_014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        else if (strs.length == 1)
            return strs[0];

        String result = new String();
        for(int i = 0 ; i< strs[0].length() ;i ++){
            int j = 1;
            while (j < strs.length){
                if(i > strs[j].length() -1 ){ //后面的字符串有长度小于第一个字符串的情况
                    return result;
                }
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    return result;
                }
                if( j == strs.length -1 ){
                    result += strs[0].charAt(i);
                }
                j++;
            }

        }
        return result;
    }


    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"dog","do","dos"};
        String [] strs2 = {"a"};

        int i  =strs[1].indexOf(strs[0]);

        String str = longestCommonPrefix(strs);

        return;

    }
}
