package com.wormchaos.lc.piko;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by wormchaos on 2020-4-8.
 */
public class PikoCode {

    public static Map<String, Integer> map = new HashMap() {
        {
            this.put("滅", 0);
            this.put("苦", 1);
            this.put("婆", 2);
            this.put("娑", 3);
            this.put("耶", 4);
            this.put("陀", 5);
            this.put("跋", 6);
            this.put("多", 7);
            this.put("漫", 8);
            this.put("都", 9);
            this.put("殿", 10);
            this.put("悉", 11);
            this.put("夜", 12);
            this.put("爍", 13);
            this.put("帝", 14);
            this.put("吉", 15);
            this.put("利", 16);
            this.put("阿", 17);
            this.put("無", 18);
            this.put("南", 19);
            this.put("那", 20);
            this.put("怛", 21);
            this.put("喝", 22);
            this.put("羯", 23);
            this.put("勝", 24);
            this.put("摩", 25);
            this.put("伽", 26);
            this.put("謹", 27);
            this.put("波", 28);
            this.put("者", 29);
            this.put("穆", 30);
            this.put("僧", 31);
            this.put("室", 32);
            this.put("藝", 33);
            this.put("尼", 34);
            this.put("瑟", 35);
            this.put("地", 36);
            this.put("彌", 37);
            this.put("菩", 38);
            this.put("提", 39);
            this.put("蘇", 40);
            this.put("醯", 41);
            this.put("盧", 42);
            this.put("呼", 43);
            this.put("舍", 44);
            this.put("佛", 45);
            this.put("參", 46);
            this.put("沙", 47);
            this.put("伊", 48);
            this.put("隸", 49);
            this.put("麼", 50);
            this.put("遮", 51);
            this.put("闍", 52);
            this.put("度", 53);
            this.put("蒙", 54);
            this.put("孕", 55);
            this.put("薩", 56);
            this.put("夷", 57);
            this.put("迦", 58);
            this.put("他", 59);
            this.put("姪", 60);
            this.put("豆", 61);
            this.put("特", 62);
            this.put("逝", 63);
            this.put("朋", 64);
            this.put("輸", 65);
            this.put("楞", 66);
            this.put("栗", 67);
            this.put("寫", 68);
            this.put("數", 69);
            this.put("曳", 70);
            this.put("諦", 71);
            this.put("羅", 72);
            this.put("曰", 73);
            this.put("咒", 74);
            this.put("即", 75);
            this.put("密", 76);
            this.put("若", 77);
            this.put("般", 78);
            this.put("故", 79);
            this.put("不", 80);
            this.put("實", 81);
            this.put("真", 82);
            this.put("訶", 83);
            this.put("切", 84);
            this.put("一", 85);
            this.put("除", 86);
            this.put("能", 87);
            this.put("等", 88);
            this.put("是", 89);
            this.put("上", 90);
            this.put("明", 91);
            this.put("大", 92);
            this.put("神", 93);
            this.put("知", 94);
            this.put("三", 95);
            this.put("藐", 96);
            this.put("耨", 97);
            this.put("得", 98);
            this.put("依", 99);
            this.put("諸", 100);
            this.put("世", 101);
            this.put("槃", 102);
            this.put("涅", 103);
            this.put("竟", 104);
            this.put("究", 105);
            this.put("想", 106);
            this.put("夢", 107);
            this.put("倒", 108);
            this.put("顛", 109);
            this.put("離", 110);
            this.put("遠", 111);
            this.put("怖", 112);
            this.put("恐", 113);
            this.put("有", 114);
            this.put("礙", 115);
            this.put("心", 116);
            this.put("所", 117);
            this.put("以", 118);
            this.put("亦", 119);
            this.put("智", 120);
            this.put("道", 121);
            this.put("。", 122);
            this.put("集", 123);
            this.put("盡", 124);
            this.put("死", 125);
            this.put("老", 126);
            this.put("至", 127);
        }
    };

    private static int[] convertToArray(String s) {
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = map.getOrDefault(s.substring(i, i + 1), -1);
        }
        return a;
    }

    private static void printKey(String... ss) {
        for (String s : ss) {
            int[] a = convertToArray(s);
            for (int i = 0; i < a.length - 1; i++) {
                System.out.print(a[i]);
                int k = 0;
                while (a[i] > 0) {
                    k++;
                    a[i] /= 10;
                }
                for (int j = 0; j < 4 - k; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        String[] s = new String[]{"土豆苦滅苦滅勝滅滅者羅寫醯苦耶滅不苦滅滅", "土豆苦滅苦滅勝滅伊怛羅寫醯苦耶滅藐苦滅滅", "土豆苦滅苦滅勝滅不多羅寫醯苦耶滅藐苦滅滅",
                "土豆苦滅苦滅勝滅朋悉羅寫醯苦耶滅不苦滅滅", "土豆苦滅苦滅勝滅怖跋羅寫醯苦耶滅藐苦滅滅"};
        printKey(s);
//        String s = "土豆苦滅苦滅勝滅藐孕密寫醯苦耶滅利婆滅滅";
//        String s1 = "土豆苦滅苦滅勝滅滅蒙密寫醯苦耶滅藐苦滅滅";
//        String s2 = "土豆苦滅苦滅勝滅不特密寫醯苦耶滅利婆滅滅";
//        int[] a = convertToArray(s);
//        for (int i = 8; i < a.length - 2; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        int[] a1 = convertToArray(s1);
//        for (int i = 8; i < a1.length - 2; i++) {
//            System.out.print(a1[i] + " ");
//        }
//        System.out.println();
//        int[] a2 = convertToArray(s2);
//        for (int i = 8; i < a2.length - 2; i++) {
//            System.out.print(a2[i] + " ");
//        }
    }
}
