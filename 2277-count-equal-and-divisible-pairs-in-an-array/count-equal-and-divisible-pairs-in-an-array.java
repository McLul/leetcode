import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    HashMap<Integer, ArrayList<Integer>> integerMap;
    public int countPairs(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i< nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }
}