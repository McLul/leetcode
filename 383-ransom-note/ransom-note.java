import java.util.HashMap;
class Solution {
    boolean result;
    public boolean canConstruct(String ransomNote, String magazine) {
        this.result = false;
        if (magazine.length() < ransomNote.length()) {
            return this.result;
        }
        Character charTested = null;
        HashMap<Character, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            charTested = magazine.charAt(i);
            if (stringMap.get(charTested) == null) {
                stringMap.put(charTested,1);
            } else {
                stringMap.put(charTested,stringMap.get(charTested) + 1);
            }
        }
        this.result = true;
        for (int i = 0 ; i < ransomNote.length(); i++) {
            charTested = ransomNote.charAt(i);
            if (stringMap.get(charTested) == null) {
                this.result = false;
                return this.result;
            } else if (stringMap.get(charTested).equals(1)) {
                stringMap.put(charTested,null);
            } else {
                stringMap.put(charTested,stringMap.get(charTested) - 1);
            }
        }
        return this.result;
        
    }
}