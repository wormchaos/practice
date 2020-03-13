package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-3-13.
 */
public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length == 0) {
            return result;
        }
        Integer n1 = nums[0];
        int c1 = 0;
        Integer n2 = nums[0];
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == n1) {
                c1++;
                continue;
            }
            if(nums[i] == n2) {
                c2++;
                continue;
            }
            if(c1 == 0) {
                n1 = nums[i];
                c1 = 1;
                continue;
            }
            if(c2 == 0) {
                n2 = nums[i];
                c2 = 1;
                continue;
            }
            c1--;
            c2--;
        }
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == n1) {
                c1++;
            } else if(nums[i] == n2) {
                c2++;
            }
        }
        if(c1 > nums.length / 3) {
            result.add(n1);
        }
        if(c2 > nums.length / 3) {
            result.add(n2);
        }
        return result;
    }
}
