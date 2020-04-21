package LeetCode.other;

public class test_172_01 {
    public static int trailingZeroes(int n) {
        int i = 5,result = 0;
        while (i<=n){
            int sum_0 = 0;
            int tmp_i = i;
            while (tmp_i%10 == 0){
                sum_0++;
                tmp_i /= 10;
            }
            tmp_i *= 2;
            while (tmp_i%10 == 0){
                sum_0++;
                tmp_i /= 10;
                tmp_i *= 2;
            }

            result += sum_0;
            i += 5;
        }
        return result;

    }

    public static void main(String[] args){

        trailingZeroes(1808548329);


    }
}
