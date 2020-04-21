package LeetCode.array.easy;

public class test_066 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
        /*int length = digits.length,carry = 1;
        List<Integer> list = new ArrayList<>();



        for(int i = length-1 ; i >= 0 ; i--){
            int sum = digits[i] + carry;
            carry = sum/10;
            list.add(0,sum%10);
        }

        if(carry!=0){
            list.add(0,1);
        }

        int[] result = new int[list.size()];
        for(int i = 0 ; i< list.size() ;i ++){
            result[i] = list.get(i);
        }

        return result;
*/

    }

    public static void main(String[] args){
        test_066 test = new test_066();
        int[] digits = {9,9};


        test.plusOne(digits);


    }
}
