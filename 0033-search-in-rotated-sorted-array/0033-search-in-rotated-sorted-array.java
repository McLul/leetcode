class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        } 
        int startIndex = 0;
        int endIndex = nums.length-1;
        int middlePoint = (endIndex-startIndex)/2 + startIndex;
        while (startIndex != endIndex) { // we will first do a binary search to find the pivot position
            middlePoint = (endIndex-startIndex)/2 + startIndex;
            if (nums[middlePoint] > nums[endIndex]) {
                startIndex = middlePoint+1;
            }  else {
                endIndex = middlePoint;
            }
        }
        int pivotPosition = startIndex; // we now have 2 lists and need to discern which one to search
        if (pivotPosition == 0) { // case : no rotation search entire list
            startIndex = 0;
            endIndex = nums.length-1;
        } else if (target <= nums[nums.length-1]) { // case : it's somewhere in the unrotated part
            endIndex = nums.length-1;
        } else if (target <= nums[startIndex-1]  ) { // case : it's somewhere in the rotated part 
            startIndex = 0;
        } 
        // then we will do a binary search on whichever part of the array should contain the element solution complexity is 1.5*log(n) amortizied O(log n) 
        while (startIndex != endIndex) { // now we find the target
            middlePoint = (endIndex-startIndex)/2 + startIndex;
            if (nums[middlePoint] < target) {
                startIndex = middlePoint+1;
            } else if (nums[middlePoint] == target) { // this will save us time 
                return middlePoint;
            }  else {
                endIndex = middlePoint;
            }
        }
        if (nums[startIndex] == target) {
           return startIndex;
        } else {
           return -1; 
        }
        
    }
}