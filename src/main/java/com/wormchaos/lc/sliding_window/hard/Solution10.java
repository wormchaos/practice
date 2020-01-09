package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-9.
 * 正则表达式
 */
public class Solution10 {

    /**
     * dp解
     *
     * @param text
     * @param pattern
     * @return
     */
    public boolean isMatch(String text, String pattern) {
        // x,y表示text的第x位开始和pattern的第y位开始是否匹配
//        boolean[][] dp = new boolean[text.length()][pattern.length()];
        // 可能场景
        // if i == j || j =='.' dp[i][j] = dp[i+1][j+1];
        // if j+1 == '*' dp[i][j] = dp[i][j+2] || dp[i+1][j];
//        return dp[0][0];
        int[][] memo = new int[text.length() + 1][pattern.length() + 1];
        boolean result = dp(0, 0, text, pattern, memo);
        return result;
    }

    private boolean dp(int i, int j, String text, String pattern, int[][] memo) {
        if (memo[i][j] != 0) {
            return memo[i][j] == 1 ? true : false;
        }
        if (text.isEmpty() || i > text.length() || j > pattern.length()) {
            return pattern.isEmpty();
        }
        boolean first = !text.isEmpty() && (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.');
        boolean result;
        if (text.length() > 1 && text.charAt(i + 1) == '*') {
            result = (first && memo[i + 1][j] == 1) || (memo[i][j + 2] == 1);
        } else {
            result = first && memo[i + 1][j + 1] == 1;
        }
        memo[i][j] = result ? 1 : -1;
        return result;

    }


    /**
     * 添加*暴力匹配
     *
     * @param text
     * @param pattern
     * @return
     */
    public boolean isMatchV2(String text, String pattern) {
        if (pattern.length() == 0) {
            return text.length() == 0;
        }
        boolean firstMatch = text.length() != 0 && (pattern.charAt(0) == '.' || pattern.charAt(0) == text.charAt(0));
        if (pattern.length() > 1 && pattern.charAt(1) == '*') {
            // *匹配0次, 因为0次的场景pattern前一位可以忽视
            boolean p1 = isMatchV2(text, pattern.substring(2, pattern.length()));
            // *匹配N次
            boolean p2 = firstMatch && isMatchV2(text.substring(1, text.length()), pattern);
            return p1 || p2;
        }
        return firstMatch && isMatchV2(text.substring(1, text.length()), pattern.substring(1, pattern.length()));
    }

    /**
     * 无*匹配
     *
     * @param text
     * @param pattern
     * @return
     */
    public boolean isMatchV1(String text, String pattern) {
        if (pattern.length() == 0) {
            return text.length() == 0;
        }
        boolean firstMatch = text.length() != 0 && (pattern.charAt(0) == '.' || pattern.charAt(0) == text.charAt(0));
        return firstMatch && isMatchV1(text.substring(1, text.length()), pattern.substring(1, pattern.length()));
    }
}
