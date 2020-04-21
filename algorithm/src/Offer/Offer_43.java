package Offer;

public class Offer_43 {

    public StringBuilder reverse(StringBuilder s,int b , int e){
        //int b = 0 , e = s.length()-1;
        while ( b < (b+e+1)/2){
            char tmp = s.charAt(b);
            s.setCharAt(b,s.charAt(e));
            s.setCharAt(e,tmp);
            b++;
            e--;
        }
        return s;

    }

    public String LeftRotateString(String str,int n) {
        if(str.equals(""))
            return str;

        n %=str.length();
        StringBuilder s = new StringBuilder(str);
        reverse(s,0,s.length()-1);
        reverse(s,0,s.length()-n-1);
        reverse(s,s.length()-n,s.length()-1);
        return s.toString();
    }

    public static void main(String[] args){
        Offer_43 offer_43 = new Offer_43();
        offer_43.LeftRotateString("abc",-1);
    }
}
