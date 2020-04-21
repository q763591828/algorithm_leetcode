package Offer;

public class Offer_02_new {

    public String replaceSpace(StringBuffer str) {


        int p1=str.length()-1;
        for(int e = 0;e <= p1; e++){
            if(str.charAt(e) == ' '){
                str.append("  ");
            }
        }

        int p2=str.length()-1;
        while (p1>-1){
            char t_c = str.charAt(p1);
            if(t_c!= ' '){
                str.setCharAt(p2,t_c);
                p2--;
            }else {
                str.replace(p2-2,p2+1,"%20");
                p2-=3;
            }
            p1--;

        }

        return str.toString();

    }


    public static void main(String[] args){
        Offer_02_new offer_02_new = new Offer_02_new();
        StringBuffer str = new StringBuffer("hi my world sdf s   sdf");
        //str.setCharAt(0,'a');
        offer_02_new.replaceSpace(str);
    }
}
