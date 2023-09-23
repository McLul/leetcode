class Solution {
    public int strStr(String haystack, String needle) {
        int needleEndPtr = 0;
        int needleLength = needle.length();
        for (int i = 0; i < haystack.length()+1 - needleLength; i++) {
            while (haystack.charAt(i+needleEndPtr) == needle.charAt(needleEndPtr)) {
                needleEndPtr += 1;
                if (needleEndPtr == needleLength) {
                    return i;
                }
            } 
            needleEndPtr = 0;    
        }
        return -1;
    }
}