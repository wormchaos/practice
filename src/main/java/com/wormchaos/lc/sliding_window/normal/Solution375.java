package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-7.
 */
public class Solution375 {
    /**
     * @param n
     * @return
     */
    public int getMoneyAmount(int n) {
        // 一个数的场景 min = 0
        // 两个数的场景 n1,n2，min = n1
        // 三个数的场景 n1,n2,n3 min = n2
        // 四个数的场景 1 1 2 || 1 3
        // 则为 s(n2-n3) + n1 = n1 + n3
        // 五个数的场景 则为
//        getMoney(1, n, 0);
        //f[1,n] = f[1,k] + k + f[k+1, n]
        return getMoney(1, n);
    }

    private int getMoney(int l, int r) {
        if (r == l) {
            return 0;
        }
        if (r - l == 1) {
            return l;
        }
        if (r - l == 2) {
            return l + 1;
        }
        if (r - l == 3) {
            return l + l +2;
        }
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i < r - 1; i++) {
            int result = Math.max(getMoney(l, i - 1), getMoney(i + 1, r)) + i;
            if (result < min) {
                min = result;
            }
        }
        return min;
    }
}
