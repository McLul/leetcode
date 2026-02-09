class Solution {
    public String removeStars(String s) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0 ; i < s.length(); i++) {
            if (resultString.length() > 0 && s.charAt(i) == '*') {
                // remove added character
                resultString.deleteCharAt(resultString.length()-1);
            } else if (s.charAt(i) == '*') {
                // do nothing
            } else {
                // add new char
                resultString.append(s.charAt(i));
            }
        }
        return resultString.toString();
    }
}