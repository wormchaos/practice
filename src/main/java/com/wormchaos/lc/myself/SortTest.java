package com.wormchaos.lc.myself;

/**
 * Created by wormchaos on 2020-1-8.
 */
public class SortTest {
    public static void main(String... args) {
        int[] arr = new int[]{1,3,1,23,10,6,7,8,7,4,3};
        insertSort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i+1];
            int k = i+1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    k = j;
                }
            }
            swtich(arr, i+1, k);
        }

    }

    private static void swtich(int[] arr, int num1, int num2) {
        int t= arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = t;
    }
}
