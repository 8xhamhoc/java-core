package org.quangphan.multiplethreading;

public class NormalThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Normal thread will finishes execution...");
    }
}
