package com.it;

public class MyThread5 implements Runnable {
    private Integer ticket = 100;


    @Override
    public void run() {
        while (true){
            payTicket();
        }
    }

    public synchronized void payTicket(){
        synchronized (this){
            if (ticket>0){
                try {
                    Thread.sleep(200);
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket--+"张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
