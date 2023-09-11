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
                    nums[pointedPosition] = placeHolder;    // insertion sort it out meets constraint of in place
                }   
                pointedPosition++;
            }
            if (pointedPosition == nums.length) { // weve reached the end of our sort
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {  // once sorted just find out how long the array is until we reach a val
            if (nums[i] == val) {
                return result;
            } else {
                result++;
            }
        }
        return result;
    }
}