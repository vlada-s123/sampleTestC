import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method
    @Test
    public void testDiv() {
        int a = 5;
        int b = 10;
        double exp = 0.5;
        assertEquals(String.format("%s / %s must be %s",a, b, exp), exp, calc.division(a, b));
    }
    @Test
    public void testSub() {
        int a = 20;
        int b = 10;
        int exp = 10;
        assertEquals(String.format("%s - %s must be %s",a, b, exp), exp, calc.subtruction(a, b));
    }
    @Test
    public void testRoot() {
        int a = 16;
        int b = 25;
        double exp1 = 4;
        double exp2 = 5;
        assertEquals(String.format("%s must be %s", a, exp1), exp1, calc.squareRootA(a));
        assertEquals(String.format("%s must be %s", b, exp2), exp2, calc.squareRootB(b));
    }

        @Test
        public void testPow() {
            int a = 2;
            int b = 6;
            double exp = 64;
            assertEquals(String.format("%s ^ %s must be %s",a, b, exp), exp, calc.pow(a, b));
        }
        @Test
        public void testZero() {
                int a = 5;
                int b = 0;
                assertTrue(String.format("%s / %s must be infinity",a, b ), Double.isInfinite(calc.division(a, b)));
    }
        @Test
        public void testSqrRootMin() {
            int a = -5;
            int b = -2;
            assertTrue(String.format("%s  must be NaN",a), Double.isNaN(calc.squareRootA(a)));

            assertTrue(String.format("%s  must be NaN",a), Double.isNaN(calc.squareRootB(b)));
        }


    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
