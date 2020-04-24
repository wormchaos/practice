package com.wormchaos.lc;

import com.wormchaos.lc.sliding_window.easy.Solution198;
import com.wormchaos.lc.sliding_window.hard.Solution891;
import com.wormchaos.lc.sliding_window.mensetsu.Solution07;
import com.wormchaos.lc.sliding_window.mensetsu.Solution16_20;
import com.wormchaos.lc.sliding_window.mensetsu.Solution17_18;
import com.wormchaos.lc.sliding_window.mensetsu.Solution47;
import com.wormchaos.lc.sliding_window.mensetsu.Solution61;
import com.wormchaos.lc.sliding_window.normal.Solution1248;
import com.wormchaos.lc.sliding_window.normal.Solution1282;
import com.wormchaos.lc.sliding_window.normal.Solution165;
import com.wormchaos.lc.sliding_window.normal.Solution456;
import com.wormchaos.lc.sliding_window.normal.Solution457;
import com.wormchaos.lc.sliding_window.normal.Solution814;
import com.wormchaos.lc.sliding_window.normal.Solution877;
import com.wormchaos.lc.sliding_window.normal.Solution89;
import com.wormchaos.lc.sliding_window.normal.Solution90;
import com.wormchaos.lc.sliding_window.normal.Solution95;
import com.wormchaos.lc.sliding_window.normal.Solution950;
import com.wormchaos.lc.sliding_window.sars.*;
import com.wormchaos.lc.test.Tree;
import com.wormchaos.lc.toolbean.ListNode;
import com.wormchaos.lc.toolbean.TreeNode;

