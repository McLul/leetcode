import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // create map of word, check it everytime end point moves, keep track of length
        int wordLength = 0;
        int stringLength = s.length();
        int startingPos = 0;
        Character startingChar = null;
        
        HashMap<Character, Integer> wordMap = new HashMap<Character, Integer>();
        int resultLength = stringLength == 1 ? 1 : 0;
        Character charTested = null;
        Integer integerVal = null;
        Integer charPos = null;
        
        for (int i = 0; i<stringLength;i++) {
            charTested = s.charAt(i);
            charPos = wordMap.get(charTested);
            integerVal = i;
            if (charPos == null) {
                wordMap.put(charTested, integerVal);
                wordLength += 1;
                    if (wordLength > resultLength){
                        resultLength = wordLength;
                    }
            } else {
                startingPos = startingPos >= charPos? startingPos : charPos;
                startingChar = startingPos >= charPos ? startingChar : charTested;
                wordLength = startingChar == charTested ? i-1-startingPos : i-startingPos;
                wordMap.put(charTested, integerVal);
                if (wordLength > resultLength){
                        resultLength = wordLength;
                }
            }
        }


        return resultLength;

    }
}