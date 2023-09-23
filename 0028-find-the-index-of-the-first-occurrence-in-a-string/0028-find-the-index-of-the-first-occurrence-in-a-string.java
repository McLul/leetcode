class Solution {
    public int strStr(String haystack, String needle) {
        int needleEndPtr = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleEndPtr)) {
                needleEndPtr += 1;
            }  else if (needleEndPtr >= 1){
                i -= needleEndPtr;
                needleEndPtr = 0;  
            } if (needleEndPtr == needle.length()) {
                return i - needle.length()+1;
            }
            System.out.println(Integer.toString(needleEndPtr) + " " + Integer.toString(i));
        }
        return -1;
    }
}