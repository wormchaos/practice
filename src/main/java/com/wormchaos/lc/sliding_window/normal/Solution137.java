package com.wormchaos.lc.sliding_window.normal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-6.
 */
public class Solution137 {

    /**
     * 位运算
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int seenOnce = 0, seenTwice = 0;

        for (int num : nums) {
            // first appearence:
            // add num to seen_once
            // don't add to seen_twice because of presence in seen_once

            // second appearance:
            // remove num from seen_once
            // add num to seen_twice

            // third appearance:
            // don't add to seen_once because of presence in seen_twice
            // remove num from seen_twice
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }


    /**
     * hash
     * @param nums
     * @return
     */
    public int singleNumber_HASH(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], null == map.get(nums[i]) ? 1 : map.get(nums[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return -1;
    }
}
