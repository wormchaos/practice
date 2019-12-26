package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2019-12-26.
 * 最大深度
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
