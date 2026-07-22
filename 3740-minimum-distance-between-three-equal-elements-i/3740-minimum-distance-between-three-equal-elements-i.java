import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    Integer currentMin = null;
    HashMap<Integer, ArrayList<Integer>> distanceHashMap = new HashMap();
    public int minimumDistance(int[] nums) {
        Integer arrayPos = null;
        // find min tuple use hashset to save locations
        for (int i = 0; i<nums.length; i++) { // hashmap for all positions for all keys
            arrayPos = nums[i];
            if (distanceHashMap.get(arrayPos) == null) {
                distanceHashMap.put(arrayPos,new ArrayList<Integer>());
                distanceHashMap.get(arrayPos).add(i);
            } else {
                distanceHashMap.get(arrayPos).add(i);
            }
        } 
        // iterate over all keys
        for (ArrayList<Integer> i : distanceHashMap.values()){
            if (i.size() > 2) {
                int firstPos = 0;
                int secondPos = 1;
                int thirdPos = 2;
                Integer minValue = Math.abs(i.get(firstPos) - i.get(secondPos)) + Math.abs(i.get(secondPos) - i.get(thirdPos)) + Math.abs(i.get(thirdPos) - i.get(firstPos));
                currentMin = currentMin == null || currentMin > minValue ? minValue : currentMin ;
                for (int ii = 0; ii + 3 < i.size(); ii++) {
                    firstPos += 1;
                    secondPos += 1;
                    thirdPos += 1;
                    minValue = Math.abs(i.get(firstPos) - i.get(secondPos)) + Math.abs(i.get(secondPos) - i.get(thirdPos)) + Math.abs(i.get(thirdPos) - i.get(firstPos));
                    currentMin = currentMin == null || currentMin > minValue ? minValue : currentMin ;
                }
            } 
            
        }
        return currentMin == null ? -1 : currentMin;
    }
}