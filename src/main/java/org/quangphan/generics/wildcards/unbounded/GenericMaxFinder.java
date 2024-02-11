package org.quangphan.generics.wildcards.unbounded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMaxFinder {

    public static <T extends Comparable<? super T>> T findMax(List<? extends T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        /*T max = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;*/
        return Collections.max(elements);
    }

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22)
        );

        Person max = findMax(personList);

        System.out.println(max);
    }
}
