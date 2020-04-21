package LeetCode.match.match_179;

public class test_1374 {

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int end = 0;
        if(n%2 == 1){
            end = n;
        }else
            end = n-1;

        for(int i = 0 ; i < end ; i++){
            sb.append('a');
        }
        if(n%2 == 0)
            sb.append('b');

        return sb.toString();

    }
}
