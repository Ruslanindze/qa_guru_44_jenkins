package qa.guru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositiveTest {

    @Test
    void testEqualsInts() {
        assertEquals(400, 100 + 300);
        assertEquals(500, 200 + 300);
        assertEquals(-500, 200 - 700);
    }

    @Test
    void testEqualsStrings() {
        assertEquals("home", "home");
        assertEquals("aba2", "aba2");
        assertEquals("work", "work");
    }

    @Test
    void testEqualsTrue() {
        assertTrue(5 == 5);
        assertTrue("math" == "math");
        assertTrue(5 - 2 > 2);
    }

    @Test
    void testEqualsFalse() {
        assertFalse(6 == 5);
        assertFalse("math_" == "math");
        assertFalse(5 - 2 < 2);
    }
}
