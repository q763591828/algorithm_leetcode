package LeetCode.match.match_180;

import java.util.Stack;

public class test_5357 {

    public class CustomStack{
        Stack<Integer> s ;
        int size = 0;

        public CustomStack(int maxSize) {
            s = new Stack<Integer>();
            size = maxSize;
        }

        public void push(int x) {
            if(s.size() < size){
                s.push(x);
            }

            return;
        }

        public int pop() {
            if(!s.isEmpty())
                return s.pop();
            else
                return -1;
        }

        public void increment(int k, int val) {


            Stack<Integer> t_s = new Stack<>();

            while (!s.isEmpty() ){
                t_s.add(s.pop());

            }

            while (!t_s.isEmpty() ){
                if( k > 0) {
                    s.add(t_s.pop() + val);
                }else {
                    s.add(t_s.pop());
                }
                --k;
            }

        }
    }


    public static void main(String[] args){
        test_5357 test_5357 = new test_5357();
        CustomStack customStack = test_5357.new CustomStack(28);
        customStack.push(33);
        customStack.push(91);
        customStack.push(76);
        customStack.push(5);
        customStack.increment(3,92);
        customStack.push(81);
        customStack.push(11);
        int a = customStack.pop();
        customStack.push(85);

        return;

    }


}
