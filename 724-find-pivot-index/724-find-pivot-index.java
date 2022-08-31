class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        int index = 0;
        int result = -1;
        while (index < nums.length) {
            if (rightSum - nums[index] == leftSum) {
                result = index;
                break;
            }
            leftSum += nums[index];
            rightSum -= nums[index++];
        }
        return result;
    }
}