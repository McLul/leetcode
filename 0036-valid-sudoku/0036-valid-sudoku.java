class Solution {
    boolean validBoard = true;
    
    char[][] copyBoard;
    public boolean isValidSudoku(char[][] board) {
        this.copyBoard = board;
        for (int i = 0; i < 9; i++) { //9 is board length
            if (!checkRow(i) || !checkCol(i)) {
                this.validBoard=false;
                return this.validBoard;
            }
        }
        for (int i = 0; i < 3; i++) { // each box is 3 x
            for (int ii = 0; ii < 3; ii++) { // each box is 3 y
                
                if (!checkBox(i,ii)) {
                    this.validBoard=false;
                    return this.validBoard;
                }

            }
        }
        return this.validBoard;
    }
    public boolean checkBox(int xSegment, int ySegment) {
        int[] boxValues = new int[10];
        int checkedValue;
        for (int i = xSegment*3; i< xSegment*3+3; i++){
           for (int ii = ySegment*3; ii< ySegment*3+3; ii++){
               //System.out.println(this.copyBoard[ii][i]);
               checkedValue = Character.getNumericValue(this.copyBoard[ii][i]);
               if (this.copyBoard[ii][i] != '.') {
                    if( boxValues[checkedValue] == 0 ) {
                        boxValues[checkedValue]=1;
                    } else if ( boxValues[checkedValue] == 1) {
                        return false;
                    }  
               }
                
            } 
        }
        return true;
    }
    public boolean checkRow(int row) {
        int[] rowValues = new int[10];
        int checkedValue;
        for (int i = 0; i < 9; i++){
                checkedValue = Character.getNumericValue(this.copyBoard[row][i]);
                if (this.copyBoard[row][i] != '.') {
                    if( rowValues[checkedValue] == 0  ) {
                        rowValues[checkedValue] =1;
                    } else if ( rowValues[checkedValue] == 1) {
                       return false;
                    } 
                }
                
        }
        return true; 
    }
    public boolean checkCol(int col) {
        int[] colValues = new int[10];
        int checkedValue;
        for (int i = 0; i < 9; i++){
                checkedValue = Character.getNumericValue(this.copyBoard[i][col]);
                if (this.copyBoard[i][col] != '.') {
                    if(  colValues[checkedValue] == 0 ) {
                        colValues[checkedValue]= 1;
                    } else if (  colValues[checkedValue] == 1) {
                        return false;
                    }   
                }
                
        } 
        return true;
    }
}