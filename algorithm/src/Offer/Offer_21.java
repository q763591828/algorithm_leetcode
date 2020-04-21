package Offer;

import java.util.Stack;

public class Offer_21 {
    int[] pushA;
    int[] popA;

    public int findindex(int sign ,int j){
        int k = sign;
        while (k < pushA.length){
            if (pushA[k] == popA[j])
                return k;
            k++;
        }
        return -1;
    }



    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA==null || popA == null || pushA.length != popA.length)
            return false;
        this.pushA = pushA;
        this.popA = popA;
        Stack<Integer> stack = new Stack<>();
        int i = 0 , j = 0 , sign = 0 , n_sign = 0;
        //如果剩下的还有目标数 就压栈
        //如果没有就看栈顶
        while (j < popA.length){
            n_sign = findindex(sign,j);
            if(n_sign != -1){
                for(int k = sign ; k < n_sign ; k++){
                    stack.push(pushA[k]);
                }
                sign = n_sign + 1;
            }else {
                //此处如果stack是空还要处理
                if(!stack.isEmpty() && stack.peek() == popA[j])
                    stack.pop();
                else
                    return false;
            }
            j++;
        }
        return true;
    }


    public static void main(String[] args){
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,2,1,5};
        Offer_21 offer_21 = new Offer_21();
        boolean a = offer_21.IsPopOrder(pushA,popA);
        return;
    }
}
