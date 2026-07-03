class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int ii = 1; ii <strs.length; ii++) {
                if (strs[ii].length() <= i || strs[ii].charAt(i) != strs[0].charAt(i) ) {
                    return sbResult.toString();
                }
            }
            sbResult.append(strs[0].charAt(i));
        }
        return sbResult.toString();
    }
}