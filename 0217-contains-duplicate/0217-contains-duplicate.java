import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length;i++) {
            if (intSet.contains(nums[i])) {
                return true;
            } else {
                intSet.add(nums[i]);
            }
        }
        return false;
    }
}