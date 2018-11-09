package com.it;

public class TestThread4 {
    public static void main(String[] args) {
        MyThread4 m = new MyThread4();

        new Thread(m).start();
        new Thread(m).start();
        new Thread(m).start();
    }
}
