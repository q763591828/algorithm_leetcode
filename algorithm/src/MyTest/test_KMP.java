package MyTest;

public class test_KMP {

    // 构造模式串 pattern 的最大匹配数表
    public String longestPrefix(String s) {
        int len = s.length();
        int[] next = new int[s.length()];
        for(int i = 2, j = 0;i <= len;i++){
            while(j != 0 && s.charAt(i - 1) != s.charAt(j))
                j = next[j - 1];
            if(s.charAt(i - 1) == s.charAt(j))
                j++;
            next[i - 1] = j;
        }
        return s.substring(0, next[len - 1]);
    }

    public static void main(String[] args){
        test_KMP test_kmp = new test_KMP();
        String res=test_kmp.longestPrefix("level");
        return;
    }
}
