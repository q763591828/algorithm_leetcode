package LeetCode.array.medium;

public class test_695 {

    int[][] grid;
    int r;
    int c ;

    public int solve(int i, int j){
        //顺序是上右下左
        if(i < 0 || i >= r || j < 0 || j >= c)
            return 0;

        int tmp = 0 ;
        if(grid[i][j] == 1){
            ++tmp;
            grid[i][j] = 0;
        }else {
            return 0;
        }
        tmp += solve(i-1,j);
        tmp += solve(i,j+1);
        tmp += solve(i+1,j);
        tmp += solve(i,j-1);

        return tmp;
    }


    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        r = grid.length ; c = grid[0].length;
        int max = 0 ,tmp = 0 ;
        for(int i = 0 ; i < r ; ++i){
            for(int j = 0 ; j < c ; ++j){
                if(grid[i][j] == 1){
                    tmp = solve(i,j);
                    if(tmp > max)
                        max = tmp;
                }
            }
        }

        return max;
    }

    public static void main(String[] args){
        test_695 test_695 = new test_695();
        int[][] grid = {{}};
        test_695.maxAreaOfIsland(grid);
    }
}
