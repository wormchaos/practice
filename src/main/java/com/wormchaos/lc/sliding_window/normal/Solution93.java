package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-15.
 * 复原ip地址
 */
public class Solution93 {

    private List<String> result = new ArrayList<>();

    /**
     * 回溯
     *
     * @param s
     * @return
     */
    public List<String> restoreIpAddresses(String s) {
        List<String> temp = new ArrayList<>();
        calc(s, 0, temp);
        return result;
    }

    private void calc(String s, int current, List<String> ips) {
        if (current == s.length()) {
            if(ips.size() == 4) {
                StringBuffer sb = new StringBuffer();
                for (String ip : ips) {
                    sb.append(ip).append(".");
                }
                result.add(sb.substring(0, sb.length() - 1).toString());
            }

        } else {
            if(ips.size() < 4) {
                if(s.charAt(current) == '0') {
                    ips.add(s.substring(current, current + 1));
                    calc(s, current + 1, ips);
                    ips.remove(ips.size() - 1);
                } else {
                    for (int i = 1; i <= 3; i++) {
                        if (isValid(s, current, i)) {
                            ips.add(s.substring(current, current + i));
                            calc(s, current + i, ips);
                            ips.remove(ips.size() - 1);
                        }
                    }
                }

            }
        }
    }

    private boolean isValid(String s, int current, int len) {
        if(current + len > s.length()) {
            return false;
        }
        String t = s.substring(current, current + len);
        return Integer.valueOf(t) <= 255;
    }
}
