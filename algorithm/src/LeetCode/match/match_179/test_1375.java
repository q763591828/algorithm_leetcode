package LeetCode.match.match_179;

public class test_1375 {

    public int numTimesAllBlue(int[] light) {
        int[] sign = new int[light.length];
        int res = 0;
        for(int i = 0 ; i < light.length ; ++i){
            sign[light[i]-1] = 1;
            int l_on = 0;

            for(int j = 0 ; j < light.length ; ++j){
                if(sign[j] == 1){
                    l_on++;
                    if(l_on == i+1){
                        res++;
                        break;
                    }
                }else {
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String [] args){
        test_1375 test_1375 = new test_1375();
        int[] n = {2,1,3,5,4};
        test_1375.numTimesAllBlue(n);
    }

}
