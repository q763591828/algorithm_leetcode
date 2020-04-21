package LeetCode.other;

public class test_048 {

    public void rotate(int[][] matrix) {
        int end = matrix.length - 1;

        for(int k = 0 ; k < matrix.length/2 ; k++){
            for(int i = 0 ; i< end-2*k; i++){
                int tmp = matrix[0+k][0+i+k];
                matrix[0+k][0+i+k] = matrix[end-i-k][0+k];
                matrix[end-i-k][0+k] = matrix[end-k][end-i-k];
                matrix[end-k][end-i-k] = matrix[0+i+k][end-k];
                matrix[0+i+k][end-k] = tmp;


            }

            /*for(int i = 0+k ; i< end-k; i++){
                int tmp = matrix[0+k][0+i+k];
                matrix[0+k][0+i+k] = matrix[end-i-k][0+k];
                matrix[end-i-k][0+k] = matrix[end-k][end-i-k];
                matrix[end-k][end-i-k] = matrix[0+i+k][end-k];
                matrix[0+i+k][end-k] = tmp;


            }
*/

        }


        /*for(int i = 0 ; i< end; i++){
            int tmp = matrix[0][0+i];
            matrix[0][0+i] = matrix[end-i][0];
            matrix[end-i][0] = matrix[end][end-i];
            matrix[end][end-i] = matrix[0+i][end];
            matrix[0+i][end] = tmp;


        }*/
        /*for(int i = 0 ; i<=end ; i++){
            for(int j = 0 ; j<=end ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/

        return;
    }
    
    
    public static void main(String[] args){

        int[][] marix = {
                {1, 2, 3, 4, 5 , 6},
                {7, 8, 9,10, 11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
        };

        int[][] marix_2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] marix_3={
                {1, 2, 3, 4, 5},
                {6, 7 ,8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        int[][] marix_4={{1}};

        test_048 test = new test_048();
        test.rotate(marix_4);
    }



    
    
}
