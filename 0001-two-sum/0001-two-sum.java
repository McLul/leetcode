class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length-1; i++) {
            for (int ii = i+1; ii<nums.length;ii++)
            {
                if (nums[i] + nums[ii] == target) {
                    return new int[] {i, ii};
                }
            }
        }
        return new int[] {};
    }
}