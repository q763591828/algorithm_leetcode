package LeetCode.math.easy;

public class test_067 {

    public int transfrom(char tmp){
        if(tmp == '1')
            return 1;
        else
            return 0;
    }

    public char[] generateCharArray(String tmp){
        char[] ans = new char[tmp.length()];
        for(int i = 0 ; i< tmp.length() ;i++){
            ans[i] = tmp.charAt(i);
        }
        return ans;
    }

    public String addBinary(String a, String b) {
        if(b.length()>a.length()){
            String tmp = a;
            a=b;
            b=tmp;
        }
        char[] t_a = generateCharArray(a);
        char[] t_b = generateCharArray(b);

        StringBuilder s = new StringBuilder();
        int carry = 0;

        int n_a=0,n_b=0,c = 0,sum=0;
        for(int i = b.length()-1,j=a.length()-1; i>=0; i--,j--){
            n_a = transfrom(t_a[j]);
            n_b = transfrom(t_b[i]);

            sum = n_a+n_b+c;
            s.append(sum%2);
            c=sum/2;
        }

        for(int i = a.length()-b.length()-1 ; i >= 0 ;i--){
            n_a = transfrom(t_a[i]);
            sum = n_a+c;
            s.append(sum%2);
            c=sum/2;
        }

        if(c==1)
            s.append(c);

        return s.reverse().toString();
    }

    public static void main(String[] args){
        test_067 test = new test_067();
        test.addBinary("1010","1011");
    }
}
