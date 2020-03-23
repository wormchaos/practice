package com.wormchaos.lc.sliding_window.sars;

import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2020-3-10.
 */
public class Solution543 {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calc(root);
        return max;
    }

    private int calc(TreeNode node) {
        if (null == node) {
            return 0;
        }
        if (null == node.left && null == node.right) {
            return 1;
        }
        int l = calc(node.left);
        int r = calc(node.right);
        if (max < l + r ) {
            max = l + r;
        }
        return Math.max(l, r) + 1;
    }
}
