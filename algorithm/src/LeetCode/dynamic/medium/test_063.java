package LeetCode.dynamic.medium;

public class test_063 {
    private int[][] db;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length,column = obstacleGrid[0].length;
        this.db = new int[row][column];

        int sign =0;
        for(int i = column-1; i>-1 ;i--){
            if(obstacleGrid[row-1][i] == 0 && sign==0){
                db[row-1][i] =1;
            }else{
                sign=1;
            }
        }

        sign=0;
        for(int i = row-1; i>-1;i--){
            if(obstacleGrid[i][column-1] == 0 && sign==0)
                db[i][column-1] =1;
            else
                sign=1;
        }

        for(int i = row-2 ; i >-1; i--){
            for(int j = column-2; j > -1;j--){
                if(obstacleGrid[i][j] == 1){
                    db[i][j] = 0;
                }else
                    db[i][j] = db[i][j+1] + db[i+1][j];

            }
        }

        return db[0][0];
    }

    public static void main(String[] args){
        int[][] obs ={
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        test_063 test = new test_063();
        test.uniquePathsWithObstacles(obs);
    }
}
