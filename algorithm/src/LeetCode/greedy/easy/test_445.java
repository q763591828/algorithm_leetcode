package LeetCode.greedy.easy;

import java.util.Arrays;

public class test_445 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int g_i = g.length -1,s_i = s.length -1;
        while (s_i != -1 && g_i!=-1){
            if(s[s_i] < g[g_i]){
                g_i--;
            }else {
                s_i--;
                g_i--;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        test_445 test = new test_445();
        int[] g= {1,2,3};
        int[] s ={1,1};
        test.findContentChildren(g,s);
    }
}
