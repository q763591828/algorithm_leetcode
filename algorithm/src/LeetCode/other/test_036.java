package LeetCode.other;

import java.util.*;

public class test_036 {

    public static boolean isValidSudoku(char[][] board) {

        List<List<Character>> lists_row = new LinkedList<>() , lists_column = new LinkedList<>() , lists_matrix = new LinkedList<>();
        for( int i = 0 ; i < board.length ; i++){
            lists_row.add( new LinkedList<>());
            lists_column.add(new LinkedList<>());
            lists_matrix.add(new LinkedList<>());
        }
        //Map<Integer,Character> map_row = new HashMap<>(), map_column = new HashMap<>() , map_matrix = new HashMap<>();

        for(int i = 0 ; i< board.length ; i++){
            for(int j = 0 ; j<board.length ; j++){

                if(board[i][j] == '.')
                    continue;   //在一开始的时候如果该元素是 . 则跳出循环
                else if(lists_row.get(i).contains(board[i][j]))  //查看第i行第j列是否含有此元素
                    return false;
                else
                    lists_row.get(i).add(board[i][j]);


                if(lists_column.get(j).contains(board[i][j]))
                    return false;
                else
                    lists_column.get(j).add(board[i][j]);


                //i/3 * 3  + j/3 块索引公式
                int index = i/3*3 + j/3 ;
                if(lists_matrix.get(index).contains(board[i][j]))
                    return false;
                else
                    lists_matrix.get(index).add(board[i][j]);

            }
        }

        return true;
    }

    public static void main(String[] args){



        char[][] board ={
                          {'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}
                        };

        char[][] board_2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}

        };
        

        isValidSudoku(board_2);
    }
}
