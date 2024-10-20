package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {
    List<Integer> list;
    List<Integer> expected;
    ListSorter sorter;
    @BeforeEach
    public void setup() {
        sorter = new ListSorter();
    }

    private List<Integer> createListSorted0() {
        return Arrays.asList(1,2,4,2,5);
    }

    private List<Integer> resultListSorted0() {
        return Arrays.asList(1,2,2,4,5);
    }
    private List<Integer> createListSorted1() {
        return Arrays.asList(-3,-2,-1,0,1);
    }

    private List<Integer> resultListSorted1() {
        return Arrays.asList(-3,-2,-1,0,1);
    }

    private List<Integer> createListUnsorted() {
        return Arrays.asList(3,2,6,4,5,1);
    }

    private List<Integer> resultListUnsorted() {
        return Arrays.asList(1,2,3,4,5,6);
    }

    private List<Integer> createListRepeated() {
        return Arrays.asList(3,2,6,1,4,5,3);
    }
    private List<Integer> resultListRepeated() {
        return Arrays.asList(1,2,3,3,4,5,6);
    }

    @Test
    public void sorted() {
        list = createListSorted0();
        expected = resultListSorted0();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);

        list = createListSorted1();
        expected = resultListSorted1();
        sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    public void unsorted() {
        list = createListUnsorted();
        expected = resultListUnsorted();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
    @Test
    public void repeated() {
        list = createListRepeated();
        expected = resultListRepeated();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
}
