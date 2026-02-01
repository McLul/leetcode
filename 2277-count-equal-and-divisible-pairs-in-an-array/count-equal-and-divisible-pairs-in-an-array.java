import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    HashMap<Integer, ArrayList<Integer>> integerMap;
    public int countPairs(int[] nums, int k) {
        int result = 0;
        this.integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.get(nums[i]) == null) {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(i);
                this.integerMap.put(nums[i], newList);
            } else {
                this.integerMap.get(nums[i]).add(i);
            }
        }
        for (Integer i : integerMap.keySet()) {
            ArrayList<Integer> tempList = integerMap.get(i);
            if (tempList.size() > 1) {
                for (int ii = 0;ii < tempList.size(); ii++) {
                    for (int iii = ii+1; iii<tempList.size(); iii++) {
                        if (tempList.get(ii) * tempList.get(iii) % k == 0) {
                            result += 1;
                        }
                    }
                }
            }
        }
        return result;
    }
}