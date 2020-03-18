package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution1108 {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (char c : address.toCharArray()) {
            if(c == '.') {
                sb.append("[.]");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
