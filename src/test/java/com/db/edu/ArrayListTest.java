package com.db.edu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

//TODO Refactor to OOP testable design.
public class ArrayListTest {
    private ArrayList<String> sut;

    @Before
    public void setUp() {
        sut = new ArrayList<>();
    }

    @Test
    public void shouldSizeIncrementedWhenElementAdd() {
        //region Given
        String dummy = new String();
        //endregion

        //region When
        sut.add(dummy);
        //endregion

        //region Then
        //if (size != ) throw AssertionError
        assertEquals(2, sut.size());
        sut = null;
        //endregion
    }

    @Test
    public void test2() {

    }
}
