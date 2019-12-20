package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

/**
 * Created by wormchaos on 2019-12-20.
 */
public class Solution19 {


    /**
     * 双指针
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode node1 = node;
        ListNode node2 = node;
        for (int i=0; i < n + 1; i++) {
            node1 = node1.next;
        }
        while(node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node2.next = node2.next.next;

        return node.next;
    }


    /**
     * 两次遍历 哑结点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndV2(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode first = head;
        int m = 0;
        while(first != null) {
            m++;
            first = first.next;
        }
        m -= n;
        first = node;
        while (m > 0) {
            m--;
            first = first.next;
        }
        first.next = first.next.next;
        return node.next;

    }

    /**
     * 两次遍历法
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndV1(ListNode head, int n) {
        if(null == head) {
            return head;
        }
        if(null == head.next) {
            if(n == 1) {
                return null;
            } else {
                return head;
            }
        }
        // 先找长度
        int m =1;
        ListNode t = head;
        while(head.next != null) {
            m++;
            head = head.next;
        }
        head = t;
        if(m  == n) {
            t = head.next;
        } else {
            while(head.next != null) {
                m--;
                if (m == n) {
                    head.next = head.next.next;
                    break;
                }
                head = head.next;
            }
        }
        return t;
    }
}
