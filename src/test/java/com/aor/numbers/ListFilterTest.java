package com.aor.numbers;

import com.sun.tools.javac.jvm.Gen;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ListFilterTest {
    public GenericListFilter fil;

    @BeforeAll
    public void setup() {
        GenericListFilter fil = Mockito.mock(GenericListFilter.class);
        Mockito.when(fil.accept(Mockito.anyInt())).thenReturn(true);
        this.fil = fil;
    }

    @Test
    public void
}
