package LeetCode.match.match_183;

public class test_5377 {

    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        int sum = 0 , carry = 0;
        for(int i = s.length()-1 ; i > 0 ; --i ){
            if(carry == 0){
                if(sb.charAt(i) == '1'){
                    sum += 2;
                    carry = 1;
                }else {
                    sum += 1;
                }
            }else {
                if(sb.charAt(i) == '0'){
                    sum += 2;
                    carry = 1;
                }else {
                    sum += 1;
                    carry = 1;
                }
            }
        }
        if(carry == 1){
            if(s.charAt(0) == '1') ++sum;
        }

        return sum;
    }

    public static void main(String[] args){
        test_5377 test_5377 = new test_5377();
        String s = "10";
        test_5377.numSteps(s);
    }
}
