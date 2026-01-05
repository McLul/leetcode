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
        
        for (int i = 0; i<stringLength;i++) {
            charTested = s.charAt(i);
            integerVal = i;
            if (wordMap.get(charTested) == null) {
                wordMap.put(charTested, integerVal);
                wordLength += 1;

            } else {
                i = wordMap.get(charTested);
                wordLength = 0;
                wordMap = new HashMap<>();
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