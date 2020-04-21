package LeetCode.string.simple;

public class test_1021 {

    public String removeOuterParentheses(String S) {
        int i = 0 ,sign = 0 ;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < S.length()){
            if(sign == 0 && S.charAt(i) == '('){
                sign = 1;
                i++;
                continue;
            }
            if(sign == 1 && S.charAt(i) == ')'){
                sign = 0;
                i++;
                continue;
            }

            if(S.charAt(i) == '('){
                stringBuilder.append('(');
                sign ++;
            }else {
                stringBuilder.append(')');
                sign--;
            }
            i++;


        }

        return stringBuilder.toString();
    }

    public static void main(String[] args){
        test_1021 test = new test_1021();
        String S = "(()())(())(()(()))";

        test.removeOuterParentheses(S);
    }
}
