class Solution {
    public int longestPalindrome(String s) {
        int results = 0;
        HashMap<Character, Integer> mappedString = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char myChar = s.charAt(i);
            if (mappedString.get(myChar) == null) {
                mappedString.put(myChar, 1);
            } else {
                mappedString.put(myChar, mappedString.get(myChar)+1);
            }
        }
        for (char i : mappedString.keySet()) {
            results += Math.floor(mappedString.get(i)/2)*2;
        }
        if (s.length()-results > 0) {
            return results + 1;
        } else {
            return results;
        }
    }
}