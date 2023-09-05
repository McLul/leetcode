class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tempNum;
        for(int i = 0; i<nums.length-1; i++) {
            tempNum = nums[i];
            for (int ii = i+1; ii<nums.length;ii++)
            {
                if (tempNum + nums[ii] == target) {
                    return new int[] {i, ii};
                }
            }
        }
        return new int[] {};
    }
}