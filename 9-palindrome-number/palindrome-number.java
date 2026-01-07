class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String stringNumber = String.valueOf(x);
        int stringLength = stringNumber.length();
        int stringLastPosition = stringLength -1;
        for (int i = stringLength /2; i< stringLength; i++){
            if (stringNumber.charAt(i) != stringNumber.charAt(stringLastPosition - i)) {
                return false;
            }
        }
        return true;
    }
}