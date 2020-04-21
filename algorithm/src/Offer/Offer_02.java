package Offer;

public class Offer_02 {

    public static String replaceSpace(StringBuffer str) {

        String p = str.toString();
        String str_result = "";
        String str_tmp;
        //int []sign = new int[1000];

        int begin = 0 ;
        for(int end = 0 ; end < p.length() ; end++){
            if(  p.charAt(end) == ' ' ){
                str_tmp = p.substring(begin,end);
                str_result = str_result+ str_tmp + "%20";
                begin =end +1;
            }

            if( end == p.length() -1 ){
                str_tmp = p.substring(begin,end+1);
                str_result = str_result+ str_tmp;
            }

        }

        System.out.println(str_result);
        return str_result;
    }


    public static void main(String[] args){
        StringBuffer str = new StringBuffer("We Are Happy");
        replaceSpace(str);
        return;
    }
}
