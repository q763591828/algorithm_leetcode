package LeetCode.string.medium;

public class test_079 {

    private char[][] board ;
    private int[][] sign_b;
    private String word;
    private int row;
    private int column;
    public boolean find(int i , int j ,int index){
        if(index == word.length())
            return true;
        //上
        if(i>0 && sign_b[i-1][j] == 0) {
            if (board[i - 1][j] == word.charAt(index)){
                sign_b[i-1][j]=1;
                if(find(i-1,j,index+1)== true)
                    return true;
                else
                    sign_b[i-1][j]=0;
            }
        }
        //右
        if(j < column-1 && sign_b[i][j+1] == 0){
            if(board[i][j+1] == word.charAt(index)){
                sign_b[i][j+1] =1;
                if(find(i,j+1,index+1)==true)
                    return true;
                else
                    sign_b[i][j+1] = 0;
            }
        }
        //下
        if(i < row-1 &&sign_b[i+1][j] == 0){
            if(board[i+1][j] == word.charAt(index)){
                sign_b[i+1][j] = 1;
                if(find(i+1,j,index+1)==true)
                    return true;
                else
                    sign_b[i+1][j] = 0;
            }
        }
        //左
        if(j > 0 && sign_b[i][j-1] == 0){
            if(board[i][j-1] == word.charAt(index)){
                sign_b[i][j-1]=1;
                if(find(i,j-1,index+1)==true)
                    return true;
                else {
                    sign_b[i][j-1]=0;
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        if(board == null)   return false;
        this.board = board;
        this.word = word;
        row= board.length;
        column= board[0].length;
        this.sign_b = new int[row][column];

        for(int i = 0 ; i<row ;i++){
            for(int j = 0 ; j<column ;j++){
                if(word.charAt(0) == board[i][j]){
                    sign_b[i][j] = 1;
                    if(word.length()>1) {
                        if (find(i, j, 1) == true) {
                            return true;
                        }else {
                            sign_b[i][j] = 0;
                        }

                    }else
                        return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        /*char[][] board ={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        test_079 test = new test_079();
        String word_1 = "ABCCED";
        String word_2 = "SEE";
        String word_3 = "ABCB";

        boolean a =test.exist(board,word_1);
        boolean b =test.exist(board,word_2);
        boolean c =test.exist(board,word_3);*/

        /*char[][] board ={
                {'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'}
        };*/

        char[][] board={
                {'C','A','A'},{'A','A','A'},{'B','C','D'}
        };
        test_079 test = new test_079();
        //boolean a = test.exist(board,"aaaaaaaaaaaaa");
        boolean a = test.exist(board,"AAB");

        return;
    }
}
