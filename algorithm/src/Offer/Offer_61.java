package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

public class Offer_61 {

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


    public StringBuilder pre(TreeNode root,StringBuilder s){
        if(root == null)
            return null;
        s.append(root.val);
        s.append('#');

        pre(root.left,s);
        pre(root.right,s);

        return s;
    }

    public StringBuilder in(TreeNode root, StringBuilder s){
        if(root == null)
            return null;

        in(root.left, s );
        s.append(root.val);
        s.append('#');
        in(root.right, s);

        return s;
    }


    String Serialize(TreeNode root) {
        StringBuilder s = new StringBuilder("");
        StringBuilder pre = pre(root, s);
        StringBuilder in = in(root, s);

        if(in == null)
            return "";
        return in.toString();
    }

    TreeNode Deserialize(String str) {
        String[] split = str.split("#");
        int[] pre = new int[split.length/2], in = new int[split.length/2];
        for(int i = 0,j = split.length/2 ; i < split.length/2 ; i++ ,j++){
            pre[i] = Integer.valueOf(split[i]);
            in[i] = Integer.valueOf(split[j]);
        }

        TreeNode treeNode = reConstructBinaryTree( pre,in);

        return treeNode;
    }


    public static void main(String[] args){
        TreeTool tool = new TreeTool();
        int nums[] = {8,6,10,5,7,9,11};
        TreeNode treeNode = tool.generateTree(nums);
        Offer_61 offer_61 = new Offer_61();
        String s = offer_61.Serialize(treeNode);

        offer_61.Deserialize(s);
        return;

    }
}
