package com.wormchaos.lc.sliding_window.normal;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Arrays;

/**
 * Created by wormchaos on 2019-12-31.
 * 数字和为target
 */
public class Solution39 {

    /**
     * 数字和
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates.length == 0) {
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> list = new LinkedList<>();
        test(candidates, target,0, 0, list, result);
        return result;
    }


    public void test(int[] candidates, int target, int sum, int last, List<Integer> list, List<List<Integer>> result) {
        if(sum == target) {
            List<Integer> tempList = new ArrayList<>();
            for(Integer i : list) {
                tempList.add(i);
            }
            result.add(tempList);
        }
        if(sum > target) {
            return;
        }
        for(int i=0;i< candidates.length; i++) {
            if(candidates[i] >= last) {
                list.add(candidates[i]);
                test(candidates, target, sum + candidates[i], candidates[i], list, result);
                list.remove(list.size() - 1);
            }

        }
    }
}
