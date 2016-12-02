package com.db.edu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringTest {
    @Test
    public void shouldBeNotSameWhenNewStrings() {
        //Intern
        String s1 = new String("AB"); //"A"
        String s2 = new String("AB");

//        String s3 = "c";
//        s3 = s3.toUpperCase();
//        assertEquals("C", s3);

        assertEquals(false, s1 == s2);
    }
}
