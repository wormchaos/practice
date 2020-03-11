package com.wormchaos.lc.sliding_window.normal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-1-23.
 */
public class Solution225 {
    class MyStack {

        private Queue<Integer> queue;
        private Queue<Integer> q2;
        private int top;

        /** Initialize your data structure here. */
        public MyStack() {
            this.queue = new LinkedList();
            this.q2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
            top = x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while(queue.size() > 1) {
                int t = queue.poll();
                q2.add(t);
                top = t;
            }
            int result = queue.poll();
            Queue temp = q2;
            q2 = queue;
            queue = temp;
            return result;
        }

        /** Get the top element. */
        public int top() {
            return top;
        }

        /** Returns whether the stack is empty. */
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
