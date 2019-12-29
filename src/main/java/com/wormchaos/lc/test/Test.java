package com.wormchaos.lc.test;


/**
 * Created by wormchaos on 2019-12-16.
 */
public class Test {

    /**
     * 非法chuanxiao树状结构
     */
    public static String[] levelArray = new String[] { "发展层", "A阶", "B阶", "一阶", "三阶", "九阶" };

    public static void main(String... args) {
        // 初始化一个九阶，无发展层的场景
        Tree[] node = init();
    }

    private static void fazhan(int n) {

    }

    private static Tree[] init() {
        Tree[] t = new Tree[500];
        int k = -1;
        int c = levelArray.length - 1;
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tree(c);
            if (i == (k * 3 + 3)) {
                k = k * 3 + 3;
                c--;
            }
        }
        print(t);
        return t;

    }

    private static void print(Tree[] arr) {
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].level + " ");
            if (i == (k * 3 + 3)) {
                k = k * 3 + 3;
                System.out.println();
            }
        }
    }

}
