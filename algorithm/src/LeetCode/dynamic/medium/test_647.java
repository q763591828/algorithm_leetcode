package LeetCode.dynamic.medium;

public class test_647 {

    public int countSubstrings(String s) {
        boolean[][] db = new boolean[s.length()][s.length()];
        int count = 0;
        for(int i = 0 ; i < s.length(); ++i){
            db[i][i] = true;
            ++count;
        }

        for(int i = s.length()-1; i >= 0 ; --i ){
            for(int j = s.length() - 1 ; j > i ; --j ){
                if(s.charAt(i) == s.charAt(j) && ( (j- i == 1) || db[i+1][j-1] == true) ){
                    db[i][j] = true;
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        test_647 test_647 = new test_647();
        test_647.countSubstrings("abc");
    }

}
