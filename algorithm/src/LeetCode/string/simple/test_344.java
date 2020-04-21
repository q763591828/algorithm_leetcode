package LeetCode.string.simple;

public class test_344 {

    public void reverseString(char[] s) {
        if(s.length == 0 ) return;
        int end = s.length-1;
        for(int i = 0 ; i <= end/2 ; i++){
            char tmp = s[i];
            s[i] = s[end-i];
            s[end-i] = tmp;
        }
    }
}
