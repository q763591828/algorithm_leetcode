package LeetCode.dynamic.medium;

public class test_1277 {

    public int countSquares(int[][] matrix) {
        int r = matrix.length , c = matrix[0].length , res = 0 ;
        //int max = Math.max(r,c);
        /*for(int k = 1 ;  k < max ; k++){
            for(int i = k ; i< r; i++){
                for(int j = k ; j< c; j++){
                    if(matrix[i-1][j-1] >= k && matrix[i-1][j] >= k && matrix[i][j-1] >= k && matrix[i][j] >= k)
                        matrix[i][j] = k+1;
                    }
            }
        }*/

        int tmp;
        for(int i = 1 ; i< r; i++){
            for(int j = 1 ; j< c ; j++){
                if(matrix[i][j] == 0)
                    continue;
                tmp = Math.min(Math.min(matrix[i-1][j-1],matrix[i-1][j] ),matrix[i][j-1]);
                matrix[i][j]= tmp+1;
            }
        }

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                res += matrix[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args){
        test_1277 test_1277 = new test_1277();
        //int[][] m = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int[][] m = {{1,0,1},{1,1,0},{1,1,0}};
        test_1277.countSquares(m);
    }
}
