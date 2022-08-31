class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        int tempTarget = target - nums[index];
        while (index < nums.length-1) {
          for (int i = index+1; i < nums.length; i++) {
                if (tempTarget - nums[i] == 0)
                {
                    return new int[] {index, i};
                }
            }
            index += 1;
            tempTarget = target - nums[index];
        }
        return new int[] {};
    }
}