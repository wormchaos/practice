package com.wormchaos.lc;

import com.wormchaos.lc.sliding_window.*;
import com.wormchaos.lc.toolbean.ListNode;

/**
 * Created by wormchaos on 2019-12-16.
 */
public class Test {

    public static void main(String... args) {
//        Object result = new Solution76().minWindow("bba", "ab");
//        Object result = new Solution76().minWindow("aa", "aa");
//        Object result = new Solution76().minWindow("ADOBECODEBANC", "ABC");
//        Object result = new Solution4().findMedianSortedArrays(new int[]{1,3}, new int[]{2});
//        Object result = new Solution4().findMedianSortedArrays(new int[]{1,4}, new int[]{2,3,5,6});
//        Object result = new Solution4().findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
//        Object result = new Solution4().findMedianSortedArrays(new int[]{1,3,4,9}, new int[]{1,2,3,4,5,6,7,8,9,10});
//        String s ="eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
//        Object result = new Solution5().longestPalindrome("abccbaaadd");
//        Object result = new Solution5().longestPalindrome(s);
//        Object result = new Solution6().convert("LEETCODEISHIRING", 3);
//        Object result = new Solution6().convert("PAYPALISHIRING", 3);
//        Object result = new Solution6().convert("AB", 1);
//        Object result = new Solution7().reverse(1534236469);
//        Object result = new Solution8().myAtoi(String.valueOf(Integer.MIN_VALUE));
//        Object result = new Solution8().myAtoi("2147483646");
//        Object result = new Solution9().isPalindrome(13222310);
//        Object result = new Solution12().intToRoman(3);
//        Object result = new Solution12().intToRoman(4);
//        Object result = new Solution12().intToRoman(9);
//        Object result = new Solution12().intToRoman(58);
//        Object result = new Solution12().intToRoman(1994);
//        Object result = new Solution12().intToRoman(191);
//        Object result = new Solution12().intToRoman(200);
//        Object result = new Solution13().romanToInt("LVIII");
//        Object result = new Solution14().longestCommonPrefix(new String[]{"flower","flow","flight"});
//        Object result = new Solution15().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        Object result = new Solution15().threeSum(new int[]{3,0,-2,-1,1,2});
//        Object result = new Solution15().threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
//        Object result = new Solution15().threeSum(new int[]{0,0,0});
//        Object result = new Solution16().threeSumClosest(new int[]{-1,2,1,-4}, 1);
//        Object result = new Solution16().threeSumClosest(new int[]{0,1,2}, 1);
//        Object result = new Solution17().letterCombinations("2");
//        Object result = new Solution18().fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
//        Object result = new Solution18().fourSum(new int[]{-1,-5,-5,-3,2,5,0,4}, -7);
//        ListNode l = createListNode("1->2->3->4->5");
//        ListNode result = new Solution19().removeNthFromEnd(l, 2);
        ListNode l = createListNode("1->2");
        ListNode result = new Solution19().removeNthFromEnd(l, 2);
        print(result);
//        System.out.print(result);
    }

    private static void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }
        System.out.println();
    }

    private static ListNode createListNode(String s) {
        String[] t = s.trim().split("->");
        ListNode listNode = new ListNode(Integer.parseInt(t[0]));
        ListNode result = listNode;
        for (int i=1; i <t.length; i++) {
            listNode.next = new ListNode(Integer.parseInt(t[i]));
            listNode = listNode.next;
        }
        return result;
    }
}
