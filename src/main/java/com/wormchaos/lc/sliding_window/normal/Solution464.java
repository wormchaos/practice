package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-16.
 */
public class Solution464 {


    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        boolean[] choosen = new boolean[maxChoosableInteger + 1];
        int times = 0;
        dfs(desiredTotal, choosen, 0, 0);
        return false;
    }

    private void dfs(int desiredTotal, boolean[] choosen, int current, int times) {
        if(current >= desiredTotal) {

        }

    }

//    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
//        if (desiredTotal <= maxChoosableInteger) {
//            return true;
//        }
//        boolean[] used = new boolean[maxChoosableInteger + 1];
//        // 最高取maxChoosableInteger的时候是否能满足到达
//        Boolean[] isFailed = new Boolean[desiredTotal + 1];
//        for (int i = 1; i <= maxChoosableInteger; i++) {
//            isFailed[i] = true;
//        }
//        boolean canWin = canFinishInOwnTurn(used, maxChoosableInteger, desiredTotal, isFailed);
//        return canWin;
//    }
//
//    // 获胜 = 下一次最优选择 仍然失败
//    private boolean canFinishInOwnTurn(boolean[] used, int maxChoosableInteger, int desiredTotal, Boolean[] isFailed) {
//        if (desiredTotal <= 0) {
//            return false;
//        }
//        for (int i = maxChoosableInteger; i >= 1; i--) {
//            if (!used[i]) {
//                if (null != isFailed[desiredTotal]) {
//                    return isFailed[desiredTotal];
//                }
//                used[i] = true;
//                boolean canFinish = !canFinishInOwnTurn(used, maxChoosableInteger, desiredTotal - i, isFailed);
//                used[i] = false;
//                if (canFinish) {
//                    return true;
//                } else {
//                    isFailed[desiredTotal] = canFinish;
//                }
//            }
//        }
//        return false;
//    }
//    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
//        if (desiredTotal <= maxChoosableInteger) {
//            return true;
//        }
//        int sum = 0;
//        for (int i = 1; i <= maxChoosableInteger; i++) {
//            sum += i;
//        }
//        if (sum == desiredTotal) {
//            return maxChoosableInteger % 2 == 1;
//        }
//        if (maxChoosableInteger % 2 == 0) {
//            return false;
//        }
//        // 奇数
//        // 去头
//        int avg = (sum - 1) / ((maxChoosableInteger - 1) / 2);
//        if ((desiredTotal - 1) % avg == 0) {
//            return true;
//        }
//        // 去尾
//        avg = (sum - maxChoosableInteger) / ((maxChoosableInteger - 1) / 2);
//        if ((desiredTotal - maxChoosableInteger) % avg == 0) {
//            return true;
//        }
//        // 去中心
//        avg = (sum - (1 + maxChoosableInteger) / 2) / ((maxChoosableInteger - 1) / 2);
//        if ((desiredTotal - (1 + maxChoosableInteger) / 2) % avg == 0) {
//            return true;
//        }
//
//        return false;
//
//    }
}
