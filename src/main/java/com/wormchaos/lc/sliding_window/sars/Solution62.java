package com.wormchaos.lc.sliding_window.sars;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-3-30.
 */
public class Solution62 {

    /**
     * 长度为n的队列，按m个排序，留下第几个数
     * @param n
     * @param m
     */
    public int lastRemaining(int n, int m) {
        if(n == 1) {
            return 0;
        }
        int num = lastRemaining(n-1, m);
        return (num + m ) % n;

    }


    /**
     * 队列模拟（超时）
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining_queue(int n, int m) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            Integer size = queue.size();
            for (int i =0; i < m-1; i++) {
                queue.add(queue.poll());
            }
            queue.poll();
        }
        return queue.poll();
    }
}
