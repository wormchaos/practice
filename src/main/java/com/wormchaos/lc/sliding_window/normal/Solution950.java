package com.wormchaos.lc.sliding_window.normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-24.
 */
public class Solution950 {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }
        int[] result = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            result[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }
        return result;
    }
}
