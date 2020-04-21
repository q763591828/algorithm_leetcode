package LeetCode.map.medium;

import java.util.LinkedList;
import java.util.Queue;

public class test_1162 {

    int max = 0;
    int[][] t_g;
    int[][] grid;
    int r;
    int c;

    public int  find(int i , int j ,int step){
        t_g[i][j] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j,step});
        while (!queue.isEmpty()){
            int[] t = queue.poll();
            i = t[0] ; j = t[1]; step = t[2];
            if(grid[i][j] == 1){
                if (step > max)
                    max = step;
                return step;
            }

            if(i > 0 && t_g[i-1][j] != 1){
                t_g[i-1][j] = 1;
                queue.add(new int[]{i-1,j,step+1});
            }
            if(j < c-1 && t_g[i][j+1] != 1){
                t_g[i][j+1] = 1;
                queue.add(new int[]{i,j+1,step+1});
            }
            if(i < r-1 && t_g[i+1][j] != 1 ){
                t_g[i+1][j] = 1;
                queue.add(new int[]{i+1,j,step+1});
            }
            if(j > 0 && t_g[i][j-1] != 1){
                t_g[i][j-1] = 1;
                queue.add(new int[]{i,j-1,step+1});
            }
        }
        return -1;  //  说明全是海，没有陆地
    }

    public int maxDistance(int[][] grid) {
        r = grid.length; c = grid[0].length;
        this.grid = grid;
        t_g = new int[r][c];

        int t = 0;

        for(int i = 0 ; i < r ; ++i ){
            for(int j = 0 ; j < c ; ++j){
                if(grid[i][j] != 1){
                    t = find(i,j,0);
                    if(t == -1) //说明只有海洋，没有陆地
                        return -1;
                    /*for(int k = 0 ; k < r ; ++k){   //找完后，将标志矩阵重新归0
                        for (int l = 0 ; l < c ; ++l){
                            t_g[k][l] = 0;
                        }
                    }*/
                    t_g = new int[r][c];
                }
                if(i == r-1 && j == c -1 && max == 0) //说明只有陆地，没有海洋
                    return -1;
            }
        }

        return max;
    }
    /*public int maxDistance(int[][] grid) {
        // 思路：BFS
        if (grid == null || grid.length == 0 || grid[0].length == 0) return -1;
        int N = grid.length;
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] == 1) queue.add(new int[]{i,j});
            }
        }
        if (queue.isEmpty() || queue.size() == N * N) return -1;
        while (!queue.isEmpty()) {
            int layerSize = queue.size();
            // 遍历每层节点 这里注意只有第二次遍历才会真正产生距离为1的海洋
            // 因此结果要-1
            for (int i = 0; i < layerSize; ++i) {
                int[] arr = queue.poll();
                int x = arr[0], y = arr[1];
                // 遍历过的节点改为 -1 做为区分
                if (x >= 1 && grid[x-1][y] == 0) {
                    grid[x-1][y] = -1;
                    queue.add(new int[]{x-1, y});
                }
                if (x < N-1 && grid[x+1][y] == 0) {
                    grid[x+1][y] = -1;
                    queue.add(new int[]{x+1, y});
                }
                if (y >= 1 && grid[x][y-1] == 0) {
                    grid[x][y-1] = -1;
                    queue.add(new int[]{x, y-1});
                }
                if (y < N-1 && grid[x][y+1] == 0) {
                    grid[x][y+1] = -1;
                    queue.add(new int[]{x, y+1});
                }
            }
            ++res;
        }
        return res-1;
    }*/



    public static void main(String[] args){
        test_1162 test_1162 = new test_1162();
        int[][] grid = {{1,0,1},{0,0,0},{1,0,1}};
        //int[][] grid = {{0,0,0}};
        test_1162.maxDistance(grid);
    }
}
