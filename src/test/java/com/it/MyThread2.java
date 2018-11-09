package com.it;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread2 m = new MyThread2();
        //m.setPriority(10);
        m.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
