package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution836 {

    /**
     * 位置检查
     * @param rec1
     * @param rec2
     * @return
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // 判断是否在左/上/右/下
        if(rec1[2] <= rec2[0]
                || rec1[1] >= rec2[3]
                || rec1[0] >= rec2[2]
                || rec1[3] <= rec2[1]) {
            return false;
        }
        return true;

    }
}
