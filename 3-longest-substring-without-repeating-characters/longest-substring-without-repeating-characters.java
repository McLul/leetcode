import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // create map of word, check it everytime end point moves, keep track of length
        int wordLength = 0;
        int stringLength = s.length();
        
        HashMap<Character, Integer> wordMap = new HashMap<>();
        int resultLength = stringLength == 1 ? 1 : 0;
        Character charTested = null;
        Integer integerVal = null;
        Integer charPos = null;
        
        for (int i = 0; i<stringLength;i++) {
            charTested = s.charAt(i);
            integerVal = i;
            charPos = wordMap.get(charTested);
            if (charPos == null) {
                wordMap.put(charTested, integerVal);
                wordLength += 1;

            } else {
                i = charPos;
                wordLength = 0;
                wordMap.clear();
                if (stringLength - i - resultLength < 1 ) {
                    return resultLength;
                }
            }
            if (wordLength > resultLength){
                    resultLength = wordLength;
            }
        }


        return resultLength;

    }
}