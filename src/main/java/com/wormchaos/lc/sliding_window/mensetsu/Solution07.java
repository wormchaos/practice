package com.wormchaos.lc.sliding_window.mensetsu;

import com.wormchaos.lc.toolbean.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-26.
 */
public class Solution07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return getNodeList(preorder, 0, 0, inorder.length - 1, map);
    }

    private TreeNode getNodeList(int[] preprder, int current, int inFrom, int inTo, Map<Integer, Integer> map) {
        if (inFrom > inTo) {
            return null;
        }
        TreeNode root = new TreeNode(preprder[current]);
        int index = map.get(preprder[current]);
        root.left = getNodeList(preprder, current + 1, inFrom, index - 1, map);
        // 根节点索引 + 1 但是还要加上左子树长度
        root.right = getNodeList(preprder, current + 1 + index - inFrom, index + 1, inTo, map);
        return root;
    }

}
