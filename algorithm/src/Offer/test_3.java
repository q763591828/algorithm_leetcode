package Offer;

public class test_3 {

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;

        int result=1;
        int max_result=1;
        int lastIndex;
        //int sign =0 ;

        String s_tmp = s.substring(0,1) ;
        String s_find_lastIndex = s_tmp;

        for(int i = 1,begin=0 ; i< s.length() ; i++){

            s_find_lastIndex = s.substring(0,i);
            String s_wait_compare = s.substring(i,i+1);
            if( (lastIndex = s_tmp.lastIndexOf(s_wait_compare) )!= -1){ //包含的情况

                lastIndex = s_find_lastIndex.lastIndexOf(s_wait_compare);
                System.out.println(lastIndex);


                begin = lastIndex+1;

                s_tmp = s.substring(begin,i+1);
                result = i+1 -begin ;
                continue;
            }else{ //不包含的情况

                s_tmp = s.substring(begin,i+1);
                result++;
                if(max_result < result){
                    max_result = result;
                }
                System.out.println(s_tmp);


            }
        }
        return max_result;
    }

    public static void main(String args[]){
        String s = "bbtablud";
        String tmp_s = s.substring(0,3);

        char s_1 = s.charAt(0);
        System.out.println(s_1);
        System.out.println(tmp_s);
        lengthOfLongestSubstring(s);

        return ;

    }
}
