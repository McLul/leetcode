class Solution {
    public boolean check(int[] nums) {
        int firstNum = nums[0];
        int highestNum = 0;
        int rotation = 0;
        boolean result = true;
        if (nums.length == 1) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] >= highestNum)) {
                rotation += 1;
            } 
            if (rotation > 1) {
                return false;
            }
            highestNum = nums[i];
        }
        if (firstNum < nums[nums.length-1] && rotation > 0) {
            return false;
        }
        return result;
    }
}