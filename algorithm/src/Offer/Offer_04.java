package Offer;

import LeetCode.Tree.TreeNode;

public class Offer_04 {

    private int[] pre ;
    private int[] in;

    public TreeNode create(int i,int n ,int b,int e,TreeNode pre_p,int sign){
        //结束标记
        if(n <1 || i == pre.length)
            return null;

        TreeNode p = new TreeNode(pre[i]);

        if(sign == 0 )
            pre_p.left = p;
        else
            pre_p.right = p;


        int t = b;
        while ( t<=e){
            if(in[t] == pre[i])
                break;
            t++;
        }

        create(i+1, t-b,b,t-1,p,0);
        create(i+t-b+1,e-t,t+1,e,p,1);

        return p;
    }


    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        this.pre = pre;
        this.in = in;

        TreeNode null_p = new TreeNode(0);
        return create(0,pre.length,0,in.length,null_p,0);

    }

    public static void main(String[] args){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        Offer_04 offer_04 = new Offer_04();
        offer_04.reConstructBinaryTree(pre,in);
    }

}
