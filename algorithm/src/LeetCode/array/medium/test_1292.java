package LeetCode.array.medium;

public class test_1292 {

    int[][] p;
    public int getRec(int x1 , int x2 , int y1 , int y2){
        return p[x2][y2] - p[x1-1][y2] - p[x2][y1-1] + p[x1-1][y1-1];
    }

    public int maxSideLength(int[][] mat, int threshold) {
        int r = mat.length, c = mat[0].length;
        p = new int[r+1][c+1];
        p[1][1] = mat[0][0];
        for(int i = 1 ; i <= r;i++){
            for(int j = 1 ; j <= c ; j++){
                p[i][j] = mat[i-1][j-1] + p[i-1][j] + p[i][j-1] - p[i-1][j-1];
            }
        }
        int l = Math.min(r,c) , ans = 0;
        for(int i = 1 ; i <= r ; ++i){
            for(int j = 1 ; j<= c ; ++j){
                for(int k = ans+1; k <= c ; ++k ){
                    if( i+ k -1 <= r && j +k -1 <= c && getRec(i,i+k-1,j,j+k-1) <= threshold){
                        ++ans;
                    }else {
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        test_1292 test_1292 = new test_1292();
        int[][] mat = {{1,1,3,2,4,3,2},{1,1,3,2,4,3,2},{1,1,3,2,4,3,2}};
        test_1292.maxSideLength(mat,4);
    }
}
