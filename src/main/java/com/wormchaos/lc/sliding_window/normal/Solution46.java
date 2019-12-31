package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-27.
 */
public class Solution46 {

//    private void generatePermution(int[] nums, boolean[] visited, int curSize, int len, Stack<Integer> path, List<List<Integer>> res) {
//        if (curSize == len) {
//            // 此时 path 已经保存了 nums 中的所有数字，已经成为了一个排列
//            res.add(new ArrayList<>(path));
//            return;
//        }
//        for (int i = 0; i < len; i++) {
//            if (!visited[i]) {
//                path.push(nums[i]);
//                visited[i] = true;
//                generatePermution(nums, visited, curSize + 1, len, path, res);
//                // 刚开始接触回溯算法的时候常常会忽略状态重置
//                // 回溯的时候，一定要记得状态重置
//                path.pop();
//                visited[i] = false;
//            }
//        }
//    }
//
//    public List<List<Integer>> permute(int[] nums) {
//        int len = nums.length;
//        List<List<Integer>> res = new ArrayList<>();
//        boolean[] used = new boolean[len];
//        if (len == 0) {
//            return res;
//        }
//        generatePermution(nums, used, 0, len, new Stack<Integer>(), res);
//        return res;
//    }

    public List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        test(nums, used, 0, list, result);
        return result;
    }

    private void test(int[] nums, int[] used, int level, List<Integer> list, List<List<Integer>> result) {
        if(nums.length == level) {
            result.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] == 0) {
                list.add(nums[i]);
                used[i] = 1;
                test(nums, used, level+1, list, result);
                list.remove(list.size() - 1);
                used[i] = 0;
            }
        }

    }

//    public void backtrack(int n,
//                          ArrayList<Integer> nums,
//                          List<List<Integer>> output,
//                          int first) {
//        // if all integers are used up
//        if (first == n) {
//            output.add(new ArrayList<Integer>(nums));
//        }
//        for (int i = first; i < n; i++) {
//            // place i-th integer first
//            // in the current permutation
//            Collections.swap(nums, first, i);
//            // use next integers to complete the permutations
//            backtrack(n, nums, output, first + 1);
//            // backtrack
//            Collections.swap(nums, first, i);
//        }
//    }
//
//    public List<List<Integer>> permute(int[] nums) {
//        // init output list
//        List<List<Integer>> output = new LinkedList();
//
//        // convert nums into list since the output is a list of lists
//        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
//        for (int num : nums) {
//            nums_lst.add(num);
//        }
//
//        int n = nums.length;
//        backtrack(n, nums_lst, output, 0);
//        return output;
//    }
}
