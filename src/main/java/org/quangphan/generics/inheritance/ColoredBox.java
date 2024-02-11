package org.quangphan.generics.inheritance;

public class ColoredBox<T> extends Box<T> {

    private String color;

    public ColoredBox(T content, String color) {
        super(content);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void displayColoredBoxType() {
        System.out.println("ColoredBox Type: " + getContent().getClass().getSimpleName() + ", Color: " + color);
    }
}
