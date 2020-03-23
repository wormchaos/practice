package com.wormchaos.lc.mori;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Turnip {

    private enum TurnipType {
        STABLE("稳定型"),
        THREE("三期"),
        FOUR("四期"),
        DROP("递减");

        private String name;

        TurnipType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String... args) {
        int buyPrize = 98;
        int[] arr = new int[12];
        arr[0] = 93;
        arr[1] = 109;
//        arr[0] = 20;
        buy(arr, buyPrize);
    }


    /**
     * 从周一AM开始，依次数值
     *
     * @param a
     * @param buyPrize 周日购买价
     */
    private static void buy(int[] a, int buyPrize) {
        if (buyPrize < 90 && buyPrize > 110) {
            print("异常输入");
            return;
        }
        double c = (double) a[0] / buyPrize;
        Set<TurnipType> set = new HashSet<>();
        set.add(TurnipType.FOUR);
        if (c < 0.6) {
            // 跌幅高，说明是四期
            print(set);
            return;
        }
        set.add(TurnipType.DROP);
        set.add(TurnipType.STABLE);
        set.add(TurnipType.THREE);
        // 根据第二天价格判断
        boolean isDown = true;
        for (int i = 1; i < a.length && a[i] > 0; i++) {
            if (a[i] == a[i - 1]) {
                print(TurnipType.STABLE);
                return;
            } else if (a[i] > a[i - 1]) {
                if (isDown) {
                    isDown = !isDown;
                } else {
                    double rate = (double) a[i] / buyPrize;
                    if (rate > 1.4) {
                        print(TurnipType.THREE, i + 1);
                        return;
                    } else {
                        print(TurnipType.FOUR, i + 1);
                        return;
                    }
                }

            }
        }
        print(set);

    }

    private static void print(TurnipType s, int day) {
        StringBuffer sb = new StringBuffer("您的类型可能是:");
        sb.append(s.getName());
        String dayString = convert(day);
        sb.append(".最佳售出日是:").append(dayString);
        System.out.println(sb.toString());
    }

    private static void print(TurnipType s) {
        print(s, -1);
    }

    private static String convert(int day) {
        String s = "";
        switch (day / 2 % 7) {
            case -1:
                return s;
            case 0:
                s = "周一";
                break;
            case 1:
                s = "周二";
                break;
            case 2:
                s = "周三";
                break;
            case 3:
                s = "周四";
                break;
            case 4:
                s = "周五";
                break;
            case 5:
                s = "周六";
                break;
            case 6:
                s = "周日";
                break;
        }
        String m = day % 2 == 0 ? "上午" : "下午";
        return s + m;
    }

    private static void print(Set<TurnipType> s) {
        StringBuffer sb = new StringBuffer("您的类型可能是:");
        for (TurnipType t : s) {
            sb.append(t.getName()).append(",");
        }
        System.out.println(sb.substring(0, sb.length() - 1).toString());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
