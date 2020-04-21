package LeetCode.other;

import java.util.*;

public class test_049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
            return null;
        Map<String,List<String>> contrast = new HashMap<>();
        List<List<String>> result = new LinkedList<>();
        for(int i = 0 ; i< strs.length ;i++){
            char[] tmp_str = strs[i].toCharArray();
            Arrays.sort(tmp_str);
            String tmp_key = String.valueOf(tmp_str);
            if(!contrast.containsKey(tmp_key)){
                List<String> list = new LinkedList<>();
                list.add(strs[i]);
                contrast.put(tmp_key,list);
            }else{
                contrast.get(tmp_key).add(strs[i]);
            }
        }

        for(List<String> tmp : contrast.values()){
            result.add(tmp);
        }
        return result;

    }

    public static void main(String[] args){
        test_049 test = new test_049();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] s= null;
        test.groupAnagrams(s);
    }
}
