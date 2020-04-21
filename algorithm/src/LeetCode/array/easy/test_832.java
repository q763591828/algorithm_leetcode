package LeetCode.array.easy;

public class test_832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int column_length = A.length;
        int row_length = A[0].length;
        for(int i = 0 ; i < column_length ; i++ ){
            for(int j = 0 ; j< row_length/2 ; j++){
                int tmp = A[i][j] ^ 1;
                A[i][j] = A[i][row_length-1-j]^1;
                A[i][row_length-1-j] = tmp;
            }
        }

        if(row_length%2==1){
            for(int i = 0 ; i< column_length ; i++){
                A[i][row_length/2] ^= 1;
            }
        }
        return  A;

    }
    
    
    public static void main(String[] args){
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        test_832 test = new test_832();
        test.flipAndInvertImage(A);

    }

}
