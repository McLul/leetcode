import java.util.HashMap;
class Solution {
    boolean result;
    public boolean canConstruct(String ransomNote, String magazine) {
        this.result = false;
        int letterCount = ransomNote.length();
        if (magazine.length() < ransomNote.length()) {
            return this.result;
        }
        Character charTested = null;
        Integer intTested = null;
        HashMap<Character, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            charTested = ransomNote.charAt(i);
            intTested = stringMap.get(charTested);
            if (intTested == null) {
                stringMap.put(charTested,1);
            } else {
                stringMap.put(charTested,intTested + 1);
            }
        }
        for (int i = 0 ; i < magazine.length(); i++) {
            charTested = magazine.charAt(i);
            intTested = stringMap.get(charTested);
            if (intTested == null) { // do nothing
            } else if (intTested.equals(1)) {
                stringMap.put(charTested,null);
                letterCount -= 1;
                if (letterCount == 0) {
                    this.result = true;
                    return this.result;
                }
            } else {
                stringMap.put(charTested,intTested - 1);
                letterCount -= 1;
                if (letterCount == 0) {
                    this.result = true;
                    return this.result;
                }
            }
        }
        return this.result;
        
    }
}