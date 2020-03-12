package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.toolbean.ListNode;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-3-12.
 */
public class Solution102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if(null == root) {
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for (int i =0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(null != node.left) {
                    queue.add(node.left);
                }
                if(null != node.right) {
                    queue.add(node.right);
                }
            }
            levels.add(temp);
        }

        return levels;
    }


    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

        // fulfil the current level
        levels.get(level).add(node.val);

        // process child nodes for the next level
        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderVloop(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }

    /**
     * 垃圾写法
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderdOOL(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> level = new HashMap<>();
        loop(root, 0, level);
        int i = 0;
        while (null != level.get(i)) {
            result.add(level.get(i));
            i++;
        }
        return result;
    }

    private void loop(TreeNode root, int n, Map<Integer, List<Integer>> level) {
        if (null == root) {
            return;
        }
        if (!level.containsKey(n)) {
            level.put(n, new ArrayList<Integer>());
        }
        level.get(n).add(root.val);
        loop(root.left, n + 1, level);
        loop(root.right, n + 1, level);
    }
}
