package com.wormchaos.lc.sliding_window.normal;


import java.util.LinkedList;

/**
 * Created by wormchaos on 2020-1-7.
 * 拓扑排序
 */
public class Solution207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        // 0 未访问 -1 被其他节点访问 1 被当前节点访问
        for (int i = 0; i < prerequisites.length; i++) {
//            prerequisites[i][0];
        }
        return numCourses == 0;
    }
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        int[] indegrees = new int[numCourses];
//        // 记录所有起点
//        for(int[] cp : prerequisites) {
//            indegrees[cp[0]]++;
//        }
//        LinkedList<Integer> queue = new LinkedList<>();
//        // 把所有非起点加入队列
//        for(int i = 0; i < numCourses; i++){
//            if(indegrees[i] == 0) {
//                queue.addLast(i);
//            }
//        }
//        while(!queue.isEmpty()) {
//            // 取出一个终点
//            Integer pre = queue.removeFirst();
//            numCourses--;
//            // 找到该点是否是某个起点的终点
//            for(int[] req : prerequisites) {
//                if(req[1] != pre) {
//                    continue;
//                }
//                // 如果该终点的起点依然不是起点，则加入队列
//                if(--indegrees[req[0]] == 0) {
//                    queue.add(req[0]);
//                }
//            }
//        }
//        return numCourses == 0;
//    }
}
