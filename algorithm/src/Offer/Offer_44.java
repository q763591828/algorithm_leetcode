package Offer;

public class Offer_44 {

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


    public String ReverseSentence(String str) {
        StringBuilder s = new StringBuilder(str);
        reverse(s,0,s.length()-1);
        int b = 0 , e = 0;
        while (e < s.length()){
            if(e!=0   && s.charAt(e) == ' ' ){
                reverse(s,b,e-1);
                b=e+1;
            }
            if( e == s.length()-1)
                reverse(s,b,e);

            e++;
        }
        return s.toString();
    }

    public static void main(String[] args){
        Offer_44 offer_44 = new Offer_44();
        offer_44.ReverseSentence("");
    }
}
