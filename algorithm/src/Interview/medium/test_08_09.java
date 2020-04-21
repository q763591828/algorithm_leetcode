package Interview.medium;

import java.util.ArrayList;
import java.util.List;

public class test_08_09 {

    List<String> list = new ArrayList<>();

    public void solve(int res, StringBuilder s,int num){
        if(res < 1 && num==0){
            list.add(s.toString());
            return ;
        }

        if(res > 0) {
            StringBuilder tmp_s = new StringBuilder(s);
            tmp_s.append("(");
            solve(res - 1, tmp_s, num + 1);
        }
        if(num > 0) {
            s.append(')');
            solve(res, s, num - 1);
        }
        return ;
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        solve(n,s,0);
        return list;
    }

    public static void main(String[] args){
        test_08_09 test_02_02 = new test_08_09();
        test_02_02.generateParenthesis(0);
    }
}
