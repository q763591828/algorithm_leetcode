package LeetCode.other;

public class test_172 {
    public static int trailingZeroes(int n) {
        int i = 5;
        int result = 0;

        while (i <= n ){

            if(i%10 == 0){
                int sum_0 = 1;
                int tmp_i = i/10;
                while (tmp_i%10 == 0){
                    sum_0++;
                    tmp_i /= 10;
                }

                tmp_i *= 2;
                if(tmp_i%10 == 0){
                    sum_0++;
                }
                tmp_i = tmp_i/10;

                while (tmp_i%10 ==5 ){
                    sum_0++;
                    tmp_i *= 2;
                }

                result += sum_0;

            }else {
                int sum_0 = 1;
                int tmp_i = i*2;
                tmp_i = tmp_i/10;

                while (tmp_i%10 ==5 ){
                    sum_0++;
                    tmp_i *= 2;
                }
                result += sum_0;
            }
            
            i+=5;
        }

        return result;

    }

    public static void main(String[] args){

        trailingZeroes(200);


    }
}
