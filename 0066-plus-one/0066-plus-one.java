class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = digits;
        for (int i = digits.length-1;i>=0;i--) {
            if (i == 0 && digits[i] == 9) {
                digits[i] = 0;
                result = new int[digits.length+1];
                result[0]=1;
                for (int ii = 1; ii<digits.length+1; ii++) {
                    result[ii] = digits[ii-1];
                }
                return result;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return result;
            }
        }
        return result;
    }
}