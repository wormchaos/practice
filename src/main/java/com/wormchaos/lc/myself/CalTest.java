package com.wormchaos.lc.myself;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2019-12-31.
 */
public class CalTest {

    /**
     * 给定一个数字M，设计出一条不超过N次的减法规则，使得每次减累加和和N的距离<=distance
     *
     * @param n
     * @param distance
     */
    public static int[] calcRule(int m, int n, int distance) {
//        int[] result = new int[m];
        int d = 3;
        int sum = m;
        List<Integer> dis = new ArrayList<>();
        while (d < m) {
            sum = m;
            if (sum % d == 1) {
                sum /= d;
                dis.add(d);
            } else if (sum % d == d - 1) {
                sum = sum / d + 1;
                dis.add(d);
            }
            d++;

        }

        for (Integer dd : dis) {
            sum = m;
            if (sum % dd == 1) {
                sum /= dd;
            } else if (sum % dd == dd - 1) {
                sum = sum / dd + 1;
            }
            int[] cmp = new int[]{1, 3, 7, 15, 31, 63, 127, 255, 511, 1021};
            for (int x = 2; x < 10; x++) {
                int i = 0;
                while (cmp[i] * x < sum) {
                    i++;
                }
                if(i == 0) {
                    continue;
                }
                // 得到结果cmp[i-1] 和 x+2;
//            System.out.println(cmp[i -1] + "_" + x );
                for (int j = 1; j < x; j++) {
                    if (Math.abs(m - (cmp[i - 1] * x + j) * dd) <= 1) {
                        // 计算
                        printt(j * dd, (x - j) * dd, m, i - 1);
                    }
                }
            }
        }
        return null;
    }

    private static void printt(int a, int b, int sum, int level) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(a);
        stack.push(a);
        stack.push(b);
        for (int i = level; i > 0; i--) {
            a = a + b;
            b = a;
            stack.push(a);
            stack.push(b);
        }
        a = a + b;
        stack.push(a);
        stack.push(sum - a);
//        System.out.println(a + " " + (sum-a));
        boolean f = false;
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
            if (f) {
                System.out.println();
                f = false;
            } else {
                f = true;
            }
        }
        System.out.println("===========");
    }
}
