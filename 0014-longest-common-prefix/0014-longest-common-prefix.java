class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sbResult = new StringBuilder();
        int maxLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < maxLength) {
                maxLength = strs[i].length();
            }
        }
        for (int i = 0; i < maxLength; i++) {
            for (int ii = 1; ii <strs.length; ii++) {
                if ( strs[ii].charAt(i) != strs[0].charAt(i) ) {
                    return sbResult.toString();
                }
            }
            sbResult.append(strs[0].charAt(i));
        }
        return sbResult.toString();
    }
}