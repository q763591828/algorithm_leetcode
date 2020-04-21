package LeetCode.match.match_178;

public class test_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for(int i =0 ; i < nums.length ; ++i){
            int tmp = 0;
            for(int j = 0 ; j < nums.length ; ++j){
                if(nums[i] > nums[j]){
                    ++tmp;
                }
            }
            res[i] = tmp;
        }

        return res;
    }
}
