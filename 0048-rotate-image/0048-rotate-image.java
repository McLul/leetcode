class Solution {
    public void rotate(int[][] matrix) {
        
        
        //first flip their positions within the row ex. 1,2,3 becomes 3,2,1
        int placeHolder;
        int rowLength = matrix[0].length;
        for (int i = 0; i<matrix.length; i++) {
            for (int ii = 0; ii<rowLength/2;ii++) { // half because we will swap it back if we complete the loop
                placeHolder = matrix[i][ii];
                matrix[i][ii] = matrix[i][rowLength-1-ii];
                matrix[i][rowLength-1-ii] = placeHolder;
            }
        }
        // then swap out each position with the appropriate position 
        for (int i = 0; i<matrix.length; i++) {
            for (int ii = 0; ii<rowLength-i;ii++) { // make rows unavailable to change when theyve been fixed by -i
                placeHolder = matrix[i][ii];
                matrix[i][ii]=matrix[matrix.length-1-ii][rowLength-1-i];
                matrix[matrix.length-1-ii][rowLength-1-i] = placeHolder;
            }
        }
        
    }
}