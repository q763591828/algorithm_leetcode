package Offer;

public class Offer_23 {
    int[] s;

    public boolean find(int b,int e){
        if(b == e || b == e-1 || b - 1 == e)
            return true;

        int root = s[e];
        int i = b;
        for(; i < e ; i++){
            if(s[i] > root)
                break;
        }
        int j = i;
        for(; j < e ; j++ ){
            if(s[j] < root)
                return false;
        }
        if(find(b,i-1)== false)
            return false;
        if(find(i,e-1)==false)
            return false;
        return true;

    }


    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        //找最后一个数为根节点
        //循环数组，左边小到右边大,有问题返回false
        //递归以上步骤
        s = sequence;
        return find(0,s.length-1);
    }

    public static void main(String[] args){
        Offer_23 offer_23 = new Offer_23();
        //int[] sequence = {7,4,6,5};
        //int[] sequence = {5,7,6,9,11,10,8};
        int[] sequence = {2,1,3};
        boolean a = offer_23.VerifySquenceOfBST(sequence);

        return;
    }
}
