class Solution {
    
    class Letter{
        int size = 1;
        char letter;
        public Letter(char letter) {
            this.letter = letter;  
        }
    }
    
    public boolean equalFrequency(String word) {
        ArrayList<Letter> charList = new ArrayList<Letter>();
        boolean charAdded = false;
        for (int i = 0; i < word.length(); i++) {
            for (Letter l : charList) {
                if (l.letter == word.charAt(i)) {
                    l.size += 1;
                    charAdded = true;
                }
            }
            if (charAdded == false) {
                Letter newChar = new Letter(word.charAt(i));
                charList.add(newChar);
            }
            charAdded = false; // reset  
        }
        // done adding letters now find highest freq
        int charListSize = charList.size();
        if(charListSize == 1) { // 1 letter
            return true;
        } 
        Letter highestFreq = null;
        Letter secondHighestFreq = null;
        Letter lowestFreq = null;
        int lowestFreqCount = 1;
        int highestFreqCount = 1;
        for (Letter l : charList) {
            //System.out.println(l.letter + Integer.toString(l.size));
            if (highestFreq == null || l.size > highestFreq.size) {
                highestFreq = l;
                highestFreqCount = 1;
            } else if (highestFreq.size == l.size){
                highestFreqCount +=1;
            } if ((secondHighestFreq == null || l.size > secondHighestFreq.size) && l != highestFreq ){
                secondHighestFreq = l;
            } if (lowestFreq == null || l.size < lowestFreq.size) {
                lowestFreq = l;
                lowestFreqCount = 1;
            } else if (lowestFreq.size == l.size) {
                lowestFreqCount +=1;
            }
        }
        
        if (charListSize == 2) { // 2 letter try
            if (highestFreq.size == 1 || lowestFreq.size == 1) {
                return true;
            } else if (charList.get(0).size - 1 == charList.get(1).size || charList.get(1).size - 1 == charList.get(0).size) {
                return true;
            }
            return false;
        }
        
        // now check highestFreq  against all other letters and make sure it only exceeds all of their values by one
        if (highestFreqCount == charListSize-1 && lowestFreq.size == 1 && lowestFreqCount == 1) {
            return true;
        }
        else if (highestFreq.size == 1  || (highestFreq.size - 1 == secondHighestFreq.size && secondHighestFreq.size == lowestFreq.size)) {
            return true;
        } else if (highestFreqCount == 1 && lowestFreq.size  == secondHighestFreq.size && highestFreq.size-1 == lowestFreq.size) {
            return true;
        }
        
        return false;
    }
}