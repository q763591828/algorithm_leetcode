package LeetCode.dynamic.medium;

public class test_096 {

    int[] db;

    public int numTrees(int n) {
        db = new int[n+1];
        db[0]=1;
        db[1]=1;

        for(int j = 2 ; j <= n ; j++){
            for(int i = 1 ; i <= j ; i++){
                db[j] += db[i-1]*db[j-i];
            }
        }

        return db[n];
    }

    public static void main(String[] args){
        test_096 test = new test_096();
        int a = test.numTrees(3);
        return;
    }
}
