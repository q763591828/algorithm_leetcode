package LeetCode.dynamic.medium;

public class test_712 {

    public int minimumDeleteSum(String s1, String s2) {
        int r = s1.length() , c = s2.length();
        int[][] db = new int[r+1][c+1];
        for(int i = r-1 ; i >= 0 ; --i ) db[i][c] = db[i+1][c] + s1.charAt(i);
        for(int i = c-1 ; i >= 0 ; --i ) db[r][i] = db[r][i+1] + s2.charAt(i);

        for(int i = r-1 ; i >=0 ; --i){
            for(int j = c-1 ; j >= 0 ; --j){
                if(s1.charAt(i) == s2.charAt(j))
                    db[i][j] = db[i+1][j+1];
                else
                    db[i][j] = Math.min(db[i+1][j] + s1.charAt(i),db[i][j+1] + s2.charAt(j));
            }
        }

        return db[0][0];
    }

    public static void main(String[] args){
        test_712 test_712 = new test_712();
        test_712.minimumDeleteSum("delete","leet");
    }
}
