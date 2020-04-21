package LeetCode.array.easy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class test_1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length , c = mat[0].length;
        Map<Integer,Integer> map = new HashMap<>();
        int tmp=0;
        int[] res = new int[k];
        PriorityQueue<Integer> pq =new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = map.get(o1) , b = map.get(o2);
                if(a == b)
                    return o1 - o2;
                else
                    return map.get(o1) - map.get(o2);
            }

        });
        for(int i = 0 ; i < r ; i++){
            tmp = 0;
            for(int j = 0 ; j< c ; j++){
                if(mat[i][j] == 0){
                    map.put(i,tmp);
                    pq.add(i);
                    break;
                }
                tmp++;
                if(j == c-1){
                    map.put(i,tmp);
                    pq.add(i);
                }
            }
        }

        for(int i = 0 ; i< k ; i++){
            res[i] = pq.poll();
        }

        return res;
    }

    public static void main(String[] args){
        test_1337 test_1337 = new test_1337();
        int[][] a = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        test_1337.kWeakestRows(a,5);
    }
}
