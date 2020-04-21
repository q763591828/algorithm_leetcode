package LeetCode.other;

public class test_058 {
    public int lengthOfLastWord(String s) {
        /*String[] strs = s.split(" ");
        int result=0;

        for(String s_tmp : strs){
            if(s_tmp != "")
                result = s_tmp.length();
        }
        return result;*/

        if(s.equals("") || s==null)
            return 0;
        int begin = 0,end_blank = 0;

        for(int i= 0 ; i< s.length() ; i++){
            if(s.charAt(i) !=' ' && (i==0 || (i!= 0 && s.charAt(i-1)==' '))){
                begin = i;
            }
            if(s.charAt(i) == ' ' && ( i == 0 || (i!=0 && s.charAt(i-1)!=' '))){
                end_blank = i;
            }
        }

        if(begin > end_blank)
            return s.length() - begin;
        else if( begin != 0 && end_blank!=0)
            return end_blank-begin;
        else if(end_blank == 0 && begin == 0)
            return 0;
        else if(end_blank == 0 && begin!=0)
            return begin-end_blank;
        else if(begin==0 && end_blank!=0)
            return end_blank - begin;
        else
            return 0;

    }

    public static void main(String[] args){
        String s = " ";
        test_058 test = new test_058();
        int result = test.lengthOfLastWord(s);

        return;
    }
}
