package LeetCode.other;

public class test_028 {


    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        if(haystack.length()<needle.length())
            return -1;

       for(int i = 0 ; i< haystack.length()-needle.length() +1; i++){

           int sign = 0;
           int next = 0;
           for(int j = 0 ; j< needle.length() ; j++){
               if(haystack.charAt(i+j) != needle.charAt(j)){
                   sign = 1;
                   break;
               }

           }

           if(sign == 0){
               return i;
           }
       }

       return -1;
    }


    public static void main(String[] args){
        String haystack = "a", needle = "a";



        int result = strStr(haystack,needle);

        return;
    }
}
