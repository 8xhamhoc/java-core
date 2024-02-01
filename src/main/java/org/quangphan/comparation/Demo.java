package org.quangphan.comparation;

public class Demo {

    public static void main(String[] args) {

        ClassChild classChild1 = new ClassChild();
        classChild1.setAge(20);
        classChild1.setName("ABC");

        ClassChild classChild2 = new ClassChild();
        classChild1.setAge(21);
        classChild1.setName("ABC");

        ClassParent classParent1 = new ClassParent();
        classParent1.setAge(40);
        classParent1.setName("BCD");
        classParent1.getClassChildren().add(classChild1);

        ClassParent classParent2 = new ClassParent();
        classParent2.setAge(40);
        classParent2.setName("BCD");
        classParent2.getClassChildren().add(classChild1);

        ClassParent classParent3 = new ClassParent();
        classParent3.setAge(40);
        classParent3.setName("BCD");
        classParent3.getClassChildren().add(classChild2);

        System.out.println("Is the same: " + (classParent1.equals(classParent2)));
        System.out.println("Is the same: " + (classParent1.equals(classParent3)));

    }
}
