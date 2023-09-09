class Solution {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
        boolean nextWord = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== ' ') { // case : spaces
                nextWord = true;
            } 
            
            
            if (s.charAt(i) != ' '){ // case : letters
                if (nextWord == true) {
                    wordLength = 0;
                }
                wordLength+=1;
                nextWord = false;
            }
            
            
            
        }
        return wordLength;
    }
}