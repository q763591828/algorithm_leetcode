package LeetCode.greedy.medium;

public class test_861 {

    public int matrixScore(int[][] A) {
        int row = A.length,column = A[0].length;
        for(int i = 0; i< row ; i++){
            if(A[i][0] == 1)
                continue;
            for(int j = 0 ; j< column ; j++){
                if(A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }

        int sum_1=0;
        for(int i = 1 ; i< column ; i++){
            sum_1=0;
            for(int j = 0 ; j < row ; j++){
                if(A[j][i]==1)
                    sum_1++;
            }
            if(sum_1<(row+1)/2){
                for(int j = 0 ; j<row ; j++){
                    if(A[j][i] == 1)
                        A[j][i] = 0;
                    else
                        A[j][i] = 1;
                }
            }
        }

        int ans=0;
        for(int i = 0 ; i < row ; i++){
            for(int j = column-1 ; j> -1 ; j--){
                if(A[i][j]==1)
                    ans += 1<<column-j-1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        test_861 test = new test_861();
        int[][] A = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        test.matrixScore(A);
    }
}
