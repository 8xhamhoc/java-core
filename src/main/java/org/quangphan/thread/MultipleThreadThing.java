package org.quangphan.thread;

public class MultipleThreadThing extends Thread {

    private int threadNumber;

    public MultipleThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + Thread.currentThread().getName());
        for (int i=0; i<5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
