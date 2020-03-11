package com.wormchaos.lc.sliding_window.normal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-1-23.
 */
public class Solution225 {
    class MyStack {

        private Queue<Integer> queue;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            this.queue = new LinkedList();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            int size = queue.size();
            queue.add(x);
            for (int i = 0; i < size; i++) {
                queue.add(queue.poll());
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return queue.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return queue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
