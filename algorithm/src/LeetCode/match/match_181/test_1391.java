package LeetCode.match.match_181;

public class test_1391 {

    int sum=0;
    int[][] grid ;
    int r ;
    int c ;

    public boolean solve(int i , int j , int from ){
        sum++;
        if(grid[i][j] == 1){
            if(from == 4){
                if(j == c-1)
                    return true;
                else
                    return solve(i,j+1,4);
            }else if( from == 2){
                if( i == 0)
                    return true;
                else
                    return solve(i,j-1,2);
            }else
                return false;
        }else if( grid[i][j] == 2){
            if(from == 1){
                if( i == r-1 )
                    return true;
                else
                    return solve(i+1,j,1);
            }else if(from == 3){
                if(i == 0)
                    return true;
                else
                    return solve(i-1,j,3);
            }else
                return false;
        }else if( grid[i][j] == 3){
            if(from == 4){
                if(i == r-1)
                    return true;
                else
                    return solve(i+1,j,1);
            }else if(from == 3){
                if( j == 0 )
                    return true;
                else
                    return solve(i,j-1,2);
            }else
                return false;
        }else if( grid[i][j] == 4){
            if(from == 2){
                if(j == c-1)
                    return true;
                else
                    return solve(i+1,j,1);
            }else if(from == 3){
                if(j == c -1 )
                    return true;
                else
                    return solve(i,j+1,4);
            }else
                return false;
        }else if( grid[i][j] == 5){
            if(from == 1){
                if(j == 0)
                    return true;
                else
                    return solve(i,j-1,2);
            }else if(from == 4){
                if(i == 0)
                    return true;
                else
                    return solve(i-1,j,3);
            }else
                return false;
        }else {
            if(from == 1){
                if( j == c-1)
                    return true;
                else
                    return solve(i,j+1,4);
            }else if(from == 2){
                if(i == 0)
                    return true;
                else
                    return solve(i-1,j,3);
            }else
                return false;
        }
    }


    public boolean hasValidPath(int[][] grid) {
        this.grid = grid;
        r = grid.length ;c = grid[0].length;
        boolean res = false;
        if(grid[0][0] == 1 ){
            res= solve(0,0,4);
        }else if (grid[0][0] == 2){
            res=  solve(0,0,1);
        }else if (grid[0][0] == 3){
            res=  solve(0,0,4);
        }else if (grid[0][0] == 4){
            if( solve(0,0,2)== false || solve(0,0,3)== false)
                res= false;
            else
                res= true;
        }else if (grid[0][0] == 5){
            return false;
        }else
            res=  solve(0,0,1);

        if(res == true && sum >1)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        test_1391 test_1391 = new test_1391();
        //int[][] grid = {{4,1},{6,1}};
        int[][] grid = {{2,4,3},{6,5,2}};
        //int[][] grid = {{1,2,1},{1,2,1}};
        //int[][] grid = {{1,1,1,1,3}};
        //int[][] grid = {{2,6}};
        boolean res = test_1391.hasValidPath(grid);
        return;
    }
}
