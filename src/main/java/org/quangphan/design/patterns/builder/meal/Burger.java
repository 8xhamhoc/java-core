package org.quangphan.design.patterns.builder.meal;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
