package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-18.
 * atoi函数
 */
public class Solution8 {
    public int myAtoi(String str) {
        char[] sc = str.toCharArray();
        // 寻找头字符 - 或者数字 48 - 57
        int start;
        int sig = 1;
        for (start = 0; start < sc.length; start++) {
            char c = sc[start];
            if (c == 32) {
                continue;
            }
            if (c == 45) {
                sig = -1;
                start++;
                break;
            }
            if (c == 43) {
                start++;
                break;
            }
            if (c < 48 || c > 57) {
                return 0;
            } else {
                break;
            }
        }

        int result = 0;
        for (int i = start; i < sc.length; i++) {
            char c = sc[i];
            if (c < 48 || c > 57) {
                break;
            }

            int num = c - 48;

            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && num > 7)) {
                return Integer.MAX_VALUE;
            }

            if (result < Integer.MIN_VALUE /10 || (result == Integer.MIN_VALUE /10 && num > 8)) {
                return Integer.MIN_VALUE;
            }
            result = result * 10 + num * sig;
        }

        return result;
    }
}
