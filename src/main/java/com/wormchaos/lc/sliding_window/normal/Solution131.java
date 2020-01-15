package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-15.
 */
public class Solution131 {

    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        String[][] dp = new String[s.length()][s.length()];
        List<String> list = new ArrayList<>();
        calc(s, 0, list, dp);
        // 得到解集
        return result;
    }

    private void calc(String s, int current, List<String> list, String[][] dp) {
        if (current == s.length()) {
            List<String> temp = new ArrayList<>();
            for (String l : list) {
                temp.add(l);
            }
            result.add(temp);
        } else {
            for (int i = 0; i < s.length() - current; i++) {
                if (dp[current][current + i] != null && dp[current][current + i].length() == 0) {
                    continue;
                }
                if (isValid(s, current, current + i)) {
                    dp[current][current + i] = s.substring(current, current + i + 1);
                } else {
                    dp[current][current + i] = "";
                }
                if(dp[current][current + i].length() > 0 ) {
                    // 符合条件
                    list.add(dp[current][current + i]);
                    calc(s, current + i + 1, list, dp);
                    list.remove(list.size() - 1);
                }
            }

        }

    }

    private boolean isValid(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

//    private String getLoop(String[][] dp, int current, int end) {
//        if(end == current) {
//            return dp[current][current];
//        }
//
//
//    }

}
