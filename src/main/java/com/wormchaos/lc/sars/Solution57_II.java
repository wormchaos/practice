package com.wormchaos.lc.sars;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-6.
 */
public class Solution57_II {

    public int[][] findContinuousSequence(int target) {
        int l = 1;
        int r = 1;
        int sum = 1;
        List<Integer[]> result = new ArrayList<>();
        while (l + r <= target) {
            if (sum < target) {
                r++;
                sum += r;
            } else if (sum > target) {
                sum -= l;
                l++;
            } else {
                Integer[] temp = new Integer[r - l + 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = l + i;
                }
                result.add(temp);
                sum -= l;
                l++;
            }
        }

        int[][] a = new int[result.size()][];
        for (int i = 0 ; i < result.size(); i++) {
            a[i] = new int[result.get(i).length];
            for (int j = 0; j < result.get(i).length; j++) {
                a[i][j] = result.get(i)[j];
            }
        }
        return a;

    }

    /**
     * 审题错误，连续
     */
//    public int[][] findContinuousSequence(int target) {
//        int n = 0;
//        int sum = 0;
//        while (sum < target) {
//            sum += n;
//            n++;
//        }
//        List<Object[]> resultList = new ArrayList<>();
//        // 1..n之间
//        Stack<Integer> stack = new Stack<>();
//        loop(0, n, target, stack, 0, resultList);
//        int[][] result = new int[resultList.size()][];
//
//        for (int i = 0; i < resultList.size(); i++) {
//            Object[] r = resultList.get(i);
//            result[i] = new int[r.length];
//            for (int j = 0; j < r.length; j++) {
//                result[i][j] = (Integer) r[j];
//            }
//        }
//        return result;
//
//    }
//
//    private void loop(int current, int finalNum, int target, Stack<Integer> stack, int sum, List<Object[]> resultList) {
//        if (sum == target) {
//            resultList.add(stack.toArray());
//        } else if (sum < target) {
//            for (int i = current + 1; i <= finalNum; i++) {
//                stack.push(i);
//                loop(i, finalNum, target, stack, sum + i, resultList);
//                stack.pop();
//            }
//        }
//    }
}
