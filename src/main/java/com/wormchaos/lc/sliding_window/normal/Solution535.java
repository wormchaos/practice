package com.wormchaos.lc.sliding_window.normal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-19.
 */
public class Solution535 {
    public class Codec {

        private Map<String, String> map = new HashMap<>();
        private String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private String url = "http://tinyurl.com/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String key = createRandomKey(16);
            map.put(key, longUrl);
            return url + key;
        }

        private String createRandomKey(int n) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sb.append(s.charAt((int) (Math.random() * 52)));
            }
            return sb.toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl.replace(url, ""));
        }
    }
}
