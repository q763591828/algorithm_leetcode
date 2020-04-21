package Offer;

public class Offer_65 {

    char[] str;
    char[] matrix;
    int[][] sign;
    int rows;
    int cols;
    public boolean find(int r,int c , int i ){
        if(matrix[(r-1)*cols+c-1] != str[i]){
            return false;
        }
        sign[r-1][c-1] = 1;
        if(i== str.length-1)
            return true;

        if(r > 1 && sign[r-2][c-1]!=1){
            if(find(r-1,c,i+1)== true)
                return true;
        }
        if(r < rows && sign[r][c-1]!=1){
            if(find(r+1,c,i+1)==true)
                return true;
        }
        if(c > 1 && sign[r-1][c-2]!=1){
            if(find(r,c-1,i+1)== true)
                return true;
        }
        if(c < cols && sign[r-1][c]!=1){
            if(find(r,c+1,i+1)== true)
                return true;
        }
        sign[r-1][c-1] = 0;

        return false;
    }


    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if(matrix.length == 0 || matrix.length < str.length || rows*cols != matrix.length)
            return false;

        sign = new int[rows][cols];
        this.str = str;
        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= cols ; j ++){
                if( matrix[(i-1)*cols+j-1] == str[0]){
                    if(find(i,j,0)== true)
                        return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        char[] m = {'A','B','C','E','S','F','C','S','A','D','E','E'};
        char[] str = {'E','E','D','A','S','A','B','C','E','S'};
        Offer_65 offer_65 = new Offer_65();
        offer_65.hasPath(m,3,4,str);
    }
}
