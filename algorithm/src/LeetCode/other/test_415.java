package LeetCode.other;

public class test_415 {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length()-1, j = num2.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i>=0) carry += num1.charAt(i--)-'0';
            if(j>=0) carry += num2.charAt(j--)-'0';
            sb.append(carry%10);
            carry /= 10;
        }
        return sb.reverse().toString();
        /*if(num1 == "")
            return num2;
        if(num2 == "")
            return num2;

        String tmp = new String();
        StringBuilder result = new StringBuilder();
        //保证 num1是长度最长的
        if(num1.length() < num2.length()){
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }


        int carry = 0;
        for(int i_1 = num1.length() -1 ,i_2 = num2.length()-1 ; i_2 >= 0 ; i_2-- , i_1--){
            int a = num1.charAt(i_1) - '0';
            int b = num2.charAt(i_2) - '0';
            int c = a+b + carry;
            if(c > 9){
                carry =1;
                c -= 10;
            }
            else
                carry = 0;

            result = String.valueOf(c) + result;
        }

        for( int i = num1.length()-num2.length() -1 ; i >= 0   ; i--){

            int a = num1.charAt(i) - '0';
            int c = a+ carry;
            if(c> 9){
                carry = 1;
                c -= 10;
            }else
                carry = 0;

            result = String.valueOf(c) + result;
        }

        if(carry == 1){
            result = "1" + result;
        }

        return result;*/

    }

    public static void main(String[] args){
        int c = Integer.MAX_VALUE;


        String nums1  = "15774";
        String nums2 = "982377";
        test_415  test = new test_415();
        test.addStrings(nums1,nums2);
    }
}
