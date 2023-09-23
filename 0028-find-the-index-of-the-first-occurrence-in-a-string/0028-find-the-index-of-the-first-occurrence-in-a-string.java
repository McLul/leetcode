class Solution {
    public int strStr(String haystack, String needle) {
        int needleEndPtr = 0;
        int needleLength = needle.length();
        if (haystack.length() < needleLength) { // cant find what doesnt exist
            return -1;
        }
        for (int i = 0; i < haystack.length()+1 - needleLength; i++) { // + 1 because we need to check atleast one
            while (haystack.charAt(i+needleEndPtr) == needle.charAt(needleEndPtr)) {
                needleEndPtr += 1;
                if (needleEndPtr == needleLength) {
                    return i;
                }
            } 
            needleEndPtr = 0;    // we havent found the word so reset the counter
        }
        return -1;
    }
}