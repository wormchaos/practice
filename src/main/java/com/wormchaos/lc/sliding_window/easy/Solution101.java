package com.wormchaos.lc.sliding_window.easy;

import com.wormchaos.lc.toolbean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wormchaos on 2019-12-31.
 */
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
//        // 递归
//        return isMirror(root, root);
        // 迭代
        //除了递归的方法外，我们也可以利用队列进行迭代。队列中每两个连续的结点应该是相等的，
        // 而且它们的子树互为镜像。最初，队列中包含的是 root 以及 root。该算法的工作原理类似于 BFS，
        // 但存在一些关键差异。每次提取两个结点并比较它们的值。
        // 然后，将两个结点的左右子结点按相反的顺序插入队列中。当队列为空时，或者我们检测到树不对称（即从队列中取出两个不相等的连续结点）时，该算法结束。

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(null == t1 && null == t2) {
                continue;
            }
            if(null == t1 || null == t2 || t1.val != t2.val) {
                return false;
            }
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }

//    public boolean isSymmetric(TreeNode root) {
//        if(null == root) {
//            return false;
//        }
//        return isSymmetric(root.left, root.right);
//    }
//
//    public boolean isSymmetric(TreeNode t1, TreeNode t2) {
//        if ((null == t1 && null != t2) || (null != t1 && null == t2)) {
//            return false;
//        }
//        if(t1 == null && t2 == null) {
//            return true;
//        }
//        boolean b1 = isSymmetric(t1.left, t2.right);
//        boolean b2 = isSymmetric(t1.left, t2.right);
//        return b1 && b2 && t1.val == t2.val;
//    }


}
