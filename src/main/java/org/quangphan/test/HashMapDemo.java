package org.quangphan.test;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo extends Thread {

    static ConcurrentHashMap<Integer, String> l = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            l.put(103, "D");
        } catch (InterruptedException e) {
            System.out.println("Child thread going to add element");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        l.put(100, "A");
        l.put(101, "B");
        l.put(102, "C");

        HashMapDemo demo = new HashMapDemo();

        demo.start();

        try {
            for (Object o : l.entrySet()) {
                Object s = o;
                Thread.sleep(1000);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Child thread going to add element");
        }

        System.out.println(l);
    }
}
