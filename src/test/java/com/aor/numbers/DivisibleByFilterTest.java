package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest{
    public static DivisibleByFilter div;
    @BeforeAll
    public static void setup() {
        div = new DivisibleByFilter(5);
    }

    @Test
    public void divisible() {
        boolean res = div.accept(10);

        Assertions.assertEquals(true, res);
    }

    @Test
    public void nondivisible() {
        boolean res = div.accept(11);

        Assertions.assertEquals(false, res);
    }

    @Test
    public void zero() {
        boolean res = div.accept(0);

        Assertions.assertEquals(true, res);
    }
}
