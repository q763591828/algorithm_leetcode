package LeetCode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if(nums1.length > nums2.length){
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        for(int i = 0,j = 0 ;i < nums1.length && j< nums2.length ; i++){
            if(i!= 0 && nums1[i]== nums1[i-1])  continue;

            if (nums1[i] == nums2[j])
                list.add(nums1[i]);
            else if(nums1[i] > nums2[j]){
                j++;
                i--;
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0 ; i<ans.length ; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums1 = {2,6,2,9,1}, nums2 = {7,1};
        test_349 test = new test_349();
        test.intersection(nums1,nums2);


    }
}
