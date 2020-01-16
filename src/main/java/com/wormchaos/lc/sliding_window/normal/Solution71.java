package com.wormchaos.lc.sliding_window.normal;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-16.
 */
public class Solution71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int l = 0;
        while (l < path.length()) {
            if (path.charAt(l) == '/') {
                l++;
            } else if (path.charAt(l) == '.') {
                if (l + 1 < path.length() && path.charAt(l + 1) == '.') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    l += 3;
                } else {
                    l++;
                }
            } else {
                int r = l;
                while(r < path.length() && path.charAt(r) != '/' && path.charAt(r) != '.') {
                    r++;
                }
                stack.push(path.substring(l, r));
                l = r;
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }
        if(result == "") {
            result = "/";
        }
        return result;
    }
}
