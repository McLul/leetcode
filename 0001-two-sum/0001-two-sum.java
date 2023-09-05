class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tempNum;
        int tempNumTwo;
        for(int i = 0; i<nums.length-1; i++) {
            tempNum = nums[i];
            for (int ii = i+1; ii<nums.length;ii++)
            {
                tempNumTwo = nums[ii];
                if (tempNum + tempNumTwo == target) {
                    return new int[] {i, ii};
                }
            }
        }
        return new int[] {};
    }
}