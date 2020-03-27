package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.test.Tree;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-27.
 */
public class Solution95 {

    private int index = 0;
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();
        if(n == 0) {
            return result;
        }
        if(n == 1) {
            add(++index, null, null, result);
            return result;
        }
        int t = index;
        for (int i = 0; i < n; i++) {
            List<TreeNode> left = generateTrees(i);
            List<TreeNode> right = generateTrees(n - i - 1);
            if (left.size() == 0) {
                for (TreeNode r : right) {
                    add(++index, null, r, result);
                }
            } else if (right.size() == 0) {
                for (TreeNode l : left) {
                    add(++index, l, null, result);
                }
            } else {
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        add(++index, l, r, result);
                    }
                }
            }

        }
        index = t;
        return result;
    }

    private void add(int index, TreeNode l, TreeNode r, List<TreeNode> list) {
        TreeNode t = new TreeNode(index);
        t.left = l;
        t.right = r;
        list.add(t);
    }


}
