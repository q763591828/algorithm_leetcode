package LeetCode.match.match_2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_2 {
    int n = 0;
    int sum = 0;
    int[] sign;
    int k ;

    Map<Integer,List<Integer>> map = new HashMap<>();
    public void pass(int i ,int n_k ){

        if(n_k > k)
            return;

        if(i == n-1 && n_k == k) {
            ++sum;
            return;
        }

        ++n_k;
        List<Integer> l = map.get(i);
        if(l == null)
            return;
        for(int j = 0 ; j < l.size() ; ++j){
            int t =  l.get(j);

            pass(t,n_k);

        }

    }

    public int numWays(int n, int[][] relation, int k) {
        sign = new int[n];
        this.n = n;
        this.k = k;
        for(int i = 0 ; i < relation.length ; ++i){
            if(map.containsKey(relation[i][0])){
                List l = map.get(relation[i][0]);
                l.add(relation[i][1]);
            }else {
                List<Integer> l = new ArrayList();
                l.add(relation[i][1]);
                map.put(relation[i][0],l);
            }
        }

        pass(0,0);
        return sum;
    }

    public static void main(String[] args){
        test_2 test_2 = new test_2();
        int n = 5;
        int[][] relation ={{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        int k = 3;
        test_2.numWays(n,relation,k);
    }
}
