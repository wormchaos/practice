package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2020-1-20.
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // dfs 遍历
        return walk(p, q);
    }

    private boolean walk(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return walk(p.left, q.left) && walk(p.right, q.right);
    }
}
