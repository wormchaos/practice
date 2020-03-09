package com.wormchaos.lc.sliding_window.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-14.
 */
public class Solution68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        if(maxWidth == 0) {
            return result;
        }
        int l = 0;
        int r = 0;
        while (r < words.length) {
            int sum = 0;
            r = l;
            while (r < words.length && sum - 1 <= maxWidth) {
                sum += words[r].length() + 1;
                r++;
            }
            if (r == words.length && sum - 1 <= maxWidth) {
                StringBuffer sb = new StringBuffer();
                for (int i = l; i < r; i++) {
                    sb.append(words[i]).append(" ");
                }
                sb.delete(sb.length()-1, sb.length());
                int len = maxWidth - sb.length();
                for (int i = 0; i < len; i++) {
                    sb.append(" ");
                }
                result.add(sb.toString());
                break;
            }

            // r为这一行最右边元素的下标, sum为 r-l个字串 + r-l-1个空格所占用的数量
            r--;
            sum -= words[r].length() + 1;
            r--;
            // 除去字串之外的空格数
            int blank = maxWidth - sum + (r - l + 1);
            StringBuffer sb = new StringBuffer();
            for (int i = l; i < r; i++) {
                int minCut = blank / (r - i);
                if (blank % (r - i) > 0) {
                    minCut++;
                }
                sb.append(words[i]);
                for (int j = 0; j < minCut; j++) {
                    sb.append(" ");
                }
                blank -= minCut;
            }
            sb.append(words[r]);
            if(sb.length() < maxWidth) {
                int len = maxWidth - sb.length();
                for (int i =0; i <len;i++) {
                    sb.append(" ");
                }
            }
            result.add(sb.toString());
            l = r + 1;

        }
        return result;
    }
}
