package com.wormchaos.lc.sliding_window.easy;


import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2019-12-26.
 * 平衡二叉树
 */
public class Solution110 {

    /**
     * 等价于找叶节点深度 左右
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        if (left == -1) {
            return -1;
        }
        int right = depth(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

}
