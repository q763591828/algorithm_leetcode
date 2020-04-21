package LeetCode.greedy.easy;

public class test_1221 {

    public int balancedStringSplit(String s) {
        int r=0,l=0,ans=0;
        char c ;
        for(int i = 0 ; i < s.length();i++){
            c = s.charAt(i);
            if(c == 'R')
                r++;
            else
                l++;
            if(r==l && r!=0){
                ans++;
                r =0 ;
                l = 0;
            }
        }

        return ans;
    }
}
