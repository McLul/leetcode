class Solution {
    public String removeDuplicates(String s) {
        // double pointer 
        if (s.length() < 1) {
            return s;
        }
        for (int i = 0 ; i < s.length()-1; i++) {
            // edge case duplicate is on first
            if (i == 0 && s.charAt(i) == s.charAt(i+1)){
                s = s.substring(i+2);
                i -= 1;
            } else if (s.charAt(i) == s.charAt(i+1)) {
                s = s.substring(0,i)+s.substring(i+2);
                i -= 2;
            }
        }
        return s;
    }
}