package LeetCode.string.easy;

public class test_1071 {

    public int gcd(int a, int b){
        int tmp = 0 ;
        while (b!=0){
            tmp = b;
            b=a%b;
            a = tmp;
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int max = Math.max(str1.length(),str2.length());
        int min = Math.min(str1.length(),str2.length());
        return str1.substring(0,gcd(max,min));
    }

    public static void main(String[] args){
        test_1071 test_1071 = new test_1071();
        String str1 = "ABCABC";
        String str2 = "ABC";
        String res = test_1071.gcdOfStrings(str1,str2);
        return;
    }
}
