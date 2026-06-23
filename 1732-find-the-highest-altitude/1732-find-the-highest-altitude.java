class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int currentPeak = 0;
        for(int i = 0; i<gain.length;i++) {
            currentPeak += gain[i];
            result = result > currentPeak ? result : currentPeak;
        }
        return result;
    }
}