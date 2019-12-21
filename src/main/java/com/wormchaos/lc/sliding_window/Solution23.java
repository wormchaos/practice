package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21.
 * 合并多个指针
 */
public class Solution26 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        int count = 0;
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
                    if(head.next == null) {
                        count++;
                    }
                }
            }
            lists[temp] = lists[temp].next;
        }
        return head.next;
    }

}