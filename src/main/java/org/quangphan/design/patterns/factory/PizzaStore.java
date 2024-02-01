package org.quangphan.design.patterns.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String orderType) {
        Pizza pizza = createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }

    protected abstract Pizza createPizza(String orderType);
}
