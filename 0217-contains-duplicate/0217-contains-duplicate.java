import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length;i++) {
            intSet.add(nums[i]);
        }
        return intSet.size() != nums.length;
    }
}