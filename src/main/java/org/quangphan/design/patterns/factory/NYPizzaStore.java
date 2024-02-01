package org.quangphan.design.patterns.factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
