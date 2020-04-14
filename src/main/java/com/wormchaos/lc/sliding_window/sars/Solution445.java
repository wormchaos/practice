package com.wormchaos.lc.sliding_window.sars;

import com.wormchaos.lc.toolbean.ListNode;

/**
 * Created by wormchaos on 2020-4-14.
 */
public class Solution445 {

    private int addCount = 0;

    private int step = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        ListNode h1 = l1;
        ListNode h2 = l2;
        int len1 = getLen(l1);
        int len2 = getLen(l2);
        // h1大于h2
        if (len1 < len2) {
            h1 = l2;
            h2 = l1;
            step = len2 - len1;
        } else {
            step = len1 - len2;
        }
        ListNode result = new ListNode(1);
        result.next = add(h1, h2);
        if (addCount > 0){
            return result;
        }
        return h1;
    }

    private ListNode add(ListNode h1, ListNode h2) {
        if (null == h1) {
            return null;
        }
        int h2Val = null == h2 ? 0 : h2.val;
        if (step > 0) {
            step--;
            h2Val = 0;
            h1.next = add(h1.next, h2);
        } else {
            h1.next = add(h1.next, null == h2 ? null : h2.next);
        }
        h1.val += h2Val + addCount;
        addCount = 0;
        if (h1.val >= 10) {
            addCount++;
            h1.val %= 10;
        }
        return h1;
    }

    private int getLen(ListNode l1) {
        if (null == l1) {
            return 0;
        }
        return getLen(l1.next) + 1;
    }
}
