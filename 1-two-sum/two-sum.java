import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        int length = nums.length;
        int newTarget;
        Integer valueMapResult;
        for (int i=0;i<length;i++) {
            valueMap.put(nums[i],i);
        }
        for (int i=0;i<length;i++){
            newTarget = target - nums[i];
            valueMapResult = valueMap.get(newTarget);
            if (valueMapResult != null && !valueMapResult.equals(i)) {
                    return new int[]{i,valueMapResult};
            }
        }
        return new int[]{0,0};
    }
}