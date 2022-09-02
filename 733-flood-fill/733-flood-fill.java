class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        image[sr][sc] = color;
        if(sr > 0 && image[sr-1][sc] == initialColor && image[sr-1][sc] != color ) // go up
        {
            floodFill(image,sr-1, sc, color);
        }
        if(sc < image[sr].length-1 && image[sr][sc+1] == initialColor && image[sr][sc+1] != color) // go right
        {
            floodFill(image,sr, sc+1, color);
        }
        if(sc > 0 && image[sr][sc-1] == initialColor && image[sr][sc-1] != color) // go left
        {
            floodFill(image,sr, sc-1, color);
        }
        if(sr < image.length-1 && image[sr+1][sc] == initialColor && image[sr+1][sc] != color) // go down
        {
            floodFill(image,sr+1, sc, color);
        }
        return image;
    }
}