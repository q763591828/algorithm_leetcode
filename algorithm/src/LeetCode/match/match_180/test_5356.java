package LeetCode.match.match_180;

import java.util.ArrayList;
import java.util.List;

public class test_5356 {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int r = matrix.length , c = matrix[0].length;
        int[] row =new int[r] , column = new int[c];
        int tmp = Integer.MAX_VALUE , s_i = 0 , s_j = 0;
        for(int i = 0   ; i < r ; i++){
            tmp = Integer.MAX_VALUE;
            for(int j = 0; j < c ; ++j ){
                if(matrix[i][j] < tmp){
                    tmp = matrix[i][j];
                    s_j = j ;
                }
            }
            row[i] = s_j;
        }


        for(int j =0 ; j < c ; j++){
            tmp = Integer.MIN_VALUE;
            for(int i =0; i < r ; i++){
                if(matrix[i][j] > tmp){
                    tmp = matrix[i][j];
                    s_i = i;
                }
            }
            column[j] = s_i;
        }

        for(int i = 0 ; i < r ; i++){
            if(column[row[i]] == i){
                l.add(matrix[i][row[i]]);
            }

        }


        return l;



    }

    public static  void main(String[] args){
        test_5356 test_5356 = new test_5356();
        //int[][] m = {{3,7,8},{9,11,13},{15,16,17}};
        //int[][] m = {{7,8},{1,2}};
        int[][] m ={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        test_5356.luckyNumbers(m);
    }
}
