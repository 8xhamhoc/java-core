package org.quangphan.generics;

public class ElementGenerics<E> {

    private E element;

    public ElementGenerics(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
