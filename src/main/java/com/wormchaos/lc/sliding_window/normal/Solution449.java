package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.test.Tree;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-4-16.
 */
public class Solution449 {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuffer sb = new StringBuffer();
            if (null == root) {
                return "";
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                TreeNode t = stack.pop();
                sb.append(t.val).append(",");
                if (null != t.right) {
                    stack.add(t.right);
                }
                if (null != t.left) {
                    stack.add(t.left);
                }

            }
            System.out.print(sb.substring(0, sb.length() - 1).toString());
            return sb.substring(0, sb.length() - 1).toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (null == data || "".equals(data)) {
                return null;
            }
            String[] obj = data.split(",");
            int[] arr = new int[obj.length];
            for (int i = 0; i < obj.length; i++) {
                arr[i] = Integer.parseInt(obj[i]);
            }
            return compass(arr,0, arr.length-1);
        }

        private TreeNode compass(int[] a, int l, int r) {
            if (l > r) {
                return null;
            }
            // 根节点肯定是头
            TreeNode root = new TreeNode(a[l]);
            if (l < r) {
                int k = r + 1;
                for (int i = l + 1; i <= r; i++) {
                    if (a[i] > a[l]) {
                        k = i;
                        break;
                    }
                }
                root.left = compass(a, l+1, k -1);
                root.right = compass(a, k, r);
            }
            return root;
        }

    }
}
