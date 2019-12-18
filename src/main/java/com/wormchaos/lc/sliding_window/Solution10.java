package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-18.
 */
public class Solution10 {
    /**
     * 双指针
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while(l != r) {
            int t = (r - l) * Math.min(height[l], height[r]);
            if(t > max) {
                max = t;
            }
            if(height[l]< height[r]) {
                l++;
            } else{
                r--;
            }
        }
        return max;
    }
    /**
     * 穷举
     * @param height
     * @return
     */
    public int maxAreaV1(int[] height) {
        int max = 0;
        for (int i=0; i < height.length - 1; i++) {
            for (int j=i + 1; j < height.length; j++) {
                int r = (j - i) * Math.min(height[i], height[j]);
                if(r > max) {
                    max = r;
                }
            }
        }
        return max;
    }
}
