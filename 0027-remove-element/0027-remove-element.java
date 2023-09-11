class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int pointedPosition = 1;
        int result = 0;
        int placeHolder;
        for (int  i = 0; i < nums.length-1; i++) {
            pointedPosition = i+1;
            while (nums[i] == val && pointedPosition < nums.length) {
                if (nums[pointedPosition] != val) {
                    placeHolder = nums[i];
                    nums[i] = nums[pointedPosition];
                    nums[pointedPosition] = placeHolder;   
                }   
                pointedPosition++;
            }
            if (pointedPosition == nums.length) {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return result;
            } else {
                result++;
            }
        }
        return result;
    }
}