package com.it;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread4 implements Runnable {
    private Integer ticket = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket--+"张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }
}
