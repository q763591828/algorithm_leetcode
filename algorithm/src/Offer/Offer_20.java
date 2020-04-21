package Offer;

import java.util.PriorityQueue;
import java.util.Stack;

public class Offer_20 {

    Stack<Integer> s = new Stack();
    Stack<Integer> a_s = new Stack();

    public void push(int node) {
        s.push(node);

        if(!a_s.isEmpty()){
            if(a_s.peek() < node){
                a_s.push(a_s.peek());
                return;
            }
        }

        a_s.push(node);

    }

    public void pop() {
        if(s.isEmpty())
            return ;
        else {
            s.pop();
            a_s.pop();
        }
    }

    public int top() {
        if(s.isEmpty())
            return -1;
        else
            return s.peek();
    }

    public int min() {
        if(!s.isEmpty())
            return a_s.peek();
        return -1;
    }

}
