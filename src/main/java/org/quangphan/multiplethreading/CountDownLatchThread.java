package org.quangphan.multiplethreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchThread implements Runnable {

    private int id;
    private CountDownLatch latch;

    public CountDownLatchThread(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            doSomething();
        } finally {
            latch.countDown();
        }
    }

    private void doSomething() {
        System.out.println("Count down with id " + id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
