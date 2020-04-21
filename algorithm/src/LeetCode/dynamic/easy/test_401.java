package LeetCode.dynamic.easy;

import java.util.ArrayList;
import java.util.List;

public class test_401 {

    int[] times = {8,4,2,1,32,16,8,4,2,1};
    int num;
    List<String> ans = new ArrayList<>();
    int [] hours = {1,2,4,8};
    int [] minutes = {1,2,4,8,16,32};

    public void find(int res_num ,int index ,List<Integer> list,int remain){
        if(res_num > 10 - index)
            return;

        if(res_num==0){
            int hours =0;
            int minutes = 0;
            StringBuilder s = new StringBuilder();

            for(Integer i :list){
                if(i<4){
                    hours += times[i];
                }else {
                    minutes+= times[i];
                }
            }
            s.append(hours);
            s.append(":");
            if(hours>=12 || minutes ==60)
                return;

            if(minutes >9){
                s.append(minutes);
            }else if(minutes>0 && minutes < 10){
                s.append(0);
                s.append(minutes);
            }else {
                s.append("00");
            }

            ans.add(s.toString());
            return;
        }
        //记住还可以有剪枝操作
        List tmp_l = new ArrayList(list);
        tmp_l.add(index);
        find(res_num-1,index+1,tmp_l,remain-1); //选了index的数
        find(res_num,index+1,list,remain); //没有选index的数
    }

    public List<String> readBinaryWatch(int num) {
        if(num == 0){
            ans.add("0:00");
            return ans;
        }

        this.num = num;
        List<Integer> list = new ArrayList<>();
        find(num,0,list,10);

        return ans;
    }

    public static void main(String[] args){
        test_401 test = new test_401();
        test.readBinaryWatch(2);
    }
}
