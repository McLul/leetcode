class Solution {
    int result;
    public int minimumOperations(int[] nums) {
        this.result = 0;
        Integer minNumber = null;
        Integer largestNumber = 0;
        // find smallest number
        while (!largestNumber.equals(minNumber)){
            minNumber = null;
            largestNumber = null;
            for (int i = 0; i < nums.length; i++) {
                if ((minNumber == null || minNumber > nums[i]) && nums[i] > 0) {
                    minNumber = nums[i];
                }
                if (largestNumber == null || largestNumber < nums[i]) {
                    largestNumber = nums[i];
                }
                
            }
            if (minNumber == null) {
                return this.result;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] -= minNumber;
                }
            }
            this.result += 1;
            //if (largestNumber == 0) {return this.result;}
            // find minimum number of factors per.
        }
        return this.result;
    }
    
}