package LeetCode.other;

import java.util.Stack;

public class test_020 {

    public static boolean isMatch(char a , char b){
        return ((a =='[' && b == ']')|| (a == '{' && b == '}') || ( a== '(' && b == ')'));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++ ){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else {
                if(isMatch(stack.peek(),s.charAt(i))){
                    continue; //因为已经匹配了所以开始下一次循环
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        String s = "([)]";
        isValid(s);
    }
}
