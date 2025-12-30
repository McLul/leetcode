import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        int length = nums.length;
        Integer valueMapResult;
        for (int i=0;i<length;i++) {
            valueMap.put(nums[i],i);
        }
        for (int i=length-1;i>=0;i--){
            valueMapResult = valueMap.get(target - nums[i]);
            if (valueMapResult != null && !valueMapResult.equals(i)) {
                    return new int[]{i,valueMapResult};
            }
        }
        return new int[]{0,0};
    }
}