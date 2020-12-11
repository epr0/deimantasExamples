package fundamentals.basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Example6 {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Run before the first test method");
    }

    @Before
    public void setUp() {
        System.out.println("Run before each test");
    }

    @After
    public void tearDown() {
        System.out.println("Run after each test");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Run after the last test method");
    }

    @Test
    public void testExample1() {
        System.out.println("Implementation of the first test");
        assertEquals(1, 1);
    }

    @Test
    public void testExample2() {
        System.out.println("Implementation of the second test");
        assertNotEquals(0, 1);
    }

}
