class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) { // clean up edge cases to optimize bottom code
            return 0;
        } else if (nums.length == 1){ 
            if (nums[0] == val) {
                return 0;
            }
            return 1;
        }
        int pointedPosition = 1;
        int result = 0;
        int placeHolder;
        for (int  i = 0; i < nums.length-1; i++) {
            pointedPosition = i+1;
            result = i;
            while (nums[i] == val && pointedPosition < nums.length) {
                if (nums[pointedPosition] != val) {
                    placeHolder = nums[i];
                    nums[i] = nums[pointedPosition];
                    nums[pointedPosition] = placeHolder;    // insertion sort it out meets constraint of in place
                }   
                pointedPosition++;
            }
            if (pointedPosition == nums.length) { 
                return nums[result] == val ? result : result + 1; // case:we have atleast one deleted element so does current element match
            }
        }
        return nums[result+1] == val ? result+1 : result + 2; // case: no deleted elements so check last element 
    }
}