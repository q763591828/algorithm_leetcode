package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_015 {

    public static int find(int left_num , int right_num){
        return 0;
    }


    public static  List<List<Integer>> threeSum(int[] nums) {





        List<List<Integer>> lists = new ArrayList<>();


        int left_num = 0,right_num=nums.length,key =0,middle_num=0,tmp_middle=0;
        Arrays.sort(nums);

        //int num =Arrays.binarySearch(nums,0,6,-4);

        int sum_zero = 0;

        for(int i = 0 ; i < right_num ; i++){
            if(nums[i] == 0 && sum_zero == 0){
                middle_num=i;
                sum_zero++;
            }else if(nums[i]==0){
                sum_zero++;
            }else if(nums[i]>0 && sum_zero == 0){
                middle_num = i;
                break;
            }
        }



        if(sum_zero >= 3 ){
            ArrayList<Integer> tmp_list = new ArrayList<>();
            tmp_list.add(0);
            tmp_list.add(0);
            tmp_list.add(0);
            lists.add(tmp_list);
        }


        //int a = Arrays.binarySearch(nums,12,20,-);


        for(int i = 0 ; i< middle_num ; i++){
            for(int j = right_num-1 ; j >= middle_num ; j--){


                if(i != 0 ){
                    if( nums[i] == nums[i-1])
                        continue;
                }
                if(j!= right_num-1){
                    if(nums[j] == nums[j+1])
                        continue;
                }


                if( (key = (nums[i]+nums[j])) >= 0){ //需要找一个负数
                    if(  (tmp_middle = Arrays.binarySearch(nums,i+1,middle_num+1,-key) )>= 0){

                        //{right_num,middle_num,tmp_middle}
                    }else if(tmp_middle < 0){
                        continue;
                    }
                }else if(key < 0){//需要找一个正数
                    if( (tmp_middle = Arrays.binarySearch(nums,middle_num,j,-key))>= 0 ) {

                    }else if(tmp_middle < 0)
                        continue;

                }

                lists.add(Arrays.asList(nums[i],nums[tmp_middle],nums[j]));


            }
            //find(left_num,right_num);


        }



        return lists ;
    }


    public static void main(String[] args){

        int[] nums = new int[]{6,-5,-6,-1,-2,8,-1,4,-10,-8,-10,-2,-4,-1,-8,-2,8,9,-5,-2,-8,-9,-3,-5};




        test_015.threeSum(nums);
    }
}
