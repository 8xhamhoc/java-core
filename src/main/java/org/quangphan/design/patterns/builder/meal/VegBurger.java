package org.quangphan.design.patterns.builder.meal;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veb Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
