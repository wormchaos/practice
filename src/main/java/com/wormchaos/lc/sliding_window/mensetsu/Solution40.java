package com.wormchaos.lc.sliding_window.mensetsu;

/**
 * Created by wormchaos on 2020-3-20.
 */
public class Solution40 {
    // 小根堆
    public int[] getLeastNumbers(int[] arr, int k) {
        // 排序成小根堆
        for (int i = (arr.length - 1) / 2; i >=0; i--) {
            sort(arr, i, arr.length);
        }

        int[] a = new int[k];
        for (int i = 0; i < a.length; i++) {
            swap(arr, 0, arr.length - 1 - i);
            a[i] = arr[arr.length - 1 - i];
            sort(arr, 0, arr.length - 1 - i);
        }
        return a;
    }

    private void swap(int[] arr, int s, int e) {
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }

    /**
     * 对0-n的第k个数小根
     * @param arr
     * @param k
     * @param n
     */
    private void sort(int[] arr, int k, int n) {
        int parent = k;
        int child = 2 *k + 1;
        int temp = arr[parent];
        while (child < n) {
            // 如果右节点更小，选右节点
            if(child + 1 < n && arr[child] > arr[child + 1]) {
                child++;
            }
            if(temp <= arr[child]) {
                break;
            }
            arr[parent] = arr[child];
            parent = child;
            child = 2 * child + 1;
        }
        arr[parent] = temp;
    }
}
