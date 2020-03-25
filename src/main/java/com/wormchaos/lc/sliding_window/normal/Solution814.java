package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2020-3-25.
 */
public class Solution814 {

    /**
     * 去掉0节点
     *
     * @param root
     * @return
     */
    public TreeNode pruneTree(TreeNode root) {
        cancel(root);
        return root;
    }

    /**
     * @param root
     * @return 全是0的节点
     */
    private boolean cancel(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean f1 = cancel(root.left);
        if(f1) {
            root.left = null;
        }
        boolean f2 = cancel(root.right);
        if(f2) {
            root.right = null;
        }
        return f1 && f2 && root.val == 0;
    }
}
