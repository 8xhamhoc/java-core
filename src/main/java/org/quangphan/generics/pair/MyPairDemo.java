package org.quangphan.generics.pair;

public class MyPairDemo {

    public static void main(String[] args) {

        MyPair<String, Integer> myPair = new MyPair<>("Tung", 20);
        System.out.println("name: " + myPair.getFirst() + " - age: " + myPair.getSecond());
    }
}
