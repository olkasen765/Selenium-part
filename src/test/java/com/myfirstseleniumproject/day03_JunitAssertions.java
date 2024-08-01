package com.myfirstseleniumproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class day03_JunitAssertions {



    @Test
    public void assertionsTest() {

        Assertions.assertEquals(5,5);

        Assertions.assertEquals("apple", "APPLE".toLowerCase());

        Assertions.assertTrue(5<7);
        Assertions.assertTrue(true);

        Assertions.assertTrue("Selenium".contains("e"));

        Assertions.assertFalse(3 > 5);
        Assertions.assertFalse(false);

        Assertions.assertFalse("Java".contains("m"));

        String str = null;
        Assertions.assertNull(str);

        Assertions.assertNotNull(str);


    }


}
