package LeetCode.greedy.easy;

import java.util.ArrayList;
import java.util.List;

public class test_860 {

    public boolean lemonadeChange(int[] bills) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        int remain = 0,tmp_0 = 0 , tmp_1=0,sign = 0;//sign=0表示是第一次的钱数
        for(int i = 0 ; i< bills.length ; i++){
            remain = bills[i]-5;
            if(remain == 0) { //直接给的5元
                list.set(0,list.get(0)+1);
                continue;
            }

            if(remain == 5){ //增加10钞票的数量
                list.set(1,list.get(1)+1);
            }

            while (remain !=0){
                tmp_0 =list.get(0);
                tmp_1 = list.get(1);
                if(remain>=10 && tmp_1!=0){ //还有10元钞票
                    remain -= 10;
                    list.set(1, tmp_1 - 1);
                    continue;
                }else if(tmp_0!=0){ //没有10元钞票,但是还有5元
                    remain-= 5;
                    list.set(0,tmp_0-1);
                    continue;
                }else //既没有10元也没有5元，返回false
                    return false;

            }

        }

        return true;
    }

    public static void main(String[] args){
        int[] table = {5,5,10,10,20};
        test_860 test = new test_860();
        test.lemonadeChange(table);
    }
}
