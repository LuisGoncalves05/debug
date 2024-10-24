package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    public static PositiveFilter pos;
    @BeforeAll
    public static void setup() {
        pos = new PositiveFilter();
    }

    @Test
    public void positive() {
        boolean res = pos.accept(1);

        Assertions.assertEquals(true, res);
    }

    @Test
    public void negative() {
        boolean res = pos.accept(-1);

        Assertions.assertEquals(false, res);
    }

    @Test
    public void zero() {
        boolean res = pos.accept(0);

        Assertions.assertEquals(false, res);
    }
}
