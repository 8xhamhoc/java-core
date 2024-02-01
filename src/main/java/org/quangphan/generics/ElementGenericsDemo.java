package org.quangphan.generics;

public class ElementGenericsDemo {

    public static void main(String[] args) {

        ElementGenerics<String> stringElementGenerics = new ElementGenerics<>("Element test");
        System.out.println("Element: " + stringElementGenerics.getElement());
    }

}
