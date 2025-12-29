class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        int newTarget;
        for (int i=0;i<length;i++){
            newTarget = target - nums[i];
            result[0] = i;
            for (int ii=i+1;ii<length;ii++){
                if (newTarget - nums[ii] == 0) {
                    result[1] = ii;
                    return result;
                }
            }
        }
        return result;
    }
}