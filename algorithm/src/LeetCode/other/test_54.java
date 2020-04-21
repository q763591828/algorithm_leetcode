package LeetCode.other;

import java.util.LinkedList;
import java.util.List;

public class test_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if(matrix.length ==0)   return list;

        int length = matrix[0].length;
        int wide = matrix.length;

        if(length==1){
            for(int i = 0 ; i< wide ; i++){
                list.add(matrix[i][0]);
            }
            return list;
        }
        if(wide == 1){
            for(int i = 0 ; i< length ; i++){
                list.add(matrix[0][i]);
            }
            return list;
        }

        for(int k_l = 0, k_w = 0; k_l < (length+1)/2 && k_w < (wide+1)/2; k_l++ , k_w++){
            for(int i = 0+k_w,j=0+k_l ; j<length-1-k_l ; j++){
                list.add(matrix[i][j]);
            }
            for(int i = 0+k_w  , j=  length-1-k_l; i < wide-1-k_w; i++ ){
                list.add(matrix[i][j]);
            }
            for(int i = wide-1-k_w , j = length-1-k_l ; j > 0+k_l ; j--){
                list.add(matrix[i][j]);
            }
            for(int i = wide-1-k_w , j= 0+k_l ; i > 0+k_w ; i--){
                list.add(matrix[i][j]);
            }
        }

        if(length == wide && length%2 == 1) list.add(matrix[wide/2][length/2]);

        return list;
    }

    public static void main(String[] args){

        int[][] matrix = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,11,12},
                {13,14,15,16}
        };

        int[][] matrix_2 = {
                {1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int[][] martix_3 = {{6,9,7}};

        int[][] martix_4 = {{1},
                            {2},
                {3},

        };
        test_54 test = new test_54();
        test.spiralOrder(matrix_2);


    }
}
