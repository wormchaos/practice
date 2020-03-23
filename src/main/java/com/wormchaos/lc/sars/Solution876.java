package com.wormchaos.lc.sars;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.List;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
