package LeetCode.greedy.medium;

import java.util.Stack;

public class test_921 {

    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int ans=0;
        char c ;
        for(int i = 0 ; i< S.length(); i++){
            c = S.charAt(i);
            if(c == ')'){
                if(stack.isEmpty()){
                    ans++;
                }else {
                    stack.pop();
                }
            }else {
                stack.push('(');
            }
        }
        if(!stack.isEmpty()){
            ans+=stack.size();
        }

        return ans;
    }

    public static void main(String[] args){
        test_921 test = new test_921();
        String S = "()))((";
        test.minAddToMakeValid(S);
    }
}
