package com.wormchaos.lc.sliding_window.mensetsu;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Solution16_01 {

    /**
     * 不使用缓存temp交换0-1位置
     * @param numbers
     * @return
     */
    public int[] swapNumbers(int[] numbers) {
        numbers[0] ^= numbers[1];
        numbers[1] ^= numbers[0];
        numbers[0] ^= numbers[1];
        return numbers;
    }
}
