package com.example.testdemo.singleton;

/**
 * @author zhangwen
 * @date 2022/2/7
 * 饿汉式单例
 * 缺点 如果未使用到 会造成内存浪费
 */
public class SingleTon {

    private SingleTon() {//构造方法为private,防止外部代码直接通过new来构造多个对象
    }

    private static final SingleTon single = new SingleTon();//在类初始化时，已经自行实例化,所以是线程安全的。

    public static SingleTon getInstance() { //通过getInstance()方法获取实例对象
        return single;
    }

}
