import java.util.ArrayList;
class Solution {
    List<Integer> result;
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> keyPositions = new ArrayList<>();
        this.result = new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == key) { // add all key positions
                keyPositions.add(i);
            }
        }
        //check each number against distance of all values of key
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < keyPositions.size(); j++) {
                if (Math.abs(i-keyPositions.get(j)) <= k)  {
                    this.result.add(i);
                    break;
                }
            }
        }
        return this.result;
    }
}