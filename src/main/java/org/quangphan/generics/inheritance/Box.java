package org.quangphan.generics.inheritance;

public class Box<T> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void displayBoxType() {
        System.out.println("Box Type: " + content.getClass().getSimpleName());
    }
}
