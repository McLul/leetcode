

// simplest solution
class Solution {
    public boolean judgeCircle(String moves) {
        
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    posX--;
                    break;
                case 'R':
                    posX++;
                    break;
                case 'U':
                    posY++;
                    break;
                case 'D':
                    posY--;
                    break; 
            }
        }
        return (posX == 0 && posY == 0) ? true : false;
    }
}


