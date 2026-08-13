class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            for (int ii = 0; ii < mat[i].length; ii++) {
                if (mat[i][ii] != mat[i][(ii + k) % mat[i].length]) {
                    return false;
                }
            }
        }
        return true;
    }
}