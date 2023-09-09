class Solution {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
        boolean word = false;
        for (int i = s.length()-1; i >= 0 ; i--) {
            
            if (s.charAt(i) != ' '){ // case : letters
                wordLength++;
                word = true;
            } else if (word == true){
                return wordLength;
            }
            
            
            
        }
        return wordLength;
    }
}



