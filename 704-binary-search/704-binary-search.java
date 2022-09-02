class Solution {
    public int search(int[] nums, int target) {
        int index = (int)Math.floor(nums.length/2);
        int lowerBound = 0;
        int upperBound = nums.length-1;
        while (nums[index] != target && lowerBound != upperBound) {
            if (nums[index] < target) {
                lowerBound = index+1;
            } else if (nums[index] > target) {
                upperBound = index-1;
            } 
            index = (int)Math.floor(((upperBound - lowerBound)/2) + lowerBound);
        }
        if (nums[index] == target) {
            return index;
        } else {
            return -1;
        }
    }
}