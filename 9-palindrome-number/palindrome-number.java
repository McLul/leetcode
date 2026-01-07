class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String stringNumber = String.valueOf(x);
        int stringLength = stringNumber.length();
        for (int i = 0; i< stringLength /2; i++){
            if (stringNumber.charAt(i) != stringNumber.charAt(stringLength -1 - i)) {
                return false;
            }
        }
        return true;
    }
}