import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> resultSet = new HashMap<>();
        Character placeHolder;
        Integer minNumberPlaceHolder;
        int minNumber = text.length();
        String singleDigit = "ban";
        String doubleDigit = "lo";
        for (int i = 0; i < text.length(); i++) { // hash map each one
            placeHolder = text.charAt(i);
            if (resultSet.get(placeHolder) == null) {
                resultSet.put(placeHolder,1);
            } else {
                resultSet.put(placeHolder,resultSet.get(placeHolder)+1);
            }
        }
        for (int i=0; i < singleDigit.length();i++) { // check for single digits
            minNumberPlaceHolder = resultSet.get(singleDigit.charAt(i));
            //System.out.print(minNumberPlaceHolder);System.out.print(singleDigit.charAt(i));
            if (minNumberPlaceHolder == null) {
                return 0;
            } else if (minNumberPlaceHolder < minNumber) {
                minNumber = minNumberPlaceHolder;
            }
        }

        for (int i=0; i < doubleDigit.length();i++) { // check for single digits
            minNumberPlaceHolder = resultSet.get(doubleDigit.charAt(i)) / 2;
            //System.out.print(minNumberPlaceHolder);System.out.print(doubleDigit.charAt(i));
            if (minNumberPlaceHolder == null) {
                return 0;
            } else if (minNumberPlaceHolder < minNumber) {
                minNumber = minNumberPlaceHolder;
            }
        }


        return minNumber;
    }
}