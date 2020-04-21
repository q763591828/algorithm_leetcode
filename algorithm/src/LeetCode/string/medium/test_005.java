package LeetCode.string.medium;

public class test_005 {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        boolean[][] m = new boolean[s.length()][s.length()];
        for(int i = 0 ; i < s.length() ; ++i) m[i][i] = true;
        for(int i = s.length()- 1 ; i >= 0 ; --i ){
            for(int j = s.length() - 1 ; j > i ; --j ){
                if(s.charAt(i) != s.charAt(j) ){
                    m[i][j] = false;
                }else{
                    if(j-i == 1 ||m[i+1][j-1] == true)
                        m[i][j] = true;
                    else
                        m[i][j] = false;
                }
            }
        }
        int max = 1,b = 0 , e = 0;
        for(int i = 0 ; i < s.length() ; ++i){
            for(int j = i+1 ; j < s.length() ; ++j){
                if(m[i][j] == true){
                    if(j-i+1 > max){
                        max = j-i+1;
                        b = i;
                        e = j+1;
                    }
                }
            }
        }
        if(max == 1)
            return s.substring(0,1);
        else
            return s.substring(b,e);
    }

    public static void main(String[] args){
        test_005 test_005 = new test_005();
        test_005.longestPalindrome("a");
    }
}
