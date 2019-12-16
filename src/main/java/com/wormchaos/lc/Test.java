package com.wormchaos.lc;

import com.wormchaos.lc.sliding_window.Solution76;

/**
 * Created by wormchaos on 2019-12-16.
 */
public class Test {

    public static void main(String... args) {
        Object result = new Solution76().minWindow("a", "aa");
//        Object result = new Solution76().minWindow("ADOBECODEBANC", "ABC");
        System.out.print(result);
    }
}
