package org.quangphan.generics.wildcards.upper.bound;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StatisticsProcessor<T extends Number> {

    private final List<T> data;

    public StatisticsProcessor(List<T> data) {
        this.data = data;
    }

    public double sum() {
        return data.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public T findMax() {
        return Collections.max(data, Comparator.comparing(Number::doubleValue));
    }
}
