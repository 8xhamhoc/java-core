package org.quangphan.general;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack behavior");
    }
}
