package org.quangphan.thread;

public class MultiThreading {

    public static void main(String[] args) {

        for (int i=1; i<5; i++) {
            MultipleThreadThing threadThing = new MultipleThreadThing(i);
            threadThing.start();
        }

        throw new RuntimeException();
    }
}
