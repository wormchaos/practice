package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.List;

/**
 * Created by wormchaos on 2019-12-20.
 */
public class Solution21 {


    /**
     * 迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(null == l1) {
            temp.next = l2;
        } else {
            temp.next = l1;
        }
        return head.next;
    }

    /**
     * 递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoListsV1(ListNode l1, ListNode l2) {
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
