class Solution {
    public boolean isPalindrome(String s) {
        String parsedString = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int asciiVal = (int)s.charAt(i);
            if ((asciiVal >= 48 && asciiVal <= 57) || (asciiVal >= 97 && asciiVal <= 122) ) {
                parsedString += s.charAt(i);
            }
        }
        int length = parsedString.length();
        int floor = (int)Math.floor(length/2);
        for (int i = 0; i < floor; i++) {
            if (parsedString.charAt(i) != parsedString.charAt(length-1-i) ) {
                return false;
            }
        }
        return true;
    }
}