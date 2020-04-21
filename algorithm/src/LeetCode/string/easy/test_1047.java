package LeetCode.string.easy;

import java.util.Stack;

public class test_1047 {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        char tmp;
        for(int i = 0 ; i < S.length() ; i++){
            tmp = S.charAt(i);
            if(stack.isEmpty())
                stack.push(tmp);
            else if(stack.peek()!=tmp){
                stack.push(tmp);
            }else {
                stack.pop();
            }
        }
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()){
            s.insert(0,stack.pop());
        }
        return s.toString();
    }

    public static void main(String[] args){
        test_1047 test_1047 = new test_1047();
        test_1047.removeDuplicates("");
    }
}
