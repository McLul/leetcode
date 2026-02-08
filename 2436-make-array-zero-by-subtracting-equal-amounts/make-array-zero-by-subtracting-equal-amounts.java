class Solution {
    int result;
    public int minimumOperations(int[] nums) {
        this.result = 0;
        int minNumber = 0;
        int maxNumber = 1;
        int checkedNumber = 0;
        // find smallest number
        while (maxNumber != minNumber){
            minNumber = 0;
            maxNumber = 0;
            for (int i = 0; i < nums.length; i++) {
                checkedNumber = nums[i];
                if ( minNumber == 0 || (minNumber > checkedNumber && checkedNumber > 0)) {
                    minNumber = checkedNumber;
                }
                if ( maxNumber < checkedNumber) {
                    maxNumber = checkedNumber;
                }
                
            }
            
            if (maxNumber <= 0) {
                return this.result;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] > 0) {
                        nums[i] -= minNumber; 
                    }
                }
            }
            this.result += 1;
            //if (largestNumber == 0) {return this.result;}
            // find minimum number of factors per.
        }
        return this.result;
    }
    
}