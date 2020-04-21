package LeetCode.match.match_184;

public class test_5382 {

    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder(text);
        String s = null;
        for(int i = 0 ; i < sb.length() ; ++i ){
            if(sb.charAt(i) == '&'){
                s = sb.substring(i+1,i+4);
                if(s.equals("gt;")){
                    sb.replace(i,i+4,">");
                    continue;
                }else if(s.equals("lt;")){
                    sb.replace(i,i+4,"<");
                    continue;
                }

                s= sb.substring(i+1,i+5);
                if(s.equals("amp;")){
                    sb.replace(i,i+5,"&");
                    continue;
                }

                s = sb.substring(i+1,i+6);
                if(s.equals("quot;")){
                    sb.replace(i,i+6,"\"");
                    continue;
                }else if(s.equals("apos;")){
                    sb.replace(i,i+6,"\'");
                    continue;

                }
                s = sb.substring(i+1,i+7);
                if(s.equals("frasl;")){
                    sb.replace(i,i+7,"/");
                    continue;
                }

            }

        }
        return sb.toString();
    }

    public static void main(String[] args){
        test_5382 test_5382 = new test_5382();
        String s = "leetcode.com&frasl;problemset&frasl;all";
        test_5382.entityParser(s);
    }
}
