package org.quangphan.design.patterns.factory;

public abstract class Pizza {

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    abstract void prepare();

    public void bake() {
        System.out.println("baking pizza");
    }
}
