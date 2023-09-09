class Solution {
    public int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex != endIndex) {
            if (target > (nums[(endIndex-startIndex)/2 + startIndex])) {
                startIndex = (endIndex-startIndex)/2+startIndex+1; // we add +1 so we can move them closer
            } else if (target == nums[(endIndex-startIndex)/2 + startIndex]) { 
                return (endIndex-startIndex)/2+ startIndex;
            } else {
                endIndex = (endIndex-startIndex)/2+startIndex;
            }
        }
        if (nums[endIndex] < target && endIndex == nums.length-1) {
            return endIndex+1;
        }
        return endIndex;
    }
}