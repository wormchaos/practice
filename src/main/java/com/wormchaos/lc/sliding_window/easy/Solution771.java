package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2019-12-26.
 */
public class Solution733 {
    /**
     * 深度优先
     *
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if(oldColor != newColor) {
            subFloodFill(image, sr, sc, oldColor, newColor);
        }
        return image;
    }

    private void subFloodFill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            if (sr > 0) {
                subFloodFill(image, sr - 1, sc, oldColor, newColor);
            }
            if (sc > 0) {
                subFloodFill(image, sr, sc - 1, oldColor, newColor);
            }
            if (sr < image.length - 1) {
                subFloodFill(image, sr + 1, sc, oldColor, newColor);
            }
            if (sc < image[0].length - 1) {
                subFloodFill(image, sr, sc + 1, oldColor, newColor);
            }
        }
    }
}
