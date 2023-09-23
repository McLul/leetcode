class Solution {
    public int strStr(String haystack, String needle) {
        int needleEndPtr = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleEndPtr)) {
                needleEndPtr += 1;
            }  else {
                i -= needleEndPtr;
                needleEndPtr = 0;  
            } if (needleEndPtr == needle.length()) {
                return i - needle.length()+1;
            }
        }
        return -1;
    }
}