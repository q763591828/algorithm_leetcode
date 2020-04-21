package LeetCode.array.easy;

import java.util.Arrays;

public class test_088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        int i = 0 , j = 0,tmp = 0;

        while (i < nums1.length){
            if(i >= m){
                nums1[i] = nums2[j];
                i++;
                j++;
                continue;
            }


            if(nums1[i] > nums2[j]){
                tmp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = tmp;
                Arrays.sort(nums2);
            }
            i++;
        }

    }

    public static void main(String[] args){
        int[]nums1 = {4,5,6,0,0,0}, nums2 ={1,2,3};
        int m = 3 , n =3;
        test_088 test = new test_088();
        test.merge(nums1,m,nums2,n);
        return;
    }
}
