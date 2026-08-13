class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            for (int ii = 0; ii < mat[i].length; ii++) { // no need to check for even or odd because we are only checking if they are identical so + or - wont matter it will only flip starting and ending position [eg leftshift pos(3-2) = pos(1) is the same as rightshift pos(1+2) = pos(3)]
                if (mat[i][ii] != mat[i][(ii + k) % mat[i].length]) { // we use modulus to reloop the the row and check all places vs their final positions
                    return false;
                }
            }
        }
        return true;
    }
}