package LeetCode.other;

import java.util.ArrayList;

public class test_007 {

    public static  int reverse(int x) {

        int sign=0;
        if( x > 0 ){
            sign = 1;
        }else if( x < 0){
            sign = -1;
        }else{
            return 0;
        }

        /*int max_num = 2;

        int max_num_bit = 31;

        max_num = max_num << max_num_bit -1 ;
        System.out.println(max_num );
        System.out.println(Integer.MAX_VALUE );

        System.out.println(1534236469 );*/


        int tmp = x;
        int result=0;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while(tmp!= 0 ){


            arrayList.add(tmp % 10 );
            tmp = tmp/10;
        }

        int num = arrayList.size();


        int multiplier = 1;
        for(int i = 0 ; i < num-1  ; i++ ){
            multiplier = multiplier * 10;
        }

        for(int i = 0 ; i< arrayList.size() ; i++){


            if(num==10){
                if( arrayList.get(0) > 2){
                    return 0;
                }
            }
            //if( > Integer.MAX_VALUE || );

            result = result + arrayList.get(i) * multiplier;


            if(sign == 1){
                if(result < 0 ){
                    return 0;
                }
            }else if(sign == -1 ){
                if(result > 0){
                    return 0;
                }
            }



            multiplier = multiplier/10;
        }

        return result;
    }



    public static void main(String[] args){

        test_007.reverse(1534236469);

    }

}
