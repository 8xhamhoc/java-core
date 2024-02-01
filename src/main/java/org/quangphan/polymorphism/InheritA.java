package org.quangphan.polymorphism;

public abstract class InheritA implements A {

    @Override
    public void showA() {
        System.out.println("InheritA showA");
    }

    abstract void showInheritA();
}
