package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-3-3.
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l <= r) {
            char lc = s.charAt(l);
            if(lc >= 'A' && lc <= 'Z') {
                lc = (char) (lc + 32);
            }
            if((lc < '0' || lc > '9') && (lc < 'a' || lc > 'z')) {
                l++;
                continue;
            }
            char rc = s.charAt(r);
            if(rc >= 'A' && rc <= 'Z') {
                rc = (char) (rc + 32);
            }
            if((rc < '0' || rc > '9') && (rc < 'a' || rc > 'z')) {
                r--;
                continue;
            }
            if(lc != rc) {
                return false;
            } else {
                l++;
                r--;
            }

        }
        return true;
    }

}
