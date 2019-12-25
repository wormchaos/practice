package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import jdk.nashorn.internal.ir.ForNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-23
 * 移除元素
 */
public class Solution28 {

    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        int l=0;
        int r=nums.length;
        while(l < r) {
            if(nums[l] == val) {
                nums[l] = nums[r-1];
                r--;
            } else {
                l++;
            }
        }
        return r;
    }

}