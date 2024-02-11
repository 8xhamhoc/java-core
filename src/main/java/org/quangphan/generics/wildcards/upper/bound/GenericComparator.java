package org.quangphan.generics.wildcards.upper.bound;

import java.util.Comparator;
import java.util.List;

public class GenericComparator<T extends Comparable<T>> {

    private List<T> data;

    public GenericComparator(List<T> data) {
        this.data = data;
    }

    public T findMax(Comparator<T> param) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return data.stream()
                .max(param)
                .orElse(null);
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Quang", "Trinh", "ABC");
        GenericComparator<String> stringGenericComparator = new GenericComparator<>(strings);

        Comparator<String> stringComparator = Comparator.naturalOrder();
        System.out.println("Max: " + stringGenericComparator.findMax(stringComparator));

        List<Integer> integers = List.of(1, 5, 4, 27, 10, 12, 8);
        GenericComparator<Integer> integerGenericComparator = new GenericComparator<>(integers);
        System.out.println("Max of Integer: " + integerGenericComparator.findMax(Comparator.naturalOrder()));
    }
}
