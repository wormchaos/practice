package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import jdk.nashorn.internal.ir.ForNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21.
 * 合并多个指针
 */
public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode record = head;
        int count = 0;
        for(ListNode n : lists) {
            if(n == null) {
                count++;
            }
        }
        while(count < lists.length) {
            int i;
            int min = Integer.MAX_VALUE;
            int temp = 0;
            for(i=0; i< lists.length;i++) {
                ListNode n = lists[i];
                if(null != n && n.val < min) {
                    min = n.val;
                    temp = i;
                    head.next = n;
                }
            }
            head = head.next;
            lists[temp] = lists[temp].next;
            if(lists[temp] == null) {
                count++;
            }
        }
        return record.next;
    }

}