import javax.naming.ldap.PagedResultsControl;
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
//        int arr[][] = {{2, 2, 2, 1, 1}};
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
//        int[] result = new Solution40().getLeastNumbers(new int[]{0,0,1,2,4,2,2,3,1,4}, 8);
//        int[] result = new Solution40().getLeastNumbers(new int[]{3,2,1}, 2);
//        int result = new Solution215().findKthLargest(new int[]{3,1,56,1,6,15,2}, 4);
//        String[] result = new Solution08_07().permutation_switch("qwe");
//        Object result = new Solution17_16().massage(new int[]{1,2,3,1});
//        Object result = new Solution1282().groupThePeople(new int[]{3,3,3,3,3,1,3});
//        Object result = new Solution950().deckRevealedIncreasing(new int[]
//                {17, 13, 11, 2, 3, 5, 7});
//        Object result = new Solution891().sumSubseqWidths(new int[]{2,1,3});
//        Object result = new Solution891().sumSubseqWidths(new int[]{3,7,2,3});
//        TreeNode result = new Solution814().pruneTree(createTree(new Integer[]{1, 0, 1, 0, 0, 0, 1}, 0));
//        Object result = new Solution877().stoneGame(new int[]{3,2,10,4});
//        Object result = new Solution877().stoneGame(new int[]{3,7,3,2,5,1,6,3,10,7});
//        Object result = new Solution877().stoneGame(new int[]{3,7,3,2,5,1,6,3,10,7});
//        Object result = new Solution16_20().getValidT9Words("8733", new String[]{"tree", "used"});
//        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
//        Object result = new Solution47().maxValue(grid);
//        TreeNode result = new Solution07().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
//        TreeNode result = new Solution07().buildTree(new int[]{1, 2, 3}, new int[]{2, 3, 1});
//        Object result = new Solution61().maxProfit(new int[]{2,4,1});
//        Object result = new Solution914().hasGroupsSizeX(new int[]{1,1,2,2,2,2});
//        Object result = new Solution89().grayCode(4);
//        Object result = new Solution90().subsetsWithDup(new int[]{1,2,2});
//        List<TreeNode> result = new Solution95().generateTrees(3);
//        int[] result = new Solution912().sortArray(new int[]{5, 2, 3, 1});
//        int[] result = new Solution912().sortArray(new int[]{5, 1, 1, 2, 0, 0});
//        int[] result = new Solution912().sortArray(new int[]{-4, 0, 7, 4, 9, -5, -1, 0, -7, -1});
//        int[][] v = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
//        int[][] v = new int[][]{{0}};
//        new Solution289().gameOfLife(v);
//        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        new Solution01_07().rotate(matrix);
//        ListNode result = new Solution445().addTwoNumbers(createListNode("2"), createListNode("9->9->9"));
//        ListNode result = new Solution445().addTwoNumbers(createListNode("0"), createListNode("1->8->4->0"));
//        ListNode result = new Solution445().addTwoNumbers(createListNode("9->1->6"), createListNode("0"));
//        ListNode result = new Solution445().addTwoNumbers(createListNode("1->2->7"), createListNode("9->8->7->3"));
//        boolean result = new Solution456().find132pattern(new int[]{1,-4,2,-1,3,-3,-4,0,-3,-1});
//        int[][] arr = new int[][]{
//                {1, 0, 1, 1, 0, 0, 1, 0, 0, 1},
//                {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
//                {0, 0, 1, 0, 1, 0, 0, 1, 0, 0},
//                {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
//                {0, 1, 0, 1, 1, 0, 0, 0, 0, 1},
//                {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
//                {0, 1, 0, 1, 0, 1, 0, 0, 1, 1},
//                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
//                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
//                {1, 1, 1, 1, 0, 1, 0, 0, 1, 1}
//        };
//        int[][] result = new Solution542().updateMatrix(arr);
//        boolean result = new Solution457().circularArrayLoop(new int[]{-2,1,-1,-2,-2});
//        boolean result = new Solution457().circularArrayLoop(new int[]{-1,2});
//        int result = new Solution1248().numberOfSubarrays(new int[]{1,1,2,1,1}, 3);
//        int result = new Solution165().compareVersion("1.0.1", "1.000");
//        int[] result = new Solution17_18().shortestSeq(new int[]{7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7}, new int[]{1,5,9});
//        int[] result = new Solution17_18().shortestSeq(new int[]{521704, 897261, 279103, 381783, 668374, 934085, 254258, 726184, 496153, 804155}, new int[]{897261, 9385, 381783, 496153});
//        int[] result = new Solution17_18().shortestSeq(new int[]{499, 867, 454, 392, 282, 345, 257, 99, 395, 452, 91, 465, 907, 214, 370, 502, 627, 372, 810, 923, 390, 401, 873, 884, 742, 62, 676, 602, 933, 43, 952, 85, 806, 90, 729, 873, 618, 589, 357, 693, 896, 762, 511, 788, 807, 760, 575, 888, 128, 322, 71, 543, 343, 952, 473, 541, 701, 727, 14, 852, 922, 566, 740, 868, 197, 416, 298, 581, 605, 454, 268, 664, 885, 452, 215, 752, 23, 980, 287, 22, 726, 300, 902, 91, 92, 608, 350, 554, 451, 402, 369, 492, 956, 673, 311, 707, 345, 893, 942, 775, 704, 695, 495, 220, 900, 12, 962, 809, 282, 283, 300, 44, 37, 742, 763, 360, 166, 577, 519, 506, 624, 946, 663, 701, 317, 770, 627, 619, 812, 670, 806, 912, 242, 172, 849, 381, 159, 945, 634, 82, 244, 840, 39, 805, 114, 750, 16, 196, 421, 149, 726, 323, 835, 5, 850, 895, 40, 904, 384, 46, 831, 120, 314, 810, 661, 277, 267, 846, 829, 241, 373, 830, 497, 915, 886, 979, 774, 411, 861, 612, 147, 30, 752, 76, 844, 777, 269, 158, 539, 642, 825, 569, 137, 872, 465, 908, 879, 368, 265, 125, 805, 434, 640, 420, 493, 240, 744, 403, 527, 749, 471, 515, 183, 876, 933, 606, 478, 729, 769, 436, 707, 6, 765, 995, 913, 468, 259, 393, 561, 599, 659, 672, 870, 620, 980, 443, 742, 327, 494, 482, 167, 122, 545, 326, 362, 953, 960, 83, 773, 995, 190, 317, 381, 941, 43, 326, 645, 508, 302, 200, 167, 791, 294, 204, 836, 805, 573, 494, 732, 113, 393, 738, 138, 333, 397, 356, 308, 729, 110, 978, 361, 465, 888, 126, 50, 303, 271, 10, 111, 956, 831, 20, 126, 413, 194, 538, 996, 282, 800, 887, 718, 92, 128, 137, 864, 428, 484, 608, 528, 927, 801, 935, 646, 896, 496, 983, 751, 565, 314, 962, 346, 340, 987, 942, 588, 326, 3, 584, 612, 310, 837, 449, 183, 597, 316, 953, 895, 648, 693, 484, 764, 71, 181, 719, 360, 106, 845, 635, 244, 721, 633, 200, 417, 9, 600, 41, 516, 697, 849, 414, 682, 390, 672, 413, 155, 154, 970, 176, 807, 123, 227, 936, 645, 485, 228, 259, 360, 793, 93, 124, 358, 881, 735, 832, 238, 794, 109, 589, 284, 248, 500, 910, 23, 919, 671, 990, 248, 47, 527, 139, 403, 291, 179, 886, 963, 671, 556, 463, 696, 669, 892, 912, 76, 432, 247, 880, 377, 263, 450, 351, 293, 384, 313, 524, 375, 307, 274, 128, 784, 148, 803, 663, 767, 983, 689, 667, 985, 103, 175, 778, 227, 80, 64, 280, 802, 93, 409, 887, 464, 803, 104, 632, 642, 561, 408, 965, 350, 308, 845, 56, 576, 962, 907, 231, 413, 900, 96, 108, 793, 115, 596, 976, 693, 240, 430, 538, 824, 811, 660, 126, 194, 993, 184, 545, 34, 960, 67, 943, 435, 139, 234, 444, 918, 301, 83, 847, 592, 648, 200, 614, 43, 702, 927, 232, 150, 755, 490, 46, 326, 842, 163, 22, 195, 949, 968, 802, 68, 198, 815, 741, 28, 30, 701, 840, 487, 126, 307, 826, 520, 270, 864, 984, 898, 490, 964, 1, 265, 991, 925, 506, 709, 293, 528, 176, 464, 676, 788, 430, 804, 637, 813, 838, 747, 857, 509, 560, 569, 629, 697, 613, 534, 912, 311, 428, 705, 132, 77, 893, 445, 216, 598, 903, 176, 358, 554, 499, 461, 197, 42, 298, 620, 682, 816, 755, 465, 363, 345, 256, 426, 195, 264, 219, 336, 625, 443, 533, 213, 446, 18, 264, 262, 214, 792, 959, 132, 998, 341, 373, 2, 945, 447, 29, 557, 818, 892, 311, 491, 883, 275, 936, 653, 20, 955, 349, 784, 49, 145, 387, 560, 720, 613, 637, 539, 483, 702, 66, 483, 909, 455, 732, 734, 383, 748, 453, 76, 488, 189, 917, 828, 270, 335, 820, 64, 176, 204, 554, 559, 551, 850, 297, 294, 619, 889, 912, 873, 406, 480, 825, 792, 194, 107, 278, 340, 680, 233, 654, 732, 356, 644, 577, 227, 483, 549, 484, 55, 377, 958, 453, 649, 826, 96, 692, 360, 639, 889, 693, 5, 733, 767, 538, 63, 611, 394, 829, 618, 4, 269, 331, 695, 636, 26, 625, 878, 799, 375, 295, 693, 676, 357, 446, 542, 753, 935, 75, 544, 783, 15, 5, 387, 400, 4, 770, 974, 735, 90, 562, 348, 248, 992, 985, 503, 985, 601, 291, 625, 402, 601, 685, 743, 796, 346, 89, 90, 73, 296, 766, 348, 328, 184, 533, 299, 194, 778, 463, 406, 820, 494, 623, 475, 472, 340, 411, 294, 649, 108, 727, 202, 411, 40, 557, 880, 769, 574, 937, 934, 259, 7, 681, 61, 831, 894, 818, 791, 435, 279, 784, 794, 318, 917, 559, 776, 524, 265, 878, 832, 788, 850, 251, 852, 693, 322, 214, 6, 758, 39, 921, 391, 89, 256, 436, 272, 182, 321, 373, 562, 804, 73, 818, 773, 168, 172, 340, 665, 487, 898, 110, 175, 120, 595, 581, 707, 399, 978, 920, 305, 734, 629, 13, 364, 391, 771, 610, 877, 242, 284, 484, 254, 112, 599, 355, 637, 143, 298, 618, 111, 148, 111, 283, 783, 32, 191, 985, 64, 534, 45, 103, 423, 668, 192, 268, 896, 775, 277, 861, 686, 291, 918, 282, 283, 901, 496, 764, 246, 686, 64, 37, 656, 770, 616, 404, 213, 779, 42, 235, 512, 70, 508, 934, 572, 137, 969, 41, 770, 943, 835, 209, 657, 154, 531, 746, 521, 206, 950, 618, 583, 202, 286, 788, 288, 184, 222, 781, 856, 530, 341, 844, 896, 22, 337, 142, 137, 789, 941, 981, 190, 159, 907, 431, 578, 310, 827, 875, 591, 46, 322, 772, 677, 345, 989, 51, 581, 979, 464, 909, 213, 987, 946, 268, 668, 649, 92, 949, 839, 315, 987, 471, 239, 785, 103, 17, 584, 384, 382, 250, 63, 665, 799, 683, 799, 595, 211, 621, 575, 142, 242, 930, 488, 454, 166, 162},
//                new int[]{375, 451, 491, 114, 383, 766, 898, 46, 277, 362, 288, 493, 310, 390, 569, 856, 244, 200, 921, 327, 576, 215, 148, 740, 519, 826, 528, 599, 811, 806, 213, 987, 900, 279, 506, 311, 611, 363, 420, 727, 776, 544, 296, 76, 49, 799, 337, 984, 472, 815, 877, 976, 184, 106, 361, 373, 963, 307, 649, 108, 577, 612, 301, 158, 2, 109, 85, 845, 411, 145, 887, 271, 895, 113, 272, 231, 351, 784, 495, 962, 400, 461, 903, 896, 829, 783, 885, 990, 623, 264, 75, 886, 918, 832, 251, 20, 889, 645, 556, 436, 452, 646, 471, 636, 831, 463, 196, 735, 508, 465, 807, 480, 89, 149, 549, 936, 360, 345, 43, 358, 80, 63, 753, 538, 268, 96, 482, 778, 943, 729, 198, 247, 17, 779, 873, 629, 278, 66, 483, 613, 742, 162, 813, 693, 323, 222, 601, 318, 369, 554, 308, 194, 137, 434, 77, 637, 758, 909, 176, 181, 56, 341, 499, 598, 384, 770, 949, 659, 328, 189, 875, 447, 364, 377, 541, 748, 454, 115, 667, 298, 107, 907, 408, 190, 809, 302, 227, 991, 294, 801, 126, 175, 656, 934, 214, 771, 357, 315, 435, 605, 996, 591, 773, 534, 283, 51, 733, 40, 64, 792, 671, 232, 520, 62, 747, 828, 406, 449, 416, 682, 803, 111, 732, 665, 91, 293, 71, 490, 543, 533, 718, 800, 755, 313, 42, 331, 166, 985, 197, 573, 888, 606, 316, 142, 810, 250, 915, 6, 767, 5, 99, 73, 37, 93, 428, 502, 835, 209, 216, 497, 417, 509, 92, 952, 257, 818, 265, 709, 965, 524, 23, 155, 220, 852, 90, 13, 764, 414, 775, 246, 9, 677, 796, 695, 850, 734, 864, 485, 154, 788, 291, 791, 132, 627, 270, 769, 124, 562, 861, 937, 494, 892, 446, 701, 34, 182, 426, 295, 14, 488, 849, 211, 263, 421, 837, 123, 572, 726, 893, 697, 720, 473, 1, 640, 128, 397, 608, 235, 511, 884, 284, 827, 762, 741, 394, 686, 993, 705, 242, 527, 602, 619, 846, 902, 744, 487, 910, 634, 297, 592, 254, 282, 581, 980, 409, 794, 805, 183, 566, 204, 802, 760, 355, 432, 103, 789, 333, 82, 648, 793, 322, 676, 625, 672, 654, 67, 503, 844, 912, 642, 816, 692, 18, 512, 492, 41, 953, 765, 453, 22, 820, 774, 964, 942, 443, 904, 401, 685, 430, 878, 455, 248, 913, 530, 484, 269, 445, 620, 172, 393, 804, 147, 30, 168, 968, 946, 26, 584, 28, 179, 404, 413, 839, 356, 680, 317, 668, 110, 979, 143, 559, 670, 314, 195, 274, 159, 256, 464, 657, 867, 983, 120, 382, 368, 206, 673, 335, 387, 857, 125, 340, 496, 992, 303, 574, 326});
//        int[] result = new Solution17_18().shortestSeq(new int[]{}, new int[]{});
        int result = new Solution08_11().waysToChange(10);
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

    private static void print(Object[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void print(TreeNode treeNode) {
        // 层次遍历
        List<Integer[]> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer[] temp = new Integer[(int) Math.pow(2, level)];
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                temp[i] = t.val;
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            result.add(temp);
            level++;
        }
        for (Integer[] tt : result) {
            print(tt);
        }
//        Integer[] a = new Integer[(int) Math.pow(2, level + 1)];
    }

    private static void print(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((null == arr[i] ? "null" : arr[i]) + " ");
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void print(int[][] arr) {
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

    private static void print(List<?> list) {
        for (Object l : list) {
            print(l);
        }
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
