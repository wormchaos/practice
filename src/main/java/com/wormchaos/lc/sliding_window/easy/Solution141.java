package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-6.
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(null == head) {
            return false;
        }
        Map<Integer, List<ListNode>> map = new HashMap<>();
        while (head.next != null) {
            if(map.containsKey(head.next.val)) {
                List<ListNode> temp = map.get(head.next.val);
                for (ListNode listNode : temp) {
                    if(listNode == head.next) {
                        return true;
                    }
                }
            }
            if(map.containsKey(head.val)) {
                map.get(head.val).add(head);
            } else {
                List<ListNode> l = new ArrayList<ListNode>();
                l.add(head);
                map.put(head.val, l);
            }
            head = head.next;
        }
        return false;

    }
}
