package LeetCode.other;

public class test_155 {

    int max_size=50;
    int[] stack;
    int top = -1;
    int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public test_155() {
        stack = new int[max_size];
    }

    public void push(int x) {
        if(top == max_size-1){
            max_size*=2;
            int[] new_stack = new int[max_size];
            for(int i = 0 ; i < top;i++) {
                new_stack[i] = stack[i];
            }
            stack = new_stack;
        }

        stack[++top] = x;
        if(x < min){
            min = x;
        }

    }

    public void pop() {
        if(top==-1)
            return;

        int tmp_min = 10000;
        if(min == stack[top]){
            for(int i = 0; i < top; i++){
                if(tmp_min > stack[i])
                    tmp_min = stack[i];
            }
            min =tmp_min;
        }

        stack[top--] =0;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args){
        test_155 test = new test_155();
        test.push(2);
        test.push(0);
        test.push(3);
        test.push(0);
        int a =test.getMin();
        test.pop();
        int b = test.getMin();
        test.pop();
        int c = test.getMin();
        test.pop();
        int d = test.getMin();
        return;
    }

}
