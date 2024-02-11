package org.quangphan.generics.wildcards.lowerbound;

import java.util.ArrayList;
import java.util.List;

public class CustomLowerBoundWildcard {

    public static void processElements(List<? super Integer> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Number> doubles = new ArrayList<>();
        doubles.add(2.4d);

        processElements(doubles);
    }
}
