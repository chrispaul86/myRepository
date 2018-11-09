package com.it;

public class MyThread3 implements Runnable{
    private Integer ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        synchronized (obj){
            while (true){
                if (ticket>0){
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket--+"张票");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
