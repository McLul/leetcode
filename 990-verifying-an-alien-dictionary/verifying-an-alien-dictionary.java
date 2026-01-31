import java.util.HashMap;

class Solution {
    HashMap<Character,Integer> dictionaryPosition;

    public boolean isAlienSorted(String[] words, String order) {
        this.dictionaryPosition = new HashMap<>();
        for (int i = 0; i< order.length(); i++) {
            this.dictionaryPosition.put(order.charAt(i), i);
        }
        for(int i = 0; i< words.length-1; i++){
            for(int iChar = 0; iChar<Math.min(words[i].length(), words[i+1].length()); iChar++) {
                if (dictionaryPosition.get(words[i].charAt(iChar)) < dictionaryPosition.get(words[i+1].charAt(iChar))) {
                    break;
                } else if (dictionaryPosition.get(words[i].charAt(iChar)) > dictionaryPosition.get(words[i+1].charAt(iChar))) {
                    return false;
                }
            }
            if (words[i].length() > words[i+1].length()) {System.out.println(words[i].substring(0,words[i+1].length()));}
            if (words[i].length() > words[i+1].length() && words[i].substring(0,words[i+1].length()).equals(words[i+1])) {
                return false;
            }
        }
        return true;
    }
}