package LeetCode.matrix;

public class test_59 {

    public int[][] generateMatrix(int n) {
        /*int[][] matrix = new int[n][n];

        int end = n*n;
        int sign = 0;//sign = 0 时表示向右走， 1表示向下走 ， 2表示向左走，3表示向上走
        for(int i = 0,j=0,k=1 ; k <= end ; k++){
            if(matrix[i][j]== 0 ){
                matrix[i][j] = k;
                if(sign == 0) j++;
                else if(sign == 1) i++;
                else if(sign == 2) j--;
                else i--;
            }
            // 此时 matrix[i][j] == 1
            if( i>=n || i<0 || j>=n || j<0 ||matrix[i][j]!= 0 ){
                if(sign==0){
                    sign=1;
                    j--;
                    i++;
                }
                else if(sign == 1){
                    sign=2;
                    i--;
                    j--;
                }
                else if(sign == 2){
                    sign=3;
                    j++;
                    i--;
                }
                else{
                    sign=0;
                    i++;
                    j++;
                }
            }
        }
        return matrix;*/

        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++) mat[t][i] = num++; // left to right.
            t++;
            for(int i = t; i <= b; i++) mat[i][r] = num++; // top to bottom.
            r--;
            for(int i = r; i >= l; i--) mat[b][i] = num++; // right to left.
            b--;
            for(int i = b; i >= t; i--) mat[i][l] = num++; // bottom to top.
            l++;
        }
        return mat;


    }

    public static void main(String[] args){
        test_59 test = new test_59();
        test.generateMatrix(3);

    }

}
