package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.List;

/**
 * Created by wormchaos on 2020-3-11.
 */
public class Solution206 {

    /**
     * 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(null == head || null == head.next) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    /**
     * 迭代优化
     *
     * @param head
     * @return
     */
    public ListNode reverseListV2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    /**
     * 迭代
     *
     * @param head
     * @return
     */
    public ListNode reverseListV1(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;
        p1.next = null;
        while (p2 != null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        return p1;
    }
}
