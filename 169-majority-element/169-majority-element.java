class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mappedNums = new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length; i++) {
            int num = nums[i];
            if (mappedNums.get(num) == null) {
                mappedNums.put(num, 1);
            } else {
                mappedNums.put(num,mappedNums.get(num)+1);
            }
        }
        for (Integer i : mappedNums.keySet()) {
            if (mappedNums.get(i) > nums.length/2) {
                return i;
            }
        }
        return -1;
    }
}