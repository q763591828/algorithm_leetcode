package Offer;

import LeetCode.Tree.TreeNode;
import LeetCode.Tree.TreeTool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_60 {

    class Tmp{
        public TreeNode treeNode;
        public Integer i;

        Tmp (TreeNode treeNode,Integer i){
            this.treeNode = treeNode;
            this.i = i;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists= new ArrayList<>();
        if(pRoot==null)
            return lists;
        ArrayList list = new ArrayList();
        Queue<Tmp> q =  new LinkedList<>();
        q.add(new Tmp(pRoot,1));
        TreeNode p = null , last_lay = null;
        while (!q.isEmpty()){
            Tmp poll = q.poll();
            p = poll.treeNode;
            list.add(p.val);

            if(p.left!=null){
                if(p.right == null)
                    q.add(new Tmp(p.right,1));
                else
                    q.add(new Tmp(p.left,0));
            }

            if(p.right!=null){
                if(poll.i.equals(1))
                    q.add(new Tmp(p.right,1));
                else
                    q.add(new Tmp(p.right,0));
            }

            if(poll.i.equals(1)){
                lists.add(list);
                list = new ArrayList();
                last_lay = p;
            }
        }
        if(!last_lay.equals(p))
            lists.add(list);

        return lists;


    }

    public  static  void main(String[] args){
        TreeTool tool = new TreeTool();
        int nums[] = {8,6,10,5,7,9,11};
        TreeNode treeNode = tool.generateTree(nums);

        Offer_60 offer_60 = new Offer_60();
        ArrayList list = offer_60.Print(treeNode);
        return;
    }

}
