package com.wormchaos.lc.sliding_window.normal;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2019-12-29. 前序遍历
 */
public class Solution144 {

    /**
     * 迭代
     * 
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        // 根节点
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            result.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return result;
    }

    /**
     * 递归遍历
     * 
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalV1(TreeNode root) {
        List<Integer> list = new LinkedList();
        process(root, list);
        return list;
    }

    private void process(TreeNode root, List list) {
        if (null != root) {
            list.add(root.val);
            process(root.left, list);
            process(root.right, list);
        }
    }

}
