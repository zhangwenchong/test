package com.example.testdemo.singleton;

/**
 * @author zhangwen
 * @date 2022/2/7
 * 懒汉 线程不安全
 * <p>
 * 1.设想一下，如果第一个线程进入getInstance，此时对于他来说singleton是null，但是此时cpu调度时间到了，该到了第二个线程进来
 * 2.第二个线程进来，此时singleton也是空的，因此就生成了一个
 * 3.时间到了，线程1此时恢复了，对于他来讲，singleton也是空的，所以也创建了一个
 */
class LazySingleTon {
    private LazySingleTon() {
    }

    public static LazySingleTon singleTon;

    public static LazySingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new LazySingleTon();
        }
        return singleTon;
    }
}
