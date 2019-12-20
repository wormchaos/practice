package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-20.
 * 四数和
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp;
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if(i != 0 && i != nums.length -3 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if(j != i+ 1 && j != nums.length -2 && nums[j] == nums[j-1]) {
                    continue;
                }
                int l = j+1;
                int r = nums.length - 1;
                while (l < r) {
                    int t = nums[i] + nums[j] + nums[r] + nums[l];
                    if(t == target) {
                        temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        result.add(temp);
                        while(l < r && nums[l] == nums[l+1]) {
                            l++;
                        }
                        while(l < r && nums[r] == nums[r-1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (t < target) {
                        l++;
                    } else if (t > target) {
                        r--;
                    }
                }
            }
        }
        return result;

    }
}
