class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 1;
        for (int i = 0; i<nums.length-1;i++) {
            int lastPosition = i+1;
            boolean uniqueNumber = false;
            //while loop that goes to next unique number then 
            while (nums[lastPosition]==nums[i] && lastPosition < nums.length-1) {
                lastPosition++;
            }
            if (lastPosition == nums.length-1 && nums[lastPosition] == nums[i]) {
                break;
            } else if (lastPosition > i+1) {
                for(int ii = i+1; ii < lastPosition; ii++) {
                    nums[ii]=nums[lastPosition];
                }  
            }
            result+=1;
        }
        for(int x = 0; x < nums.length;x ++) {
            System.out.println(nums[x]);
        }
        return result;
    }
}