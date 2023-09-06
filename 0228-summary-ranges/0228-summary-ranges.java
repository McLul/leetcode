class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<String>();
        
        if (nums.length == 0 ) {
            return results;
        } 
        int firstNum = nums[0];
        int lastNum = nums[0];
        if ( nums.length == 1) {
            results.add(Integer.toString(nums[0]));
            return results;
        }
        for (int i = 1; i <nums.length;i++) { 
            if (nums[i]-1 != lastNum) { // we found a break so add a result
                results.add(createRange(firstNum, lastNum));
                lastNum = nums[i];
                firstNum = nums[i];
            } else {
                lastNum = nums[i]; // if no break move last ptr
            }
        }
        results.add(createRange(firstNum, lastNum)); // last add needs to be done manually
        return results;
    }
    private String createRange(int x, int y) { // clean up the output
        if (x == y) {
            return Integer.toString(x);
        } else {
            return Integer.toString(x)+"->"+Integer.toString(y);
        }
    }
}