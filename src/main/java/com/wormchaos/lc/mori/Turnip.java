package com.wormchaos.lc.mori;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Turnip {

    private enum TurnipType {
        STABLE("稳定型"),
        THREE("三期"),
        FOUR("四期"),
        DROP("递减")
        ;

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
//        arr[0] = 93;
        arr[0] = 20;
        buy(arr, buyPrize);
    }


    /**
     * 从周一AM开始，依次数值
     *
     * @param a
     * @param buyPrize 周日购买价
     *
     */
    private static void buy(int[] a, int buyPrize) {
        if (buyPrize < 90 && buyPrize > 110) {
            print("异常输入");
            return;
        }
        double c = a[0] / buyPrize;
        if (c < 0.6) {
            // 跌幅高，说明是四期
            print(TurnipType.FOUR);
            return;
        }
        // 根据第二天价格判断


    }

    private static void print(TurnipType... s) {
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
