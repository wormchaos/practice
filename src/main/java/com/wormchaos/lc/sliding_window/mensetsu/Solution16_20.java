package com.wormchaos.lc.sliding_window.mensetsu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wormchaos on 2020-3-26.
 */
public class Solution16_20 {
    public List<String> getValidT9Words(String num, String[] words) {
        List<String> result = new ArrayList<>();
        Set<Character>[] set = new HashSet[10];
        set[0] = new HashSet() {{
            add('_');
        }};
        set[1] = new HashSet() {{
            add('!');
            add('@');
            add('#');
        }};
        set[2] = new HashSet() {{
            add('a');
            add('b');
            add('c');
        }};
        set[3] = new HashSet() {{
            add('d');
            add('e');
            add('f');
        }};
        set[4] = new HashSet() {{
            add('g');
            add('h');
            add('i');
        }};
        set[5] = new HashSet() {{
            add('j');
            add('k');
            add('l');
        }};
        set[6] = new HashSet() {{
            add('m');
            add('n');
            add('o');
        }};
        set[7] = new HashSet() {{
            add('p');
            add('q');
            add('r');
            add('s');
        }};
        set[8] = new HashSet() {{
            add('t');
            add('u');
            add('v');
        }};
        set[9] = new HashSet() {{
            add('w');
            add('x');
            add('y');
            add('z');
        }};
        for (int i = 0; i < words.length; i++) {
            boolean f = true;
            for(int j = 0; j< words[i].length(); j++) {
                if (!set[num.charAt(j) - '0'].contains(words[i].charAt(j))){
                    f = false;
                    break;
                }
            }
            if (f) {
                result.add(words[i]);
            }
        }
        return result;
    }
}
