package com.it;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //ExecutorService es = new ThreadPoolExecutor(4);

        executorService.submit(new MyThread6());
        executorService.submit(new MyThread6());
        executorService.submit(new MyThread6());
        executorService.submit(new MyThread6());
    }
}
