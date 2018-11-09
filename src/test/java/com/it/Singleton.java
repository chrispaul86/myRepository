package com.it;

/**
 * @author lxm
 *
 * 单例模式:懒汉式
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {

    }

    // 定义线程安全/也可以定义线程不安全
    public static synchronized Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
