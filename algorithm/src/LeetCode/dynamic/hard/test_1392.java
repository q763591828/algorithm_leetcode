package LeetCode.dynamic.hard;

public class test_1392 {

    /*public String longestPrefix(String s) {
        int[] dp=new int[s.length()+1];
        dp[0]=-1;
        for(int i=1;i<=s.length();i++){
            //当前字符
            char c=s.charAt(i-1);
            //待比较的最长快乐前缀的后一位
            int k=dp[i-1];
            while(k>=0&&c!=s.charAt(k)){
                k=dp[k];
            }
            dp[i]=k+1;
        }
        return s.substring(0,dp[s.length()]);
    }*/

    public String longestPrefix(String s) {
        int[] dp = new int[s.length()];
        for(int i = 1; i < s.length() ; ++i){
            int t = dp[i-1];
            while (  t>= 0 && s.charAt(t) != s.charAt(i)){
                if( t== 0 ){ //说明要出去了，最后进行一次标志处理
                    break;
                }
                t= dp[t-1];

            }

            if(s.charAt(t) == s.charAt(i))
                dp[i] = t+1;
        }
        return s.substring(0,dp[s.length()-1]);
    }

    public static void main(String[] args){
        test_1392 test_1392 = new test_1392();
        String s = test_1392.longestPrefix("ababab");
        return;
    }
}
