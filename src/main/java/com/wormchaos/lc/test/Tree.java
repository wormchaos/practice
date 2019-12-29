package com.wormchaos.lc.test;


/**
 * Created by wormchaos on 2019-12-16.
 */
public class Tree {

    public int val;

    public Tree n1;
    public Tree n2;
    public Tree n3;

    public int level;

    Tree() {
        // 默认发展
        level = 0;
    }

    Tree(int level) {
        this.level = level;
    }

}
