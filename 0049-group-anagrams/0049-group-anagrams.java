class Solution {
    
    List<List<String>> listOfWords = new ArrayList<List<String>>();
    List<HashMap<Character, Integer>> wordMaps = new ArrayList<HashMap<Character, Integer>>();
    
    public List<List<String>> groupAnagrams(String[] strs) {
        int checkListWordNumber = 0;
        for (int i = 0; i < strs.length; i++) {
            checkListWordNumber = checkListOfWords(strs[i]);
            if (checkListWordNumber == -1) {
                this.listOfWords.add(new ArrayList<>(List.of(strs[i])));
            } else {
                this.listOfWords.get(checkListWordNumber).add(strs[i]);
            }
        }
        
        return this.listOfWords;
    }
    private int checkListOfWords(String word) {
        HashMap<Character, Integer> newWord = new HashMap<Character, Integer>();
        int wordChecksPassed = 0;
        Set<Character> oldSet;
        Set<Character> newSet;
        for (int i = 0; i < word.length(); i++ ) {
            if (newWord.get(word.charAt(i)) == null) {
                newWord.put(word.charAt(i), 1);
            } else {
                newWord.put(word.charAt(i), newWord.get(word.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < this.wordMaps.size(); i++) {
            oldSet = this.wordMaps.get(i).keySet();
            newSet = newWord.keySet();
            if (oldSet.size() != newSet.size()) {
                //System.out.println(oldSet.size());
                continue;
            }
            for (Character key : oldSet) {
                
                if (this.wordMaps.get(i).get(key) != newWord.get(key)) {
                    //System.out.println(oldSet.size());
                    wordChecksPassed = 0;
                    break;
                } else {
                    wordChecksPassed += 1;
                }
            }
            if (wordChecksPassed == oldSet.size()) {
              return i;  
            } else {
                wordChecksPassed = 0;
            }
        }
        this.wordMaps.add(newWord);
        return -1;
    }
}