package LeetCode.match.match_181;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class test_1389 {
    class list{
        int val;
        list next;


        public list(int val){
            this.val = val;
        }
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        list l = new list(0);
        list p = l;
        for(int i = 0; i < nums.length ; ++i){
            p = l;
            for(int j = 0 ; j <= index[i] ; ++j){

                if(j == index[i]) {
                    list p_n = new list(nums[i]);
                    if(p.next == null){
                        p.next = p_n;
                    }else {
                        list tmp = p.next;
                        p.next = p_n;
                        p_n.next = tmp;
                    }
                }else
                    p = p.next;
            }
        }
        int[] res = new int[nums.length];
        p = l.next;
        for(int i =0; i < nums.length ; ++i){
            res[i] = p.val;
            p = p.next;
        }

        return res;
    }

    public static void main(String[] args){
        int[] a = {0,1,2,3,4};
        int[] b = {0,1,2,2,1};
        test_1389 test_1389 = new test_1389();
        test_1389.createTargetArray(a,b);
    }
}
