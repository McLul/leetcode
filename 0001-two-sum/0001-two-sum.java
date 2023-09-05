class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tempNum;
        for(int i = nums.length-1; i>0; i--) {
            tempNum = nums[i];
            for (int ii = i-1; ii>=0;ii--)
            {
                if (tempNum + nums[ii] == target) {
                    return new int[] {i, ii};
                }
            }
        }
        return new int[] {};
    }
}