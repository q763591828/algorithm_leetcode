package LeetCode.array.medium;

public class test_1314 {


    int[][] p;
    int r;
    int c;

    public int getrec(int i, int j){
        i = Math.max(Math.min(i,r),0);
        j = Math.max(Math.min(j,c),0);
        return p[i][j];
    }

    public int[][] matrixBlockSum(int[][] mat, int K) {
        r = mat.length;
        c = mat[0].length;
        p = new int[r+1][c+1];
        int[][] res = new int[r][c];
        for(int i = 1 ; i <= r;i++){
            for(int j = 1 ; j <= c ; j++){
                p[i][j] = mat[i-1][j-1] + p[i-1][j] + p[i][j-1] - p[i-1][j-1];
            }
        }
        for(int i = 0; i < r ; i++){
            for(int j = 0 ; j< c ; j++){
                res[i][j] = getrec(i+K+1,j+K+1) - getrec(i-K,j+K+1) -getrec(i+K+1,j-K) + getrec(i-K,j-K);
            }
        }

        return res;



    }

    public static void main(String[] args){
        test_1314 test_1314 = new test_1314();
        int[][] mat = {{1,2,3},{1,2,3},{1,2,3}};
        test_1314.matrixBlockSum(mat,1);
    }
}
