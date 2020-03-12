package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.ListNode;

/**
 * Created by wormchaos on 2020-3-12.
 */
public class Solution234 {
    private ListNode p1;

    public boolean isPalindrome(ListNode head) {
        p1 = head;
        return isLoop(head);
    }

    private boolean isLoop(ListNode head) {
        if(null != head) {
            if(!isLoop(head.next)) {
                return false;
            }
            if(p1.val != head.val) {
                return false;
            }
            p1 = p1.next;
        }
        return true;
    }

}
