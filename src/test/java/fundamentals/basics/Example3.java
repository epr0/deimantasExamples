package fundamentals.basics;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class Example3 {

    @Test
    public void testAssertEquals() {
        // given
        int firstNum = 2;
        int secondNum = 32;

        // when
        int result = firstNum * secondNum;

        // then
        assertEquals(result, 2 * 32);
        assertTrue(result == 64);
        assertNotEquals("Values are not equal", 1, 2);
    }

    @Test
    public void testAssertTrueFalse() {
        assertTrue(3 == 3);
        assertFalse("Hello".equals("Not Hello"));
    }

    @Ignore
    @Test
    public void testArrayEquals() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        assertArrayEquals(firstArray, secondArray);
    }

    @Test
    public void testAssertNull() {
        String s = null;
        assertNull(s);
    }

    @Test
    public void testAssertSame() {
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2);
    }
}
