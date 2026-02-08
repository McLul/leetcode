class Solution {
    int result;
    public int minimumOperations(int[] nums) {
        this.result = 0;
        Integer minNumber = null;
        Integer maxNumber = 0;
        int checkedNumber = 0;
        // find smallest number
        while (!maxNumber.equals(minNumber)){
            minNumber = null;
            maxNumber = null;
            for (int i = 0; i < nums.length; i++) {
                checkedNumber = nums[i];
                if ((minNumber == null || minNumber > checkedNumber) && checkedNumber > 0) {
                    minNumber = checkedNumber;
                }
                if (maxNumber == null || maxNumber < checkedNumber) {
                    maxNumber = checkedNumber;
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