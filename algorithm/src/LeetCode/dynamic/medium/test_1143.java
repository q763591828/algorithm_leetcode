package LeetCode.dynamic.medium;

public class test_1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        int r = text1.length() , c = text2.length();
        int[][] db  = new int[r+1][c+1] ;
        for(int i = r-1 ; i>=0 ; --i){
            for(int j = c-1 ; j >=0 ; --j){
                if(text1.charAt(i) == text2.charAt(j))
                    db[i][j] = db[i+1][j+1] +1 ;
                else
                    db[i][j] = Math.max(db[i][j+1],db[i+1][j]) ;
            }
        }

        return db[0][0];
    }

    public static void main(String[] args){
        test_1143 test_1143 = new test_1143();
        test_1143.longestCommonSubsequence("abcde","ace");
    }
}
