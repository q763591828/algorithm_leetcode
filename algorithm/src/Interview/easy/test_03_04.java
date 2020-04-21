package Interview.easy;

import java.util.Stack;

public class test_03_04 {

    class MyQueue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            s1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(!s2.isEmpty()){
                return s2.pop();
            }else {
                while (!s1.isEmpty()){
                    s2.push(s1.pop());
                }

                return s2.pop();
            }
        }

        /** Get the front element. */
        public int peek() {
            if(!s2.isEmpty()){
                return s2.peek();
            }else {
                while (!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                return s2.peek();
            }
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if(s1.isEmpty() && s2.isEmpty())
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args){
        test_03_04 test_03_04 = new test_03_04();
        test_03_04.MyQueue queue= test_03_04.new MyQueue();
        queue.push(1);

        return;
    }
}
