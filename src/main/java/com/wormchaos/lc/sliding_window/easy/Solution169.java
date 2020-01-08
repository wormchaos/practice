package com.wormchaos.lc.sliding_window.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-1-8.
 * >n/2的众数
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        // 先排序

        // 取N/2
        return -1;

    }
    public int majorityElementV1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer t = map.get(nums[i]);
            if(null == t) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], t + 1);
            }
        }
        int max = 0;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
