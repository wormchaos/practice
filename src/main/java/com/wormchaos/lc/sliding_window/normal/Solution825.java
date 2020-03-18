package com.wormchaos.lc.sliding_window.normal;


/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution825 {

    public int numFriendRequests(int[] ages) {
        int count = 0;
        int[] age = new int[121];
        for (int i = 0; i < ages.length; i++) {
            age[ages[i]]++;
        }
        for (int j = 1; j < age.length; j++) {
            for (int i = j; i <age.length && age[j] > 0; i++) {
                if (age[i] > 0 && !canNotSend(i, j)) {
                    if(i == j) {
                        count += (age[i] -1) * age[i];
                    } else {
                        count += age[i] * age[j];
                    }
                }
            }
        }
        return count;
    }


    /**
     * 穷举(超时)
     *
     * @param ages
     * @return
     */
    public int numFriendRequestsV1(int[] ages) {
        int count = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i == j) {
                    continue;
                }
                if (!canNotSend(ages[i], ages[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean canNotSend(int a, int b) {
        return (b <= 0.5 * a + 7) || b > a || (b > 100 && a < 100);
    }
}
