package com.wormchaos.lc.myself;

/**
 * Created by wormchaos on 2020-1-8.
 */
public class SortTest {
    public static void main(String... args) {
        int[] arr = new int[]{3, 1, 1, 23, 10, 6, 7, 8, 7, 4, 3};
        int c = insertSort(arr);
//        int c = shellSort(arr);
        print(arr);
        System.out.print("\n时间" + c + "/" + arr.length);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * TODO 以后再写一次
     *
     * @param a
     * @return
     */
    public static int shellSort(int[] a) {
        int calCount = 0;
        // 分隔
        int j;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                for (j = i; j >= gap && tmp < a[j - gap]; j -= gap) {
                    calCount++;
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
            }
        }
        return calCount;
    }

    // 插排 单个数字插入有序的数组
    public static int insertSort(int[] a) {
        int calCount = 0;
        // 0- n-2 的有序数组
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                calCount++;
                if (a[j] > a[i + 1]) {
                    swap(a, i + 1, j);
                }
            }

        }
        return calCount;
    }

    private static void swap(int[] arr, int num1, int num2) {
        int t = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = t;
    }
}
