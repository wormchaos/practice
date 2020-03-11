package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.List;

/**
 * Created by wormchaos on 2020-3-11.
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(-1);
        result.next = head;
        if(null == head) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;
        p1.next = null;
        while(p2 != null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        return p1;
    }
}
