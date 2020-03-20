package com.wormchaos.lc.sliding_window.mensetsu;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-3-20.
 */
public class Solution40 {

    /**
     * 快排
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        quickSort(arr, 0, arr.length -1, k);
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    private void quickSort(int[] arr, int left, int right, int k) {
        if(left > right) {
            return;
        }
        int l = left;
        int r = right;
        int temp = arr[l];
        while (l < r) {
            while (l < r && arr[r] >= temp) {
                r--;
            }
            arr[l] = arr[r];
            while (l < r && arr[l] <= temp) {
                l++;
            }
            arr[r] = arr[l];
        }
        arr[l] = temp;
        if ( l > k) {
            quickSort(arr, left, l - 1, k);
        } else if (l < k) {
            quickSort(arr, left, l - 1, k);
            quickSort(arr, l + 1, right, k);
        }
    }


    // java自带
    public int[] getLeastNumbers_PriorityQueue(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        // 使用一个最大堆（大顶堆）
        // Java 的 PriorityQueue 默认是小顶堆
        Queue<Integer> heap = new PriorityQueue<>();

        for (int e : arr) {
            e = -e;
            // 当前数字大于堆顶元素才会入堆(负数的大于即原数的小于)
            if (heap.isEmpty() || heap.size() < k || e > heap.peek()) {
                heap.offer(e);
            }
            if (heap.size() > k) {
                heap.poll(); // 删除堆顶最大元素
            }
        }

        // 将堆中的元素存入数组
        int[] res = new int[heap.size()];
        for (int i = 0; i < k; i++) {
            res[k - i - 1] = -heap.poll();
        }
        return res;
    }


    // 小根堆
    public int[] getLeastNumbers_VHeap(int[] arr, int k) {
        // 排序成小根堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
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
     *
     * @param arr
     * @param k
     * @param n
     */
    private void sort(int[] arr, int k, int n) {
        int parent = k;
        int child = 2 * k + 1;
        int temp = arr[parent];
        while (child < n) {
            // 如果右节点更小，选右节点
            if (child + 1 < n && arr[child] > arr[child + 1]) {
                child++;
            }
            if (temp <= arr[child]) {
                break;
            }
            arr[parent] = arr[child];
            parent = child;
            child = 2 * child + 1;
        }
        arr[parent] = temp;
    }
}
