package LeetCode.binarySearch.easy;

public class test_1351 {

    int[][] grid;
    public int search(int i , int b , int e) {
        int mid = 0;
        while (b < e){
            mid = (b + e ) >> 1;
            if( grid[i][mid] < 0){
                e = mid;
            }else {
                b = mid+1;
            }
        }
        return b;
    }

    public int countNegatives(int[][] grid) {
        this.grid = grid;
        int i = 0 , j = 0 , r = grid.length , c = grid[0].length ,sum = 0 ;
        int b = 0 , e = c , tmp = 0 ;
        while ( i < r ){
            tmp = search(i,b,e);
            sum += (c - tmp);
            i++;
        }

        return sum;
    }

    public static void main(String[] args){
        test_1351 test_1351 = new test_1351();
        int[][] grid = {{-1,-1},{-1,-2}};
        test_1351.countNegatives(grid);
    }
}
