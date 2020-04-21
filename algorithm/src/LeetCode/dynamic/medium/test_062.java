package LeetCode.dynamic.medium;

public class test_062 {
    private int[][] db;
    private int[][] map;
    private int m;
    private int n;

    public int uniquePaths(int m, int n) {

        this.db = new int[n][m];

        for(int i = 0;i<m;i++){
            db[n-1][i] = 1;
        }
        for(int i=0;i<n;i++){
            db[i][m-1] = 1;
        }

        for(int i = n-2; i > -1 ;i--){
            for(int j = m-2 ; j >-1; j--){
                db[i][j] = db[i][j+1] + db[i+1][j];
            }
        }
        return db[0][0];
    }

    public static void main(String[] args){
        test_062 test = new test_062();
        test.uniquePaths(2,2);
    }
}
