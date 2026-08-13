class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int temp = 0;
        for (int i = y; i < y+k; i++) {
            for(int ii = x; ii < x+k/2; ii++) {
                temp = grid[ii][i];
                grid[ii][i] = grid[k-1+2*x-ii][i];
                grid[k-1+2*x-ii][i] = temp;
            }
        }
        return grid;
    }
}