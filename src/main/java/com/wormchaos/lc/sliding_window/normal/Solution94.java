package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.test.Tree;
import com.wormchaos.lc.toolbean.ListNode;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-12.
 */
public class Solution94 {

//    [4,2,5,1,6,3,7]

    /**
     * 迭代
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (null != cur || !stack.isEmpty()) {
            while(null != cur) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal_dfs(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result) {
        if (null != root) {
            dfs(root.left, result);
            result.add(root.val);
            dfs(root.right, result);
        }
    }
}
