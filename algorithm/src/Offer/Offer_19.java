package Offer;

import java.util.ArrayList;

public class Offer_19 {

    int i = 0 , j = 0;
    int r;
    int c;
    int move;
    int[][] sign_m;
    // move 为 1 右移  2 下移 3 左移 4 上移
    public void findnext(int s_move){
        if(s_move == 1) {
            if( j == c-1 || sign_m[i][j+1]==1 ){
                i++;
                move = 2;
            }else {
                j++;
                move = 1;
            }

        } else if(s_move == 2) {
            if( i == r-1 ||sign_m[i+1][j] == 1  ){
                j--;
                move = 3;
            }else {
                i++;
                move = 2;
            }
        } else if(s_move == 3){
            if( j == 0 || sign_m[i][j-1] == 1  ){
                i--;
                move = 4;
            }else {
                j--;
                move = 3;
            }

        } else {
            if( i == 0  || sign_m[i-1][j] == 1){
                j++;
                move = 1;
            }else {
                i--;
                move = 4;
            }
        }

        if(i < 0 || i > r-1 || j <0 || j > c-1 || sign_m[i][j] == 1)
            move = 0;

    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null)
            return null;

        r = matrix.length;
        c = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        sign_m = new int[r][c];

        move = 1;

        while (true){
            if(sign_m[i][j]==0){
                sign_m[i][j] = 1;
                list.add(matrix[i][j]);
                findnext(move);
                if(move == 0)
                    break;
            }
        }

        return list;



    }

    public static void main(String[] args){
        Offer_19 offer_19 = new Offer_19();
        //int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1}};
        ArrayList a = offer_19.printMatrix(matrix);
        return;
    }
}
