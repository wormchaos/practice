package com.wormchaos.lc.sliding_window.mensetsu;

import com.wormchaos.lc.toolbean.ListNode;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Solution04_03 {
    public ListNode[] listOfDepth(TreeNode tree) {
        int deep = 0;
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            list.add(new ArrayList<Integer>());
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                list.get(deep).add(treeNode.val);
                if (null != treeNode.left) {
                    queue.add(treeNode.left);
                }
                if (null != treeNode.right) {
                    queue.add(treeNode.right);
                }
            }
            deep++;
        }
        ListNode[] result = new ListNode[deep];
        for (int i = 0; i < deep; i++) {
            List<Integer> l = list.get(i);
            ListNode head = new ListNode(-1);
            ListNode record = head;
            ListNode temp;
            for (int j = 0; j < l.size(); j++) {
                temp = new ListNode(l.get(j));
                record.next = temp;
                record = record.next;
            }
            result[i] = head.next;
        }
        return result;
    }
}
