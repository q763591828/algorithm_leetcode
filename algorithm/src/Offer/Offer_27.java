package Offer;

import java.util.ArrayList;

public class Offer_27 {

    ArrayList<String> lists = new ArrayList();
    String str ;
    ArrayList<Character> c = new ArrayList<>();
    int[] sign;
    public void find(int index , StringBuilder s){
        int i = 0;
        for(; i < str.length() ; i++){
            if(sign[i] == 1)
                continue;
            else {
                s.append(str.charAt(i));
                sign[i] = 1;

                if(i > 0){
                    if(str.charAt(i) == str.charAt(i-1) && sign[i] != sign[i-1] ){
                        sign[i] = 0;
                        s.deleteCharAt(s.length()-1);
                        continue;
                    }
                }
                find(i+1,s);

                s.deleteCharAt(s.length()-1);
                sign[i] = 0;
            }
        }
        int j = 0;
        for(; j < str.length() ;j++){
            if(sign[j]==0)
                break;
        }
        if(j == str.length()){
            lists.add(s.toString());
        }
        return;
    }

    public ArrayList<String> Permutation(String str) {
        if(str == null || str.equals(""))
            return lists;

        //StringBuilder tmp_s = new StringBuilder();
        this.str = str;
        char tmp;

        /*for(int i = 0 ; i< str.length() ; i++){
            tmp = str.charAt(i);
            if(!c.contains(tmp)){
                //tmp_s.append(tmp);
                c.add(tmp);
            }
        }*/
        //this.str = tmp_s.toString();
        sign = new int[str.length()];

        StringBuilder s = new StringBuilder();
        find(0,s);
        return lists;
    }

    public static void main(String[] args){
        Offer_27 offer_27 = new Offer_27();
        String s = "aabc";
        offer_27.Permutation(s);
    }
}
