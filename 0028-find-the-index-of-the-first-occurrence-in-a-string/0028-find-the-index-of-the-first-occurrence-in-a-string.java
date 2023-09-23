class Solution {
    public int strStr(String haystack, String needle) {
        int needleEndPtr = 0;
        int needleLength = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleEndPtr)) {
                needleEndPtr += 1;
            }  else {
                i -= needleEndPtr;
                needleEndPtr = 0;  
            } if (needleEndPtr == needleLength) {
                return i - needleLength+1;
            }
        }
        return -1;
    }
}