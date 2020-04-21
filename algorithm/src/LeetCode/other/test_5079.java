package LeetCode.other;

import java.util.*;

public class test_5079 {

    public int[] arraysInter_two(int[] arr1, int[] arr2){
        int min = 0;
        min = arr1.length < arr2.length ? arr1.length : arr2.length;
        int[] ans = new int[min];
        int index = 0 ,a=0,b=0;
        while (a<arr1.length && b< arr2.length){
            if(arr1[a] == arr2[b]){
                ans[index++] = arr1[a];
                a++;
                b++;
            }else if(arr1[a] < arr2[b]){
                a++;
            }else {
                b++;
            }
        }

        return Arrays.copyOf(ans,index);
    }


    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

        int [] tmp_arr = arraysInter_two(arr1,arr2);
        int [] ans = arraysInter_two(tmp_arr,arr3);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < ans.length ; i++){
            list.add(ans[i]);
        }
        return  list;



        /*int max = 0 ;
        max = arr1.length > arr2.length ? arr1.length : arr2.length;
        max = max > arr3.length ? max : arr3.length;
        int[] ans = new int[max];

        int min = 1000;
        min = arr1.length < arr2.length ? arr1.length : arr2.length;
        min = min < arr3.length ? min : arr3.length;

        int[]

        int i_1=0,i_2=0,i_3 = 0,ans_i = 0;
        while (i_1 < arr1.length && i_2 < arr2.length && i_3 < arr3.length){
            if(arr1[i_1] == arr2[i_2]  && arr1[i_1] == arr3[i_3]){
                ans[ans_i] = i_1;
                ++ans_i;
                ++i_1;
                ++i_2;
                ++i_3;
            }else if(ans[i_1] < arr2[i_2] && arr1[i])
        }

        int ans_i = 0 ;

        Set<Integer> set = new HashSet<>();
        Set<Integer> second_set = new HashSet<>();
        for(int i = 0 ; i< arr1.length ; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < min ; i++){
            if(set.contains(arr2[i])){
                second_set.add(arr2[i]);
            }
        }

        for(int i = 0 ; i< min ; i++)
*/




    }


    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5} , arr2 = {1,2,5,7,9} , arr3 = {1,3,4,5,8};


        test_5079 test = new test_5079();
        test.arraysIntersection(arr1,arr2,arr3);



    }
}
