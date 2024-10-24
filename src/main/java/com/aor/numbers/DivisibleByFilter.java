package com.aor.numbers;

import java.util.List;

public class DivisibleByFilter implements GenericListFilter {

    private Integer filter;

    public DivisibleByFilter(Integer filter) {
        this.filter = filter;
    }
    public boolean accept(Integer number) {
        int result = number % filter;
        return result == 0;
    }
}
