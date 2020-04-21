package LeetCode.greedy.medium;

import java.util.*;

public class test_763 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> ans_list = new ArrayList<>();
        List<Set>  lists= new ArrayList<>();
        char c;
        int sign =0;
        Set<Character> tmp_s = null;
        for(int i = 0; i< S.length() ; i++){
            c = S.charAt(i);
            for (int j = 0 ; j< lists.size();j++ ){
                tmp_s = lists.get(j);
                //如果包括c的话
                if(tmp_s.contains(c)){
                    sign =1; //标记:已经被前面的包含
                    for(int k = j+1 ; k < lists.size();){
                        tmp_s.addAll(lists.get(k));
                        lists.remove(k);
                        ans_list.set(j,ans_list.get(j)+ans_list.get(k));
                        ans_list.remove(k);
                    }
                    ans_list.set(j,ans_list.get(j)+1);

                }
            }
            //表示前面的集合都没有这个字符
            if(sign ==0){
                Set<Character> set = new HashSet<>();
                set.add(c);
                lists.add(set);
                ans_list.add(1);
            }else { //重新把标志改变
                sign=0;
            }
        }

        return ans_list;
    }

    public static void main(String[] args){
        test_763 test = new test_763();
        String s = "ababcbacadefegdehijhklij";
        //String s = "abaa";
        test.partitionLabels(s);
    }
}
