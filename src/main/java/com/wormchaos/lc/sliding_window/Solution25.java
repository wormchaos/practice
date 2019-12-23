package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import jdk.nashorn.internal.ir.ForNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21. k个链表对调位置
 */
public class Solution25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (null == head) {
            return null;
        }

        return deal(head, k);

    }

    private ListNode deal(ListNode list, int k) {
        ListNode cur = list;
        ListNode pre = list;
        // 判断临界
        for (int i = 0; i < k; i++) {
            if (list == null) {
                return pre;
            }
            list = list.next;
        }
        ListNode p = cur.next;

        cur.next =null;
        ListNode temp;
        // 逐个变化
        for (int i = 0; i < k - 1; i++) {
            temp = p;
            p = p.next;
            temp.next = cur;
            cur = temp;
        }
        pre.next = deal(p, k);
        return cur;
    }

}