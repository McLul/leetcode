class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sKeys = new <Character,Integer>HashMap();
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (sKeys.get(item) == null) {
                sKeys.put(item,1);
            } else {
                sKeys.put(item,sKeys.get(item)+1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char item = t.charAt(i);
            if (sKeys.get(item) == null) {
                return false;
            } else if (sKeys.get(item) == 1) {
                sKeys.remove(item);
            } else {
                sKeys.put(item,sKeys.get(item)-1) ;
            }
        }
        if (sKeys.size() > 0) {
            return false;
        }
        return true;
    }
}