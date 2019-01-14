import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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






    @Test
    public void testAddTwoNegativeValues1() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }
    @Test
    public void testAddTwoNegativeValues2() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }
    @Test
    public void testAddTwoNegativeValues3() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }
    @Test
    public void testAddTwoNegativeValues4() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }
    @Test
    public void testAddTwoNegativeValues5() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }
    @Test
    public void testAddTwoNegativeValues6() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
