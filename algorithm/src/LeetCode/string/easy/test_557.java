package LeetCode.string.easy;

public class test_557 {

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder(),ans = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c!=' '){
                stringBuilder.append(c);
            }else if(c==' '){
                stringBuilder.reverse();
                ans.append(stringBuilder);
                ans.append(' ');
                stringBuilder = new StringBuilder();
            }
        }
        if(!stringBuilder.equals("")){
            stringBuilder.reverse();
            ans.append(stringBuilder);
        }
        return ans.toString();
    }

    public static void main(String[] args){
        test_557 test = new test_557();
        String s = "";
        test.reverseWords(s);
    }
}
