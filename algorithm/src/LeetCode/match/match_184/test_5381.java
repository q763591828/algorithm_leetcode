package LeetCode.match.match_184;

import java.util.LinkedList;
import java.util.List;

public class test_5381 {

    public int[] processQueries(int[] queries, int m) {
        int[] res = new int[queries.length];
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < m; i++){
            list.add(i+1);
        }
        for(int i= 0 ; i < queries.length ; ++i){
            for(int j = 0 ; j < list.size() ; ++j){
                int tmp = list.get(j);
                if(tmp == queries[i]){
                    res[i] = j;
                    list.remove(j);
                    list.add(0,tmp);
                }
            }
        }
        return res;



    }


}
