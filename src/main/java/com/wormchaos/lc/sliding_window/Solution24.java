package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import jdk.nashorn.internal.ir.ForNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21.
 * 链表对调位置
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
        if(null == head) {
            return null;
        }
        ListNode zero = new ListNode(-1);
        zero.next = head;
        ListNode pre = zero;
        while(pre.next != null && pre.next.next != null) {
            // l2备份
            ListNode temp = pre.next.next;
            pre.next.next = pre.next.next.next;
            temp.next = pre.next;
            pre.next = temp;
            pre = pre.next.next;
        }


        return zero.next;
    }

}