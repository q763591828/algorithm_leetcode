package LeetCode.dynamic.medium;

import java.util.Collections;

public class test_931 {

    private int[][] A;
    private int c;
    private int r;
    //private int[] results;

    /*public void findPathSum(int i,int j ,int sum){
        sum += A[i][j];
        if(i == r-1) {
            if(sum < min)
                min = sum;

            return ;
        }

        if(j>0){
             findPathSum(i+1,j-1,sum);
        }
        findPathSum(i+1,j,sum);

        if(j < c-1){
             findPathSum(i+1,j+1,sum);
        }
    }*/

    /*public int minFallingPathSum(int[][] A) {
        this.A = A;
        c = A[0].length;
        r = A.length;

        for(int i = 0 ; i< c; i++){
            findPathSum(0,i,0);
        }


        return min;
    }*/

    public int calculate(int i ,int j ){
        int a = 1000;
        if(j > 0 ){
            a = A[i+1][j-1];
        }
        int b = A[i+1][j];

        int c = 1000;
        if(j < this.c-1){
            c = A[i+1][j+1];
        }

        a=Math.min(a,b);
        return Math.min(a,c);

    }



    public int minFallingPathSum(int[][] A) {
        this.A = A;
        c = A[0].length;
        r = A.length;

        if(r > 1){
            for(int i = r-2; i >= 0 ; i--){
                for(int j = 0 ; j < c ; j++){
                    A[i][j] += calculate(i,j);
                }
            }
        }

        int min = 1000;
        for(int j = 0 ; j< c ; j++){
            if(A[0][j] < min)
                min = A[0][j];
        }

        return min;
    }


    public static void main(String[] args){
        //int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] A = {{17,82},{1,-44}};
        test_931 test_931 = new test_931();
        test_931.minFallingPathSum(A);
    }
}
