package Offer;

public class Offer_48 {
    public int Add(int num1,int num2) {
        int sum,carry;
        do{
            sum = num1^num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }while ( num2 !=0);


        return num1;

        /*int tmp = 1,i = 1,carry = 0 , sum = 0,mid = 0;

        while (i <32){
            int a = num1 & tmp;
            int b = num2 & tmp;

            int c = a|b; //用于判断两个异或值是否都是0 还是 都是1 如果 c=0 表示都是0 如果c=1 表示都是1，用于判断进位
            int d = a^b; //该位上得到的结果 （在还没有加上进位之前）
            if(d == 0 && c!= 0){
                carry = 1;
            }else if(carry != 0){
                d = d^tmp;
                if(d == 0){
                    carry = 1;
                }else {
                    carry = 0;
                }
            }
            sum += d;

            tmp = tmp << 1;
            i++;
        }

        return sum;*/
    }

    public static void main(String[] args){
        Offer_48 offer_48 = new Offer_48();
        offer_48.Add(7,7);
    }
}
