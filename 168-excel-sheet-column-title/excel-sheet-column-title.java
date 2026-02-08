class Solution {
    public String convertToTitle(int columnNumber) {
        // offset by 64 per character for output 
        StringBuilder resultString = new StringBuilder();
        int colChecked = 0;
        while (columnNumber > 26) {
            colChecked = columnNumber%26;
            if (colChecked == 0) {
                colChecked = 26;
            }
            resultString.insert(0,(char)((colChecked) + 64));
            columnNumber -= colChecked;
            columnNumber /= 26;

        }
        resultString.insert(0,(char)((columnNumber) + 64));
        return resultString.toString();
    }
}