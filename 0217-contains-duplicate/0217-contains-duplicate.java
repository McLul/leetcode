class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> results = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (results.get(nums[i]) == null) {
                results.put(nums[i],1);
            }
            else {
                return true;
            }
        }
        return false;
    }
}