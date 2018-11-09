package com.it;

public class TestThread5 {
    public static void main(String[] args) {
        MyThread5 m = new MyThread5();
        new Thread(m).start();
        new Thread(m).start();
        new Thread(m).start();
    }
}
