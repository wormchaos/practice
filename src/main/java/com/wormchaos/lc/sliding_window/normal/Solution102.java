package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.toolbean.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-12.
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        if(!level.containsKey(n)) {
            level.put(n, new ArrayList<Integer>());
        }
        level.get(n).add(root.val);
        loop(root.left, n + 1, level);
        loop(root.right, n + 1, level);
    }
}
