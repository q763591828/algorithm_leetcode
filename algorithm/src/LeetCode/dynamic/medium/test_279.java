package LeetCode.dynamic.medium;

public class test_279 {

    int[][] db;
    int[] sq ;


    public int solve(int i , int j ){
        if(i < 1)
            return db[0][j];
        if(j < 0) {
            return 1000;
        }

        if(db[i][j] != 0 || j == 0)
            return db[i][j];

        int a = solve(i-1,j);
        int b = solve(i,j-sq[i])+1;
        db[i][j] = Math.min(a,b);

        return db[i][j];
    }

    public int numSquares(int n) {
        int sign =0;
        int t = (int)Math.sqrt(n)+1;
        sq = new int[t];
        db = new int[t][n+1];
        for(int j = 0 ; j < db[0].length ; j++){
            db[0][j] = j;
        }

        for(int i = 0 ; i < db.length ; i++){
            db[i][1] = 1;
            sq[i] = (i+1)*(i+1);
            if(sq[i] == n) {
                sign = i;
                break;
            }else if(sq[i] > n){
                sign = i-1;
            }
        }
        int result = solve(sign,n);
        return result;


    }


    public static void main(String[] args){
        test_279 test_279 = new test_279();
        test_279.numSquares(10000);
    }
}
