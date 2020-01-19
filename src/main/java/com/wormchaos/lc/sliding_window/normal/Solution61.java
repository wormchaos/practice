package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.toolbean.ListNode;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        while (head != null) {
            len++;
            head = head.next;
        }
        k %= len;
        head = pre.next;
        while (k < len - 1) {
            head = head.next;
            k++;
        }
        ListNode result = head.next;
        ListNode temp = head;
        while(head.next != null) {
            head = head.next;
        }
        head.next = pre.next;
        temp.next = null;
        return result;
    }
}
