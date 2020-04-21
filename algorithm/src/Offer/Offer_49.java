package Offer;

public class Offer_49 {
    public int StrToInt(String str) {
        if(str.equals("") || str == null)
            return 0;

        int result = 0;
        int sign = 0,last = -1;

        char b_c = str.charAt(0);
        if(b_c == '-'){
            sign = -1;
            last = 0;
        }
        else if(b_c == '+') {
            sign = 0;
            last = 0;
        }


        for(int i = str.length()-1 ; i >  last ; i--){
            char c = str.charAt(i);
            if(c<'0' || c>'9')
                return 0;
            int before = result;
            int tmp = (int) ((c-'0')*Math.pow(10,str.length()-i-1));
            if(sign == -1){
                if(result <Integer.MIN_VALUE + tmp)
                    return 0;
                result += - tmp;
            }else {
                if(result > Integer.MAX_VALUE - tmp ) //溢出
                    return 0;
                result+= tmp;
            }

        }


        return result;
    }

    public static void main(String[] args){
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        String str = "";
        Offer_49 offer_49 = new Offer_49();
        offer_49.StrToInt(str);
    }
}
