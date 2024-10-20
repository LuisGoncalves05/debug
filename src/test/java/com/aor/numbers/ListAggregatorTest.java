package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    private List<Integer> list;
    static private ListAggregator aggregator;

    @BeforeAll
    public static void setup() {
        aggregator = new ListAggregator();
    }

    private List<Integer> createListPositive() {
        return Arrays.asList(1,2,4,2,5);
    }

    private List<Integer> createListNegative() {
        return Arrays.asList(-5,-4,-3,-2,-1);
    }

    private List<Integer> createListRepeated() {
        return Arrays.asList(1,2,4,2);
    }

    @Test
    public void sum() {
        list = createListPositive();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        list = createListPositive();
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        list = createListPositive();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        list = createListPositive();
        int distinct = aggregator.distinct(list, new ListDeduplicator());

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void maxBug7263() {
        list = createListNegative();
        int max = aggregator.max(list);

        Assertions.assertEquals(-1, max);
    }

    @Test
    public void distinctBug8726() {
        class Stub extends ListDeduplicator {
            @Override
            public List<Integer> deduplicate(List<Integer> list) {
                return Arrays.asList(1, 2, 4);
            }
        }
        list = createListRepeated();
        GenericListDeduplicator deduplicator = new Stub();
        int distinct = aggregator.distinct(list, deduplicator);

        Assertions.assertEquals(3, distinct);
    }
}
