package org.quangphan.generics.util;

import java.util.Arrays;
import java.util.List;

public class NumberUtils {

    public static <T extends Number> double sumOfList(List<T> numbers) {
        return numbers.stream()
                .reduce(0.0, (accumulator, element) -> accumulator + element.doubleValue(), Double::sum);
//        return numbers.stream()
//                .mapToDouble(Number::doubleValue)
//                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Sum: " + NumberUtils.sumOfList(integers));
    }
}
