class Solution {
    public String removeStars(String s) {
        StringBuilder resultString = new StringBuilder();
        int resultLength = 0;
        char charChecked = '.';
        for (int i = 0 ; i < s.length(); i++) {
            resultLength = resultString.length();
            charChecked = s.charAt(i);
            if (resultLength > 0 && charChecked == '*') {
                // remove added character
                resultString.deleteCharAt(resultLength-1);
            } else if (charChecked == '*') {
                // do nothing
            } else {
                // add new char
                resultString.append(charChecked);
            }
        }
        return resultString.toString();
    }
}