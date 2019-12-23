package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import jdk.nashorn.internal.ir.ForNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21.
 * k个链表对调位置
 */
public class Solution25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(null == head) {
            return null;
        }
        ListNode zero = new ListNode(-1);
        zero.next = head;
        // for(int i )
        deal(head, k);
        return zero;
        
    }

    private ListNode deal(ListNode head, int k) {
        // l1
        ListNode h1 = head;
        ListNode h2;
        for(int i=0;i<k -1;i++) {
            if(null == head) {
                return head;
            }
            head = head.next;
        }
        h2 = head;
        head = head.next;
        h1.next = head;
        head.next = h1.next;
        h2.next = h1;
        return h1;
    }

}