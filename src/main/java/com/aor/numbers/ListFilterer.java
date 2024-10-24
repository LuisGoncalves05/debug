package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    GenericListFilter filt;

    public ListFilterer(GenericListFilter filter) {
        this.filt = filter;
    }
    public List<Integer> filter(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer element: list) {
            if (filt.accept(element)) result.add(element);
        }
        return result;
    }
}
