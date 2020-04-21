package Offer;

public class test_5 {


    public static String[][] db = new String [10][10];

    public static String sum_s;

    public static String max_back(int i,int j){

        if(i==j){
            db[i][j] = "";
            return db[i][j];
        }

        if(db[i][j] != null){
            return db[i][j];
        }

        if(i==j-1){
            db[i][j] = sum_s.substring(i,j);
            //System.out.println(db[i][j]);
            return db[i][j];
        }

        String s_tmp = sum_s.substring(i,j);
        //System.out.println(s_tmp);

        int s_tmp_length = s_tmp.length();
        //int sign = -1;
        for(int k = 0 ; k<= s_tmp_length/2-1 ; k++){
            if(s_tmp.charAt(k) == s_tmp.charAt(s_tmp_length - k -1)){
                //sign++;
                if(k == s_tmp_length/2-1){
                    db[i][j] = sum_s.substring(i,j);

                    return db[i][j];
                }
                continue;
            }else{
                break;
            }
        }

        String s_i = max_back(i+1,j);
        String s_j = max_back(i,j-1);

        if(s_j.length() > s_i.length()){
            db[i][j] = s_j;
            return db[i][j];
        }else{
            db[i][j] = s_i;
            return db[i][j];
        }


    }


    public static String longestPalindrome(String s) {
        if(s=="")
            return "";

        String result = max_back(0, s.length());


        return null;


    }

    public static void main(String args[]) {




        /*for(int i = 0 ; i< 10 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                db[i][j] = null;
            }
        }*/
        //String [][] a= new String[1000][1000];
        String s = "cbbd";
        sum_s = s;
        System.out.println(sum_s.substring(0,4));
        //String s_tmp = s.charAt(0) + "";

        //System.out.println( s_tmp);
        longestPalindrome(s);
    }
}
