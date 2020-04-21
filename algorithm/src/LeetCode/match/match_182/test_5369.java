package LeetCode.match.match_182;

public class test_5369 {

    public int numTeams(int[] rating) {
        int sum = 0 ;
        for(int i =0 ; i< rating.length-2 ; ++i){
            for(int j = i+1 ; j < rating.length-1 ; ++j ){
                for(int k = j+1 ; k < rating.length ; ++ k ){
                    if(rating[i] > rating[j]){
                        if(rating[j] > rating[k])
                            ++sum;
                    }else if(rating[i]  < rating[j]){
                        if(rating[j] < rating[k])
                            ++sum;
                    }else //相等了直接跳出本次循环
                        break;
                }
            }
        }
        return sum;
    }

}
