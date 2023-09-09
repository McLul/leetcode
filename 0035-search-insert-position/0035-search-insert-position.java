class Solution {
    public int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex != endIndex) { //binary search to satisfy log n req
            if (target > (nums[(endIndex-startIndex)/2 + startIndex])) {
                startIndex = (endIndex-startIndex)/2+startIndex+1; // we add +1 so we can move them closer
            } else if (target == nums[(endIndex-startIndex)/2 + startIndex]) { 
                return (endIndex-startIndex)/2+ startIndex; // found a match stop looking
            } else {
                endIndex = (endIndex-startIndex)/2+startIndex;
            }
        }
        if (nums[endIndex] < target && endIndex == nums.length-1) { // end case where it needs to be added to list
            return endIndex+1;
        }
        return endIndex;
    }
}