package com.it;

public class MyThread6 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(200);
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
