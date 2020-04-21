package LeetCode.array.medium;

import java.util.*;

public class test_056 {

    /*public void mergesort(int[][] intervals,int begin , int end){
        if(begin+1<end){
            int mid = (begin+end)/2;
            mergesort(intervals,begin,mid);
            mergesort(intervals,mid+1,end);
        }else {
            for(int i = )
        }
    }*/

    public int[][] merge(int[][] intervals) {
        //if(intervals.length == 0 || intervals[0].length == 0) return intervals;

        List<List<Integer>> lists = new ArrayList<>();
        int length = intervals.length;
        //mergesort(intervals,0,length-1);

        Arrays.sort(intervals,((o1, o2) -> {
            if(o1[0] > o2[0])   return 1;
            else if(o1[0] < o2[0]) return -1;
            else return 0;
        }) );

        int sign = 0,begin=0,end=0,max = -1;
        for(int i = 0 ; i< length ;i++){
            if(sign == 0){
                begin = intervals[i][0];
                sign = 1;
            }
            if(intervals[i][1] > max){
                max = intervals[i][1];
                end = max;
            }

            if( i < length-1 && end < intervals[i+1][0] ){
                lists.add(Arrays.asList(begin,end));
                sign = 0;
            }
        }

        //最后的一次检查是否还有可以加入的范围
        if(sign == 1){
            lists.add(Arrays.asList(begin,end));
        }

        int a = 0;
        int[][] result = new int[lists.size()][2];
        for(int i= 0 ; i< lists.size() ;i++){
            result[i][0]= lists.get(i).get(0);
            result[i][1]= lists.get(i).get(1);

        }

        return result;


        /*Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0])   return 1;
                else if(o1[0] < o2[0]) return -1;
                else return 0;
            }
        });*/


        /*List<List<Integer>> lists = new ArrayList<>();

        for(int i = 0 ; i < length ; i++){
            lists.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        }

        int[] tmp = new int[length];
        for(int i = 0 ; i< length ;i++){
            tmp[i] = intervals[i][0];
        }

        lists.sort(lists, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return 0;
            }

        });*/


    }

    public static void main(String[] args){
        int[][] intervals = {
                {1,3},{8,10},{2,6},{15,18}
        };
        int[][] i_2 = {{1,4},{2,3}};
        int[][] i_3 = {
                {1,8},{5,6},{7,14},{15,18}
        };
        test_056 test = new test_056();
        test.merge(i_2);
        return;

    }
}
