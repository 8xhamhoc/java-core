package org.quangphan.design.patterns.builder.meal;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle packing";
    }
}
