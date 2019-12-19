package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-19.
 * sum3问题
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3) {
            return list;
        }

        // 先排序
        Arrays.sort(nums);

        for (int i=0; i <nums.length-2; i++) {
            if(i > 0 && nums[i] == nums[i -1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length -1;
            while(r > l) {
                int t = nums[l] + nums[r] + nums[i];
                if(t == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    list.add(temp);
                    while(r > l &&  nums[l] == nums[l+1] ) {
                        l++;
                    }
                    while(r > l && nums[r] == nums[r-1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if(t > 0) {
                    r--;
                } else if(t < 0) {
                    l++;
                }
            }
        }

        return list;
    }
}
