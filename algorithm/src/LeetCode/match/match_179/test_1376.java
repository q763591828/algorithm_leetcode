package LeetCode.match.match_179;

import java.util.*;

public class test_1376 {



    class Node{
        int val;
        int index;
        List<Node> nexts = new ArrayList<>();

        public Node(int val,int index){
            this.val = val;
            this.index = index;
        }
    }

    public void max_val(Node p , int v ){
        if(p == null)
            return;

        List<Node> list =p.nexts;
        v += p.val ;
        if( v > max)
            max = v;
        for(int i = 0 ; i< list.size() ;++i){
            max_val(list.get(i), v);
        }

    }

    /*public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int sum = 1 , t = -1 ;
        Node f = new Node(informTime[headID],headID) , p = f;
        Queue<Node> q = new LinkedList<>();
        q.add(f);
        max = f.val;
        while (sum < manager.length ){
            f = q.poll();
            t = f.index;

            for(int i = 0 ; i < manager.length ; ++i){
                if(manager[i] ==t){
                    ++sum;
                    int res = informTime[i] + f.val;
                    Node tmp = new Node(res,i);
                    if(res > max)
                        max = res;

                    f.nexts.add(tmp);

                    //p = tmp;

                    q.add(tmp);
                }
            }
        }

        //max_val(p,0);


        return max;
    }*/
    int[] informTime;
    int max = Integer.MIN_VALUE;
    Map<Integer,ArrayList<Integer>> map = new HashMap<>();
    public void solve(int f, int v){
        if(!map.containsKey(f))
            return;
        List l = map.get(f);
        v += informTime[f];
        if( v > max)
            max = v;
        for(int i = 0; i < l.size() ; ++i){
            solve((int)l.get(i),v);
        }
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        this.informTime = informTime;
        Queue<Integer> q = new LinkedList<>();
        q.add(headID);
        max = informTime[headID];
        for(int i = 0 ;i <n ; ++i ){
            if(map.containsKey(manager[i])){
                List l = map.get(manager[i]);
                l.add(i);
            }else {
                ArrayList<Integer> l_t = new ArrayList<>();
                l_t.add(i);
                map.put(manager[i],l_t);
            }
        }

        solve(headID,0);

        return max;



    }

    public static void main(String[] args){
        test_1376 test_1376 = new test_1376();
        int n = 4;
        int headID = 2;
        int[] manager = {3,3,-1,2}, informTime = {0,0,162,914};

        test_1376.numOfMinutes(n,headID,manager,informTime);
    }
}
