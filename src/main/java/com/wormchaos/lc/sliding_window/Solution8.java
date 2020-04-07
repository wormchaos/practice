package com.wormchaos.lc.sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Created by wormchaos on 2019-12-18.
 * atoi函数
 */
public class Solution8 {
    private Set<Character> sign = new HashSet() {{
        add('+');
        add('-');
    }};


    private enum Status {
        START,
        SIGNED,
        IN_NUMBER,
        END;
    }

    /**
     * 有限状态机DFA
     *
     * @param str
     * @return
     */
    public int myAtoi(String str) {

        Status[] start = new Status[128];
        Status[] signed = new Status[128];
        Status[] inNumber = new Status[128];
        Status[] end = new Status[128];
        start['+'] = Status.SIGNED;
        start['-'] = Status.SIGNED;
        start[' '] = Status.START;
        for (int i = '0'; i <= '9'; i++) {
            start[i] = Status.IN_NUMBER;
            signed[i] = Status.IN_NUMBER;
            inNumber[i] = Status.IN_NUMBER;
        }
        Status status = Status.START;
        long result = 0;
        int sign = 1;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++){
            if (status == Status.END) {
                status = end[c[i]];
            } else if (status == Status.START) {
                status = start[c[i]];
            } else if (status == Status.SIGNED) {
                status = signed[c[i]];
            } else if (status == Status.IN_NUMBER) {
                status = inNumber[c[i]];
            }
            if (status == Status.END) {
                break;
            } else if (status == Status.SIGNED) {
                if ('-' == c[i]) {
                    sign = -1;
                }
            } else if (status == Status.IN_NUMBER) {
                result = result * 10 + (c[i] - '0');
                if (sign == 1 && result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int) (sign * result);
    }

    public int myAtoi_V1(String str) {
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

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num > 7)) {
                return Integer.MAX_VALUE;
            }

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && num > 8)) {
                return Integer.MIN_VALUE;
            }
            result = result * 10 + num * sig;
        }

        return result;
    }
}
