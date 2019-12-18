package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-18.
 * 回文
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        int result = 0;
        if(0 == x) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        while( x > result) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return x == result || x == result / 10;
    }
}
