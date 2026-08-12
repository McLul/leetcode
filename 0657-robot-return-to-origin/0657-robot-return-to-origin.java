import java.util.HashMap;

/* simplest solution
class Solution {
    public boolean judgeCircle(String moves) {
        
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    posY++;
                    break; 
                case 'D':
                    posY--;
                    break;
                case 'R':
                    posX++;
                    break;
                case 'L':
                    posX--;
                    break;
            }
        }
        return (posX == 0 && posY == 0) ? true : false;
    }
}
*/

class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> moveSet = new HashMap<Character, Integer>();
        Character testChar = 'S';
        moveSet.put('U',0);
        moveSet.put('D',0);
        moveSet.put('L',0);
        moveSet.put('R',0);
        for (int i = 0; i < moves.length(); i++) {
            testChar = moves.charAt(i);
            moveSet.put(testChar,moveSet.get(testChar)+1);
        }
    return (Integer.sum(moveSet.get('U'),-1*moveSet.get('D')) == 0 && Integer.sum(moveSet.get('L'),-1*moveSet.get('R')) == 0) ? true : false;
    }
}
