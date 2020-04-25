package com.wormchaos.lc.sliding_window.sars;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Raytine on 2020/3/28.
 */
public class Solution820 {
    public int minimumLengthEncoding(String[] words) {
        int sum = 0;
        Set<Integer>[][] set = new HashSet[26][7];
        Map<String, Boolean> same = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            boolean isChild = false;
            //检查能否被覆盖
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].length() <= words[j].length()) {
                    boolean hasNoSame = false;
                    for (int k = 0; k < words[i].length(); k++) {
                        if(words[i].charAt(words[i].length() - k - 1) != words[j].charAt(words[j].length() - k -1)) {
                            hasNoSame = true;
                            break;
                        }
                    }
                    if (!hasNoSame) {
                        if(!same.containsKey(words[i]) && words[i].length() == words[j].length()) {
                            same.put(words[i], true);
                        }
                        isChild = true;
                        break;
                    }
                }
            }
            if (!isChild) {
                sum+=words[i].length() + 1;
            }
        }
        for (Map.Entry<String, Boolean> entry : same.entrySet()) {
            sum += entry.getKey().length() + 1;
        }
        return sum;

    }
}
