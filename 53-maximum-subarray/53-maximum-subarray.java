class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > largestSum || i == 0) {
                largestSum = currentSum;
                if(nums.length-1-i > 0 && currentSum < 0) {
                    currentSum = 0;
                }
            } else if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return largestSum;
    }
}