package com.wormchaos.lc;

import com.wormchaos.lc.sars.*;
import com.wormchaos.lc.sliding_window.hard.*;
import com.wormchaos.lc.sliding_window.mensetsu.Solution40;
import com.wormchaos.lc.sliding_window.normal.*;
import com.wormchaos.lc.sliding_window.easy.*;
import com.wormchaos.lc.sliding_window.mensetsu.*;
import com.wormchaos.lc.toolbean.ListNode;
import com.wormchaos.lc.toolbean.TreeNode;

import java.util.*;

/**
 * Created by wormchaos on 2019-12-16.
 */
public class RunMethod {

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
////        char arr[][] = {{'.','.','.','.','.','.','.','.','2'},{'.','.','.','.','.','.','6','.','.'},{'.','.','1','4','.','.','8','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','3','.','.','.','.'},{'5','.','8','6','.','.','.','.','.'},{'.','9','.','.','.','.','4','.','.'},{'.','.','.','.','5','.','.','.','.'}};
//////        boolean result = new Solution36().isValidSudoku(arr);
//        new Solution37().solveSudoku(arr);
//        print(arr);
//        Object result = new Solution51().solveNQueens(0);
//        Object result = new Solution52().totalNQueens(4);
//        Object result = new Solution32().longestValidParentheses(")(((((()())()()))()(()))(");
//        Object result = new Solution118().generate(1);
//        print(result);

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
//        Object result = new Solution78().subsets(new int[]{});
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        new Solution48().rotate(arr);
//        print(arr);
//        Object result = new Solution62().uniquePaths(2, 3);
//        Object result = new Solution739().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
//        int[] result = new Solution496().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
//        int[] result = new Solution503().nextGreaterElements(new int[]{100,1,11,1,120,111,123,1,-1,-100});
//        int arr[][] = {{1,0,7,0,0,0},{2,0,6,0,1,0},{3,5,6,7,4,2},{4,3,1,0,2,0},{3,0,5,0,20,0}};
//        Object result = new Solution1219().getMaximumGold(arr);
//        Object result = new Solution264().nthUglyNumber(10);
//        Object result = new Solution322().coinChange(new int[]{186,419,83,408}, 6249);
//        Object result = new Solution322().coinChange(new int[]{2,4}, 5);
//        Object result = new Solution375().getMoneyAmount(100);
//        Object result = new Solution169().majorityElement(new int[]{6, 6, 6, 7, 7});
//        Object result = new Solution169().majorityElement(new int[]{2,2,1,1,1,2,2});
//        Object result = new Solution10().isMatch("aa", "a*");
//        Object result =  new Solution41().firstMissingPositive(new int[]{3,4,-1,1});
//        int arr[][] = {{1,0,7,0,0,0},{2,0,6,0,1,0},{3,5,6,7,4,2},{4,3,1,0,2,0},{3,0,5,0,20,0}};
//        List<Integer> result = new Solution54().spiralOrder(arr);
//        int result = new Solution42().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
//        int result = new Solution42().trap(new int[]{5,2,1,2,1,5});
//        Object result = new Solution44().isMatch("aaa", "*b");
//        int[][] result = new Solution56().merge(new int[][]{{15, 15},{1,3},{2,6},{8,10},{15,18}});
//        int[][] result = new Solution56().merge(new int[][]{{1,1}});
//        Object result = new Solution91().numDecodings("2022");
//        Object result = new Solution93().restoreIpAddresses("2550100");
//        Object result = new Solution68().fullJustify(new String[]{"ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"}, 16);
//        Object result = new Solution68().fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
//        Object result = new Solution68().fullJustify(new String[]{"This", "is", "an", "test", "of", "text"}, 6);
//        Object result = new Solution68().fullJustify(new String[]{"a"}, 1);
//        Object result = new Solution68().fullJustify(new String[]{""}, 0);
//        Object result = new Solution131().partition("a");
        long a = System.currentTimeMillis();
//        Object result = new Solution132().minCut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        Object result = new Solution132().minCut("abbac");
//        Object result = new Solution132().minCut("acbbc");
//        Object result = new Solution5().longestPalindrome("");
//        Object result = new Solution71().simplifyPath("/...");
//        Object result = new Solution79().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");
//        Object result = new Solution79().exist(new char[][]{{'A'},{'A'}}, "AAA");
//        int[] arr = new int[]{1,1,1,1,2,3,3,3,4,5,5,8,10,10,11};
//        int[] arr = new int[]{1};
//        Object result = new Solution80().removeDuplicates(arr);
//        Object result = new Solution32().longestValidParentheses("()(((()))");
//        Object result = new Solution32().longestValidParentheses(")())()(())");
//        Object result = new Solution32().longestValidParentheses("()(()(()");
//        Object result = new Solution32().longestValidParentheses(")()()()");
//        Object result = new Solution43().multiply("5", "12");
//        Object result = new Solution45().jump(new int[]{2,3,1,1,4});
//        Object result = new Solution45().jump(new int[]{2});
//        Object result = new Solution49().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
//        Object result = new Solution50().myPow(1.10000, -2147483648);
//        int[] arr = new int[]{1,2,3};
//        int[] arr = new int[]{1};
//        new Solution31().nextPermutation(arr);
//        boolean result = new Solution416().canPartition(new int[]{1, 5, 11, 5});
//        boolean result = new Solution416().canPartition(new int[]{2, 2, 3, 5});
//        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
//        new Solution88().merge(arr1, 0, new int[]{2, 5, 6}, 3);
//        Object result = new Solution33().search(new int[]{4,5,6,7,0,1,2}, 0);
//        int[][] result = new Solution59().generateMatrix(5);
//        Object result = new Solution60().getPermutation(5, 118);
//        ListNode l = createListNode("1->2->3->4->5");
//        ListNode l = createListNode("1->2");
//        ListNode result = new Solution61().rotateRight(l, 2);
//        ListNode result = new Solution83().deleteDuplicates( createListNode("1->1->1"));
//        ListNode result = new Solution82().deleteDuplicates( createListNode("1->1->1->2->3->3"));
//        ListNode result = new Solution82().deleteDuplicates( createListNode("1->1->1"));
//        ListNode result = new Solution82().deleteDuplicates( createListNode("1->2->3->3->4->4->5"));
//        Object result = new Solution84().largestRectangleArea(new int[]{2,1,5,6,2,3});
//        Object result = new Solution84().largestRectangleArea(new int[]{});
//        int[] A = new int[]{29959,29867,29822,29704,29676,29650,29577,29488,29286,29255,29232,29207,29071,29034,28925,28849,28731,28693,28624,28606,28591,28397,28357,28308,28295,28210,28119,28090,28004,27903,27845,27830,27777,27736,27640,27540,27506,27428,27341,27308,27182,27152,27122,27029,26928,26872,26796,26765,26663,26597,26580,26530,26498,26475,26436,26406,26382,26312,26213,26134,26088,26025,25943,25912,25875,25845,25810,25702,25638,25614,25531,25524,25488,25470,25444,25402,25283,25262,25121,24988,24958,24886,24769,24697,24635,24595,24490,24456,24453,24346,24313,24248,24200,24148,24107,24052,24044,24021,23970,23908,23897,23835,23752,23741,23714,23661,23596,23545,23509,23470,23439,23409,23350,23215,23166,23155,23100,23024,22923,22825,22793,22627,22613,22536,22450,22383,22312,22268,22205,22175,22136,22028,21971,21900,21824,21769,21726,21583,21546,21513,21494,21428,21327,21264,21254,21174,21140,21112,21000,20921,20902,20830,20817,20783,20735,20657,20616,20573,20485,20378,20363,20305,20259,20210,20114,20002,19846,19785,19747,19667,19645,19622,19610,19580,19542,19516,19454,19392,19310,19277,19194,19131,19090,19004,18883,18845,18791,18781,18668,18591,18518,18475,18368,18331,18310,18287,18217,18114,18092,18048,17990,17964,17912,17836,17740,17704,17630,17613,17573,17428,17356,17341,17300,17260,17180,17174,17126,17071,17041,16866,16850,16828,16672,16618,16577,16499,16407,16357,16318,16293,16202,16150,16075,16041,15948,15921,15844,15843,15785,15764,15668,15626,15579,15473,15387,15255,15190,15139,15062,14996,14954,14918,14907,14902,14867,14851,14817,14799,14751,14720,14536,14506,14474,14353,14303,14280,14185,14107,14012,13932,13858,13781,13585,13563,13533,13451,13412,13362,13249,13208,13181,13064,13037,12961,12926,12892,12786,12731,12611,12573,12506,12502,12496,12470,12443,12370,12262,12182,12153,12069,12000,11847,11806,11781,11708,11687,11593,11550,11445,11372,11329,11308,11291,11268,11241,11191,11027,10982,10879,10862,10776,10695,10603,10502,10464,10350,10338,10305,10273,10176,10124,10094,10038,9953,9935,9812,9786,9743,9728,9508,9472,9383,9349,9236,9215,9130,9124,9042,9008,8988,8901,8833,8809,8780,8716,8580,8462,8334,8321,8305,8280,8257,8246,8137,8077,8043,8016,7984,7955,7927,7906,7746,7663,7653,7572,7542,7530,7489,7420,7390,7361,7337,7245,7210,7188,7175,7096,6898,6846,6745,6675,6569,6478,6427,6363,6284,6260,6243,6206,6154,6135,6078,6061,6017,5995,5917,5863,5836,5793,5763,5743,5678,5572,5532,5459,5384,5341,5299,5251,5231,4995,4933,4861,4740,4672,4625,4496,4445,4361,4282,4215,4135,4097,4028,3917,3862,3711,3553,3498,3410,3388,3384,3288,3279,3244,3221,3181,3171,3150,3060,3035,2975,2965,2834,2760,2637,2584,2533,2440,2383,2311,2285,2255,2211,2192,2121,2054,2010,1964,1850,1724,1642,1577,1411,1409,1332,1296,1265,1256,1220,1195,937,903,880,811,739,720,650,609,547,533,459,434,384,279,231,163,102,78,30,5,52,100,155,217,277,328,389,446,473,546,583,649,702,734,768,857,882,912,1043,1219,1243,1258,1290,1325,1359,1409,1567,1642,1679,1726,1873,1965,2017,2088,2172,2204,2226,2273,2288,2316,2434,2522,2558,2622,2678,2790,2933,2965,3025,3037,3071,3167,3180,3194,3233,3269,3282,3383,3387,3401,3465,3528,3595,3801,3910,4020,4078,4128,4213,4271,4295,4420,4472,4612,4663,4739,4845,4891,4980,5109,5241,5284,5335,5379,5388,5478,5546,5639,5705,5751,5766,5803,5855,5879,5975,6000,6024,6070,6093,6137,6156,6212,6256,6276,6304,6421,6441,6537,6614,6743,6844,6893,7087,7169,7183,7200,7237,7262,7352,7376,7398,7441,7491,7541,7564,7602,7656,7707,7814,7924,7940,7958,8014,8036,8048,8132,8141,8250,8279,8288,8321,8331,8374,8515,8655,8723,8807,8825,8878,8953,8990,9011,9077,9128,9172,9219,9276,9383,9420,9499,9535,9736,9744,9801,9900,9951,10038,10093,10119,10147,10265,10301,10314,10340,10456,10499,10564,10622,10767,10802,10876,10882,10997,11063,11217,11243,11276,11299,11314,11365,11407,11456,11587,11627,11705,11751,11792,11831,11901,12012,12118,12180,12240,12296,12385,12469,12473,12497,12503,12537,12578,12723,12778,12858,12901,12936,13020,13048,13136,13195,13232,13325,13377,13424,13493,13547,13564,13724,13856,13911,13938,14075,14151,14234,14300,14353,14395,14499,14507,14705,14724,14796,14802,14823,14858,14882,14905,14914,14936,14962,15049,15114,15161,15237,15272,15399,15565,15587,15666,15749,15778,15830,15843,15864,15928,16039,16075,16141,16163,16246,16315,16333,16389,16415,16526,16601,16650,16798,16845,16861,16991,17046,17090,17140,17178,17186,17292,17305,17343,17419,17456,17610,17617,17693,17728,17783,17909,17918,17970,18032,18083,18104,18114,18223,18296,18330,18363,18428,18496,18578,18660,18733,18782,18792,18861,18929,19069,19127,19184,19269,19279,19355,19394,19494,19539,19559,19599,19612,19643,19666,19745,19760,19815,19864,20012,20141,20231,20270,20330,20370,20380,20500,20595,20617,20690,20751,20811,20824,20843,20910,20925,21044,21126,21165,21198,21260,21280,21343,21467,21505,21531,21564,21640,21755,21817,21885,21929,22010,22103,22159,22196,22229,22270,22368,22414,22515,22570,22615,22630,22806,22864,22951,23030,23107,23155,23191,23226,23399,23438,23464,23487,23524,23559,23634,23667,23719,23747,23764,23869,23901,23936,24012,24022,24045,24074,24141,24185,24204,24272,24327,24452,24455,24490,24560,24615,24641,24734,24815,24890,24963,25025,25242,25282,25283,25414,25446,25475,25489,25527,25586,25636,25640,25771,25844,25848,25883,25923,26005,26048,26106,26157,26312,26359,26395,26429,26465,26491,26513,26558,26584,26601,26667,26770,26864,26900,26996,27118,27129,27176,27272,27313,27389,27478,27517,27580,27700,27761,27811,27844,27848,27967,28051,28108,28176,28264,28302,28332,28380,28525,28591,28617,28681,28727,28744,28874,28994,29047,29123,29221,29239,29274,29347,29493,29596,29668,29694,29717,29847,29871};
//        Object result = new Solution907().sumSubarrayMins(A);
//        Object result =  new Solution137().singleNumber(new int[]{});
//        char[][] arr = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
//        Object result = new Solution200().numIslands(arr);
//        Object result = new Solution215().findKthLargest(new int[]{}, 0);
//        Object result = new Solution216().combinationSum3(3, 7);
//        Object result = new Solution219().containsNearbyDuplicate(new int[]{1,1,1,1}, 1);
//        Object result = new Solution125().isPalindrome("A man, a plan, a canal: Panama");
//        int arr[][] = {{2,1,1},{1,1,0},{0,1,1}};
        int arr[][] = {{2,2,2,1,1}};
//        int arr[][] = {{1},{2},{1},{2}};
//        [[2,1,1],[0,1,1],[1,0,1]]
//        Object result = new Solution994().orangesRotting(arr);
//        int[][] result = new Solution57_II().findContinuousSequence(15);
//        Object result =new Solution67().addBinary("1", "11");
//        Object result = new com.wormchaos.lc.sliding_window.normal.Solution137().singleNumber(new int[]{99,99,99,1});
//        Object result = new Solution33().search(new int[]{4,5,6,7,0,1,2}, 0);
//        Object result = new Solution33().search(new int[]{1,3 }, 3);
//        Object result = new Solution1013().canThreePartsEqualSum(new int[]{10,-10,10,-10,10,-10,10,-10});
//        Object result =new Solution206().reverseList(createListNode("1->2->3->4->5"));
//        Object result = new Solution1071().gcdOfStrings("ABABAB", "ABAB");
//        Object result = new Solution102().levelOrder(createTree(new Integer[]{3,9,20,null,null,15,7}, 0));
//        Object result =new Solution234().isPalindrome(createListNode("1->2->3->4->5"));
//        Object result = new Solution229().majorityElement(new int[]{1,2,2,3,2,1,1,3});
//        Object result = new Solution150().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
//        Object result = new Solution150().evalRPN(new String[]{"4","13","5","/","+"});
//        Object result = new Solution150().evalRPN(new String[]{"4","3","-"});
//        Object result = new Solution150().evalRPN(new String[]{"3","11","+", "5", "-"});
//        Object result = new Solution01_06().compressString("aabcccccaa");
//        boolean result = new Solution464().canIWin(20, 210);
//        boolean result = new Solution464().canIWin(4, 6);
//        int[][] grid = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
//        Object result = new Solution695().maxAreaOfIsland(grid);
//        int[][] grid = new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
//        Object result = new Solution807().maxIncreaseKeepingSkyline(grid);
//        int[][] grid = new int[][]{{1,1,3,2,4,3,2},{1,1,3,2,4,3,2},{1,1,3,2,4,3,2}};
//        int[][] grid = new int[][]{{1,1,1,1},{1,0,0,0},{1,0,0,0},{1,0,0,0}};
//        Object result = new Solution1292().maxSideLength(grid, 4);
//        int[][] result = new Solution1314().matrixBlockSum(grid, 0);
//        Object result = new Solution825().numFriendRequests(new int[]{16,17,18});
//        int[] result = new Solution40().getLeastNumbers(new int[]{3,1,56,1,6,15,2}, 4);
        int[] result = new Solution40().getLeastNumbers(new int[]{3,2,1}, 2);
//        int result = new Solution215().findKthLargest(new int[]{3,1,56,1,6,15,2}, 4);
        System.out.println("time :" + (System.currentTimeMillis() - a));
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
        List<TreeNode> result = new ArrayList();
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

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
