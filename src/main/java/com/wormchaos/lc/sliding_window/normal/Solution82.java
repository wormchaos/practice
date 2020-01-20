package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.List;

/**
 * Created by wormchaos on 2020-1-20.
 */
public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        // 前一个节点
        ListNode p1 = pre;
        boolean isInSame = false;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                isInSame = true;
            } else {
                if (isInSame) {
                    p1.next = null == p1.next ? null : p1.next.next;
                    head = p1;
                    isInSame = false;
                } else {
                    p1 = head;
                    head = head.next;
                }
            }
        }
        if (isInSame) {
            p1.next = null == p1.next ? null : p1.next.next;
        }
        return pre.next;
    }
}
