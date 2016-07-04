package com.wormchaos.testmain;

import java.lang.reflect.Method;

/**
 * Created by wormchaos on 2016/7/4.
 */
public class MyTargetTest {

    @MyTarget
    public void doSth() {
        System.out.println("hw");
    }

    public static void main (String... args) {
        try {
            Method method = MyTargetTest.class.getMethod("doSth", null);
            if(method.isAnnotationPresent(MyTarget.class)) {
                System.out.println(method.getAnnotation(MyTarget.class));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
