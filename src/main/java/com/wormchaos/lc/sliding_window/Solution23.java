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
        int k = 1;
        while (k <= lists.length) {
            for(int i=0; i < lists.length; i+= 2 * k) {
                if(i + k < lists.length ) {
                    System.out.print("calc" + i + "_" + (i+k));
                    lists[i] = mergeTwoLists(lists[i], lists[i+k]);
                }
            }
            k *=2;
        }
        return lists[0];

    }

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
     * 逐次查询没有效率
     * @param lists
     * @return
     */
    public ListNode mergeKListsV1(ListNode[] lists) {
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