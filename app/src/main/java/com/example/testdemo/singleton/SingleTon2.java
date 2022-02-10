package com.example.testdemo.singleton;

/**
 * @author zhangwen
 * @date 2022/2/7
 * 双重检查锁定（DCL）
 */
public class SingleTon2 {
    private SingleTon2() {
    }

    private volatile static SingleTon2 singleTon2;//volatile 能够防止代码的重排序，保证得到的对象是初始化过

    public static SingleTon2 getInstance() {
        if (singleTon2 == null) {//第一次检查，避免不必要的同步
            synchronized (SingleTon2.class) {
                if (singleTon2 == null) { //同步
                    singleTon2 = new SingleTon2();//第二次检查，为null时才创建实例
                }
            }
        }
        return singleTon2;

    }


}
