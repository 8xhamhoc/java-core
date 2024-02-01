package org.quangphan.design.patterns.factory;

public class PizzaDemo {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
        System.out.println("dough: " + pizza.dough.getClass().getName());

    }
}
