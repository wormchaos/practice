package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-22.
 */
public class Solution215 {

    // TODO 更优的BFPRT算法
    // https://zhuanlan.zhihu.com/p/31498036
    /**
     * 大根堆排序
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0 || k == 0) {
            return -1;
        }
        // 初始化大根堆
        for (int i = (nums.length - 1) / 2; i >= 0; i--) {
            adjustHeap(nums, i, nums.length);
        }

        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            // 交换根节点和i个数
            int t = nums[i];
            nums[i] = nums[0];
            nums[0] = t;
            adjustHeap(nums, 0, i);
        }

        return nums[nums.length - k];
    }

    private void adjustHeap(int[] nums, int parent, int len) {
        int temp = nums[parent];
        int child = 2 * parent + 1;
        while (child < len) {
            // 左右结点取更大
            if (child + 1 < len && nums[child + 1] > nums[child]) {
                child++;
            }
            // 父结点和较大子节点对比
            if (temp >= nums[child]) {
                break;
            }
//            // 父节点下移继续比较
//            nums[child] = nums[parent];
            // child必为最大，因此给parent赋值
            nums[parent] = nums[child];
            parent = child;
            child = 2 * parent + 1;
        }
        // 当前parent实际为child
        nums[parent] = temp;

    }


    /**
     * 选择排序
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest_switch(int[] nums, int k) {
        if (nums.length == 0) {
            return -1;
        }
        k = k > nums.length ? nums.length : k;
        for (int i = 0; i < k; i++) {
            int t = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[t] < nums[j]) {
                    t = j;
                }
            }
            int temp = nums[t];
            nums[t] = nums[i];
            nums[i] = temp;
        }

        return nums[k - 1];
    }
}
