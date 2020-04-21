package LeetCode.string.easy;

import java.util.Stack;

public class test_657 {

    public void solution(char c,Stack<Character> stack){
        if(stack.isEmpty()||stack.peek() ==c){
            stack.push(c);
        }else {
            stack.pop();
        }
    }

    public boolean judgeCircle(String moves) {
        Stack<Character> rl = new Stack<>(), ud = new Stack<>();
        for(int i = 0 ; i<moves.length() ; i++){
            char c = moves.charAt(i);

            if(c=='R'||c=='L'){
                solution(c,rl);
            }else {
                solution(c,ud);
            }
        }
        if(rl.isEmpty()&&ud.isEmpty())
            return true;
        else
            return false;
    }
}
