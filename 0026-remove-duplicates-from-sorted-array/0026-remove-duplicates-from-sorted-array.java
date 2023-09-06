class Solution {
    public int removeDuplicates(int[] nums) {
        
        /* future improvement idea : keep track of moved spaces and only check values beyond those rather than going back and rewriting entire loop */
        int result = 1; //result starts at one because we need to add the last unique value that wont be incorpotated into the loop
        int lastPosition;
        for (int i = 0; i<nums.length-1;i++) {
            lastPosition = i+1; // we are checking the next item in the list so we end early  and only check the next
            while (nums[lastPosition]==nums[i] && lastPosition < nums.length-1) { //if we have reached the last value and it is the same as the previous value do nothing
                lastPosition++;
            }
            if (lastPosition == nums.length-1 && nums[lastPosition] == nums[i]) { //last value is the same as i so we break the loop no more uniques
                break;
            } else if (lastPosition > i+1) { //a duplicate has been detected and we will overwrite it with next value to satisfy the inplace requirement
                for(int ii = i+1; ii < lastPosition; ii++) {
                    nums[ii]=nums[lastPosition];
                }  
            }
            result+=1; // wether there is a duplicate or not add one value to unique val counter
        }
        return result;
    }
}