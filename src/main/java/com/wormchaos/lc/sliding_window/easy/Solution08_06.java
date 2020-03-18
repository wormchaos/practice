package com.wormchaos.lc.sliding_window.easy;

import java.util.List;

/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution08_06 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A, C, B, A.size());
    }

    private void move(List<Integer> from, List<Integer> to, List<Integer> temp, int count) {
        if (count == 1) {
            to.add(from.remove(from.size() - 1));
        } else {
            // A to B
            move(from, temp, to, count - 1);
            to.add(from.remove(from.size() - 1));
            move(temp, to, from, count - 1);
        }

    }

}
