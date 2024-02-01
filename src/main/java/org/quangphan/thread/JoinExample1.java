package org.quangphan.thread;

public class JoinExample1 extends Thread {

    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " - Thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String args[]) {
        JoinExample1 thread1 = new JoinExample1();
        JoinExample1 thread2 = new JoinExample1();
        JoinExample1 thread3 = new JoinExample1();

        System.out.println("thread1 priority " + thread1.getPriority());
        System.out.println("thread2 priority " + thread2.getPriority());
        System.out.println("thread3 priority " + thread3.getPriority());

        thread1.start();
//        try {
//            thread1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        thread2.start();
        thread3.start();
    }

}
