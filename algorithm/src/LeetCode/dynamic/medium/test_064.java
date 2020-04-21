package LeetCode.dynamic.medium;

public class test_064 {

    public int minPathSum(int[][] grid) {
        int row= grid.length ,column = grid[0].length;
        int[][] db= new int[row][column];
        db[0][0] = grid[0][0];
        for(int i = 1 ; i < row ; i++){
            db[i][0] = db[i-1][0] + grid[i][0];
        }
        for(int i = 1 ; i< column ; i++){
            db[0][i] = db[0][i-1] + grid[0][i];
        }

        for(int i = 1; i< row ; i++){
            for(int j = 1 ; j < column ; j++){
                db[i][j] = Math.min(db[i][j-1],db[i-1][j]) + grid[i][j];
            }
        }

        return db[row-1][column-1];
    }

    public static void main(String[] args){
        test_064 test = new test_064();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        test.minPathSum(grid);
    }
}
