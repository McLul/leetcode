import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        Character[] resultString = {'b','a','n','l','o'};
        int[] resultStringCount = new int[5];
        Character placeHolderChar;
        int minNumber = 0;
    
        for (int i = 0; i <text.length();i++) {
            placeHolderChar = text.charAt(i);
            for (int ii = 0; ii < resultString.length;ii++) {
                if (placeHolderChar == resultString[ii]) {
                    resultStringCount[ii] += 1;
                } 
            }
        }

        minNumber = resultStringCount[0];
        for (int i=1;i<3;i++){
            if (resultStringCount[i] < minNumber) {
                minNumber = resultStringCount[i];
            }
        }

        for (int i=3;i<resultString.length;i++){
            //System.out.print(resultStringCount[i] /2);System.out.print(resultString[i]);
            if (resultStringCount[i] /2 < minNumber) {
                minNumber = resultStringCount[i] /2;
            }
        }

        return minNumber;

    }
}