package org.quangphan.multiplethreading;

public class Demo {

    public static void main(String[] args) {

        Thread daemonThread = new Thread(new DaemonThread());
        Thread normalThread = new Thread(new NormalThread());
        daemonThread.setDaemon(true);
        daemonThread.start();
        normalThread.start();
    }
}
