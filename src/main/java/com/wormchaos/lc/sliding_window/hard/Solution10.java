package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-9.
 * 正则表达式
 */
public class Solution10 {


    /**
     * 自下而上的dp
     *
     * @param text
     * @param pattern
     * @return
     */
    public boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;
        for (int i = text.length(); i >= 0; i--) {
            // 从倒数第二个开始
            for (int j = pattern.length() -1; j >= 0; j--) {
                boolean first = i < text.length() && !text.substring(i, text.length()).isEmpty() &&
                        (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.');
                if(j + 2 <= pattern.length() && pattern.charAt(j + 1) == '*') {
                    dp[i][j] = (first && dp[i+1][j]) || dp[i][j+2];
                } else {
                    dp[i][j] = first && dp[i+1][j+1];
                }
            }
        }

        return dp[0][0];
    }


    private enum Result {
        True, False;
    }

    /**
     * dp解
     *
     * @param text
     * @param pattern
     * @return
     */
    public boolean isMatchV3(String text, String pattern) {
        // x,y表示text的第x位开始和pattern的第y位开始是否匹配
//        boolean[][] dp = new boolean[text.length()][pattern.length()];
        // 可能场景
        // if i == j || j =='.' dp[i][j] = dp[i+1][j+1];
        // if j+1 == '*' dp[i][j] = dp[i][j+2] || dp[i+1][j];
//        return dp[0][0];
        Result[][] memo = new Result[text.length() + 1][pattern.length() + 1];
        boolean result = dp(0, 0, text, pattern, memo);
        return result;
    }

    private boolean dp(int i, int j, String text, String pattern, Result[][] memo) {
        boolean result;
        if (memo[i][j] != null) {
            return memo[i][j] == Result.True;
        }
        if (pattern.substring(j, pattern.length()).length() == 0) {
            result = text.substring(i, text.length()).length() == 0;
            memo[i][j] = result ? Result.True : Result.False;
            return result;
        }
        boolean first = !text.substring(i, text.length()).isEmpty() && (text.charAt(i) == pattern.charAt(j)
                || pattern.charAt(j) == '.');
        if (pattern.substring(j, pattern.length()).length() > 1 && pattern.charAt(j + 1) == '*') {
            boolean f1 = dp(i, j + 2, text, pattern, memo);
            boolean f2 = first && dp(i + 1, j, text, pattern, memo);
            result = f1 || f2;
        } else {
            result = first && dp(i + 1, j + 1, text, pattern, memo);
        }
        memo[i][j] = result ? Result.True : Result.False;
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
