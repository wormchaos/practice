package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-28.
 * move 0
 */
public class Solution283 {

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != 0) {
                nums[zeroCount] = nums[i];
                zeroCount++;
            }
            i++;
        }
        for(int j =zeroCount ;j<nums.length;j++) {
            nums[j] = 0;
        }
    }

    /**
     * 该方法需要加额外数组
     */
    public void moveZeroesV1(int[] nums) {
        int[] a = new int[nums.length];
        int count = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                a[i] = count;
            }
        }

        for(int i = 0;i<nums.length;i++) {
            nums[i-a[i]] = nums[i];
        }
        for(int i=nums.length - count; i <nums.length;i++){
            nums[i] = 0;
        }
    }

}
