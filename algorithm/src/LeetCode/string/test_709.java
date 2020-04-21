package LeetCode.string;

public class test_709 {
    public String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i< str.length() ; i++){
            int tmp_char = str.charAt(i)-'a';
            if(tmp_char <= -7 &&tmp_char>=-32)
                tmp_char+=32;
            stringBuilder.append((char)(tmp_char+'a'));
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        String str = "aAzZ cCdD";
        test_709 test = new test_709();
        String new_str = test.toLowerCase(str);

        return;
    }
}
