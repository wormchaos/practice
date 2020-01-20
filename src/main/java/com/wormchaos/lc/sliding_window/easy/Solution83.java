package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.ListNode;

/**
 * Created by wormchaos on 2020-1-20.
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        while(head != null && head.next != null) {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return pre.next;
    }
}
