class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t;
        for(int i = nums.length-1; i>0; i--) {
            t = nums[i];
            for (int ii = i-1; ii>=0;ii--)
            {
                if (t + nums[ii] == target) {
                    return new int[] {i, ii};
                }
            }
        }
        return new int[] {};
    }
}