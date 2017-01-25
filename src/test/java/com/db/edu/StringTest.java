package com.db.edu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringTest {
    @Test
    public void shouldBeNotSameWhenNewStrings() {
        //Intern
        Double i1 = 1.; //new Integ()
        Double i2 = 1.;

        assertEquals(true, i1 == i2);
    }
}
