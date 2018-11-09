package com.it;

public class TestMyThread1 {
    public static void main(String[] args) {
        MyThread1 m = new MyThread1();
        //m.run();
        Thread t = new Thread(m);
        t.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
