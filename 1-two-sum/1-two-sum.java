class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        target -= nums[index];
        while (index < nums.length-1) {
          for (int i = index+1; i < nums.length; i++) {
                if (target - nums[i] == 0)
                {
                    return new int[] {index, i};
                }
            }
            target += nums[index++] - nums[index];
        }
        return new int[] {};
    }
}