package com.wormchaos.lc;

import com.wormchaos.lc.sliding_window.normal.*;
import com.wormchaos.lc.sliding_window.easy.*;
import com.wormchaos.lc.sliding_window.hard.*;
import com.wormchaos.lc.toolbean.ListNode;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.*;

/**
 * Created by wormchaos on 2019-12-16.
 */
public class Test {

    public static void main(String... args) {
        Object object;
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
//        ListNode l = createListNode("1->2");
//        ListNode result = new Solution19().removeNthFromEnd(l, 2);
//        print(result);
//        Object result = new Solution20().isValid("{[]}");
//        System.out.print(result);
        //    ListNode l1 = createListNode("3->4->5");
        //    ListNode l2 = createListNode("4->5");
        //    ListNode result = new Solution21().mergeTwoLists(l1, l2);
        //    print(result);
        // Object result = new Solution22().generateParenthesis(3);
        // System.out.print(result);
        // ListNode l1 = createListNode("1->4->5");
        // ListNode l2 = createListNode("1->3->4");
        // ListNode l3 = createListNode("2->6");
        // ListNode[] lists = new ListNode[3];
        // lists[0] = l1;
        // lists[1] = l2;
        // lists[2] = l3;
        // ListNode result = new Solution23().mergeKLists(lists);
        // ListNode[] lists = new ListNode[1];
        // ListNode l2 = null;
        // lists[0] = l2;
        // ListNode result = new Solution23().mergeKLists(lists);
        // ListNode l1 = createListNode("-10,-9,-9,-3,-1,-1,0");
        // ListNode l2 = createListNode("-5");
        // ListNode l3 = createListNode("4");
        // ListNode l4 = createListNode("-8");
        // ListNode l5 = null;
        // ListNode l6 = createListNode("-9,-6,-5,-4,-2,2,3");
        // ListNode l7 = createListNode("-3,-3,-2,-1,0");
        // ListNode[] lists = new ListNode[7];
        // lists[0] = l1;
        // lists[1] = l2;
        // lists[2] = l3;
        // lists[3] = l4;
        // lists[4] = l5;
        // lists[5] = l6;
        // lists[6] = l7;
        // ListNode result = new Solution23().mergeKLists(lists);
        // ListNode l1 = createListNode("1->2->3->4");
        // ListNode result = new Solution24().swapPairs(l1);
        // ListNode l1 = createListNode("1->2->3->4->5");
        // ListNode result = new Solution25().reverseKGroup(l1, 4);
        // print(result);
//        Object result = new Solution27().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
//        Object result = new Solution30().findSubstring("barfoothefoobarman", new String[]{"foo","bar"});
//        Object result = new Solution30().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"});
        // Object result = new Solution30().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"});
        // Object result = new Solution38().countAndSay(5);
//        Object result = new Solution53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
//        Object result = new Solution704().search(new int[]{-1,0,3,5,9,12}, 9);
//        Object result = new Solution704().search(new int[]{}, 9);
//        int[] result = new Solution34().searchRange(new int[]{2,2,2,2,2}, 2);
//        int[] result = new Solution34().searchRange(new int[]{5,7,7,8,8,10}, 6);
//        int[] result = new Solution34().searchRange(new int[]{5,7,7,8,8,10}, 8);
//        System.out.print(result[0] + "_" + result[1]);
//        char arr[][] = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
//        char arr[][] = {{'.','.','.','.','.','.','.','.','2'},{'.','.','.','.','.','.','6','.','.'},{'.','.','1','4','.','.','8','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','3','.','.','.','.'},{'5','.','8','6','.','.','.','.','.'},{'.','9','.','.','.','.','4','.','.'},{'.','.','.','.','5','.','.','.','.'}};
////        boolean result = new Solution36().isValidSudoku(arr);
//        new Solution37().solveSudoku(arr);

//        Object result = new Solution28().strStr("acabcadabcababc", "ababc");
//        Object result = new Solution28().strStr("aaaaa", "bbaa");
//        Object result = new Solution28().strStr("mississippi", "issi");
//        TreeNode treeNode = converFromArray(new Integer[]{1, 2, 2, 3, 4, 4, 3});
//        TreeNode treeNode = converFromArray(new Integer[]{2,3,3,4,5,null,4});
////        TreeNode treeNode = converFromArray(new Integer[]{1, 2, 2, null, 3, null, 3});
//        Object result = new Solution101().isSymmetric(treeNode);
//        List<List<Integer>> result = new Solution46().permute(new int[]{1,2,3});
        // List<List<Integer>> result = new Solution46().permute(new int[]{});
        // print(result);
//        CalTest.calcRule(50, 4, 1);
//        Object result = new Solution39().combinationSum(new int[]{2,3,6,7}, 7);
//        Object result = new Solution40().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
//        Object result = new Solution40().combinationSum2(new int[]{1,1,2,5,6,7,10}, 8);
//        Object result = new Solution40().combinationSum2(new int[]{1, 2, 2, 2, 5}, 5);
//        Object result = new Solution47().permuteUnique(new int[]{1,1,1,2,2});
//        Object result = new Solution77().combine(4, 2);
//        Object result = new Solution78().subsets(new int[]{1,2});
        Object result = new Solution78().subsets(new int[]{});
        print(result);
    }

    private static TreeNode converFromArray(Integer[] a) {
        TreeNode treeNode = new TreeNode(a[0]);
        int deep = 0;
        int temp = a.length + 1;
        // // 计算深度
        // while (temp == 1) {
        // temp /= 2;
        // deep++;
        // }
        // int start = 0;
        // List<TreeNode> list = new ArrayList<>();
        // list.add(treeNode);
        // while(start < a.length) {
        // list = createTree(list, a, start);
        // start = 2 * start + 1;
        // }
        // createTree(list, a, start);
        return createTree(a, 0);

        // treeNode;
    }

    private static List<TreeNode> createTree(List<TreeNode> list, Integer[] nums, int start) {
        if (start == nums.length) {
            return null;
        }
        List<TreeNode> result = new ArrayList<>();
        int i = 0;
        for (TreeNode node : list) {
            int left = 2 * (start + i) + 1;
            if (null != nums[left]) {
                node.left = new TreeNode(nums[left]);
                result.add(node.left);
            }
            int right = left + 1;

            if (null != nums[right]) {
                node.right = new TreeNode(nums[right]);
                result.add(node.right);
            }
            start++;
        }
        return result;

    }

    private static TreeNode createTree(Integer[] nums, int k) {
        if (k >= nums.length || nums[k] == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(nums[k]);
        if (treeNode != null) {
            treeNode.left = createTree(nums, 2 * k + 1);
            treeNode.right = createTree(nums, 2 * k + 2);
        }
        return treeNode;

    }

    private static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void print(Object object) {
        System.out.println(object);
    }

    private static void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }
        System.out.println();
    }

    private static ListNode createListNode(String s) {
        // String[] t = s.trim().split("->");
        String[] t;
        if (s.contains(",")) {
            t = s.trim().split(",");
        } else {
            t = s.trim().split("->");
        }
        ListNode listNode = new ListNode(Integer.parseInt(t[0]));
        ListNode result = listNode;
        for (int i = 1; i < t.length; i++) {
            listNode.next = new ListNode(Integer.parseInt(t[i]));
            listNode = listNode.next;
        }
        return result;
    }
}
