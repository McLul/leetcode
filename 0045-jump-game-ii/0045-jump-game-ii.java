class Solution {
    public int jump(int[] nums) {
        
        if (nums.length == 1) {
            return 0;
        } else if (nums.length == 2 || nums[0] >= nums.length-1) {
            return 1;
        }
        int jumps = 1;
        int currentPosition = 0;
        int[] largestNum = new int[2];
        largestNum[0] = 0;
        largestNum[1] = nums[0];
        while (currentPosition<nums.length) {
            jumps++; 
            //System.out.println(largestNum[0]);
            //System.out.println(largestNum[1]);
            //System.out.println(currentPosition);
            largestNum = findLargestNumber(currentPosition+1,largestNum[1], nums); // check numbers after current position + after range
            currentPosition = largestNum[0]; // position is the largest num
            if (largestNum[1] == 0 || currentPosition + largestNum[1] >= nums.length-1 ) { // end conditions
                return jumps;
            }
           
             
        }
        return jumps;
    }
    private int[] findLargestNumber(int start, int range, int[] nums) {
        int[] result = new int[2];
        int largestNumber = 0;
        for (int i = start; i < start + range && i < nums.length; i++) {
            if (nums[i]+i >= largestNumber) {
                largestNumber = nums[i]+i; // +i to offset distance from original number
                result[1] = nums[i];
                result[0] = i;
            }
        }
        //System.out.println(result[0]);
        //System.out.println(result[1]);
        return result;
    }
}