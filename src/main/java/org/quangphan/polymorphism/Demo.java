package org.quangphan.polymorphism;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

//        FirstOne firstOne = new FirstOne();
//
//        System.out.println("result: " + (firstOne instanceof A));

//        String value = empty().orElseThrow(EmptyValueException::new);
//        System.out.println("value: " + value);

        List<String> strings = Arrays.asList("ABC", "1212121");

        Map<String, Integer> result = strings.stream().collect(Collectors.toMap(Function.identity(), String::length));

    }


    private static Optional<String> empty() {
        return Optional.empty();
    }

}
