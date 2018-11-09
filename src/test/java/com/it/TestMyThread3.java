package com.it;

public class TestMyThread3 {
    public static void main(String[] args) {
        MyThread3 m = new MyThread3();
        //MyThread3 m2 = new MyThread3();
        //MyThread3 m3 = new MyThread3();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.start();
        t2.start();
        t3.start();
    }
}
