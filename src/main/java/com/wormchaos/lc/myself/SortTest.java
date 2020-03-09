package com.wormchaos.lc.myself;

/**
 * Created by wormchaos on 2020-1-8.
 */
public class SortTest {
    public static void main(String... args) {
//        int[] arr = new int[]{3, 1, 1, 23, 10, 6, 7, 8, 7, 4, 3};
        int[] arr = new int[]{16, 7, 3, 20, 17, 8};
//        int c = insertSort(arr);
//        int c = shellSort(arr);
//        int c = switchSort(arr);
        int c = headTreeSort(arr, arr.length);
        print(arr);
        System.out.print("\n时间" + c + "/" + arr.length);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 堆排 前N个数
    private static int headTreeSort(int[] a, int k) {
        // 当前长度n，顶为0，n-1必为叶节点
        // 叶子节点个数 (n+1)/ 2
        // 逐个调整非叶节点
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            adjustHeap(a, i, a.length);
        }
        for (int i = k - 1; i > 0; i--) {
            swap(a, 0, i);
            adjustHeap(a, 0, i);
        }
        return -1;
    }

    /**
     * 调整堆
     *
     * @param arr    待排序列
     * @param parent 父节点
     * @param length 待排序元素长度
     */
    private static void adjustHeap(int[] arr, int parent, int length) {
        //将temp作为父节点
        int temp = arr[parent];
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[lChild]) {
                break;
            }

            // 把孩子结点的值赋给父结点
            arr[parent] = arr[lChild];

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = temp;
    }


    // 交换排序
    private static int switchSort(int[] a) {
        int calCount = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int k = i;
            for (int j = i; j < a.length; j++) {
                calCount++;
                if (a[k] > a[j]) {
                    k = j;
                }
            }
            swap(a, k, i);
        }
        return calCount;
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
