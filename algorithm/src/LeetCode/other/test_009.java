package LeetCode.other;

public class test_009 {
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        String tmp_x = String.valueOf(x);
        int x_size = tmp_x.length();

        //char a = tmp_x.charAt(2);

        for(int i = 0,j = x_size-1 ; i < j ; i++,j--) {
            if (tmp_x.charAt(i) == tmp_x.charAt(j))
                continue;
            else
                return false;
        }

        return true;

    }

    public static void main(String[] args){

        boolean c = test_009.isPalindrome(10);

        return;
    }
}
