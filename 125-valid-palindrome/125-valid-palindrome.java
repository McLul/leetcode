class Solution {
    public boolean isPalindrome(String s) {
        String parsedString = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int asciiVal = (int)s.charAt(i);
            if ((asciiVal >= 97 && asciiVal <= 122) || (asciiVal >= 48 && asciiVal <= 57) ) {
                parsedString += s.charAt(i);
            }
        }
        for (int i = 0; i < Math.floor(parsedString.length()/2); i++) {
            if (parsedString.charAt(i) != parsedString.charAt(parsedString.length()-1-i) ) {
                return false;
            }
        }
        return true;
    }
}