class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer,Integer> mappedNums = new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length; i++) {
            int num = nums[i];
            if (mappedNums.get(num) == null) {
                mappedNums.put(num, 1);
            } else if (mappedNums.get(num) + 1 > nums.length/2) {
                return num;
            } else {
                mappedNums.put(num,mappedNums.get(num)+1);
            }
        }
        return -1;
    }
}