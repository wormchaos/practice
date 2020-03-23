package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-5.
 */
public class Solution1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] a = new int[num_people];
        int p = 0;
        int num = 1;
        while (candies > 0) {
            if(candies < num) {
                num = candies;
            }
            a[p] += num;
            candies -= num;
            num++;
            p = (p+1) % num_people;
        }
        return a;
    }
}
