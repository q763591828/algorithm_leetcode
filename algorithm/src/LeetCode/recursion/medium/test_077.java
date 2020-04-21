package LeetCode.recursion.medium;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test_077 {
    private List<List<Integer>> lists = new ArrayList<>();

    public void find_combine(int n, int k , int index , List<Integer> list){
        if(k == 0){
            lists.add(list);
            return;
        }

        if(index > n || k > n-index+1)
            return;

        List<Integer> new_list = new ArrayList<>(list);
        new_list.add(index);

        find_combine(n,k-1,index+1,new_list);       //选了该index的数
        find_combine(n,k,index+1,list);                   //没有选该index的数
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        find_combine(n,k,1,list);

        return  lists;
    }

    public static void main(String[] args){
        test_077 test = new test_077();
        test.combine(4,2);
    }
}
