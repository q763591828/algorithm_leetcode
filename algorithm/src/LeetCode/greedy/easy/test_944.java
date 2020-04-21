package LeetCode.greedy.easy;

public class test_944 {
    public int minDeletionSize(String[] A) {
        int ans =0;
        int row = A.length,column = A[0].length();
        for(int i = 0 ; i < A[0].length() ; i++){
            for(int j= 1 ; j< A.length ; j++){
                if(A[j].charAt(i) < A[j-1].charAt(i)){
                    /*for(int k = 0 ; k < A.length ; k++){
                        A[k] = A[k].substring(0,i) + A[k].substring(i+1,A[k].length());
                    }
                    i--;*/
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args){
        /*String a = "abcde";
        a =a.substring(0,3);*/
        test_944 test = new test_944();
        String[] A = {"cba","daf","ghi"};
        test.minDeletionSize(A);
    }
}
