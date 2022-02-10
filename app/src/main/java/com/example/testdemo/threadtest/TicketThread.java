package com.example.testdemo.threadtest;

/**
 * @author zhangwen
 * @date 2022/1/14
 */

//设置有100张票


public class TicketThread extends Thread {
    private static Object lock = new Object();
    private static int count = 100;

    public TicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            //当票大于0张的时候卖票
            synchronized (lock) {
                if (count > 0) {
                    System.out.println(getName() + "卖出第" + count + "卖票");
                    count--;
                } else {
                    break;
                }
            }

        }

    }

}
