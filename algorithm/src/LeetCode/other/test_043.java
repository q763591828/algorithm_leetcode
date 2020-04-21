package LeetCode.other;

import java.util.LinkedList;
import java.util.List;

public class test_043 {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        List<StringBuilder> list = new LinkedList<>();
        for(int i = num2.length()-1 ; i >= 0; i-- ){
            int carry = 0;
            StringBuilder stringBuilder = new StringBuilder();
            for( int j = num1.length()-1 ; j >= 0 ; j--){
                carry += (num2.charAt(i) - '0') * (num1.charAt(j)-'0');
                stringBuilder.insert(0,carry%10);
                carry/=10;
            }
            if(carry!=0) stringBuilder.insert(0,carry);
            list.add(stringBuilder);
        }

        result.append(list.get(0));

        for(int i = 1 ; i< list.size() ; i++){

            StringBuilder tmp_String = list.get(i);
            int result_index = result.length() - i -1 ;
            int add_index = tmp_String.length()-1;
            int carry = 0 ;
            while ( result_index >= 0 || add_index >= 0 ){
                if(result_index>=0){
                    carry += (result.charAt(result_index)-'0') + (tmp_String.charAt(add_index) - '0');
                    result.setCharAt(result_index, (char)(carry%10 + '0'));
                }else{
                    carry+=(tmp_String.charAt(add_index)-'0');
                    result.insert(0,carry%10);
                }
                result_index--;
                add_index--;
                carry/=10;
            }

            if(carry!=0){
                result.insert(0,carry);
            }
        }

        return result.toString();
    }


    public static void main(String[] args){
        String num1 = "123456789", num2 = "987654321";

        test_043 test = new test_043();
        String a = test.multiply(num1,num2);

        return;
    }


}
