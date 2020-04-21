package LeetCode.other;

public class test_038 {

    public static String countandsay(String s){

        String result = new String();
        int sum = 1;
        for(int i = 1 ; i <= s.length() ;i++ ){
            if (i==s.length()) {
                result = result + String.valueOf(sum) + s.charAt(i - 1);
                return result;
            }
            if( s.charAt(i) == s.charAt(i-1)){
                sum ++;
            }else {
                result = result + String.valueOf(sum) + s.charAt(i-1);
                sum = 1;
            }

        }

        return result;
    }

    public static String countAndSay(int n) {

        String tmp = "1";
        for(int i = 1 ; i <= n-1 ; i++){
            tmp = countandsay(tmp);
        }

        return tmp;
    }

    public static void main(String[] args){

        int n = 2;
        countAndSay(n);

    }


}
