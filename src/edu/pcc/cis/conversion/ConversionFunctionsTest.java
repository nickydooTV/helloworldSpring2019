package edu.pcc.cis.conversion;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionFunctionsTest {

    // celsiusToFahrenheit tests ---------------------------------------------------------------------------
    @Test
    public void celsius0IsFahrenheit32() {
        assertEquals(32, ConversionFunctions.celsiusToFahrenheit(0));
    }

    @Test
    public void celsius16IsFahrenheit61() {
        assertEquals(61, ConversionFunctions.celsiusToFahrenheit(16));
    }

    // TODO: Write a test for a negative celsius that converts to a positive fahrenheit

    // TODO: Write a test for a negative celsius that converts to a negative fahrenheit

    // TODO: Write a test for a celsius value that converts to 0 fahrenheit

    // cupsToTablespoons tests ---------------------------------------------------------------------------
    // TODO: Write a test for 0 cups converts to 0 tablespoons - run the test & see that it passes

    // TODO: Write a test for 1 cup converts to 16 tablespoons
    // TODO: Run the test & see that it fails. Failing tests reveal bugs.
    // TODO: Fix the implementation of cupsToTablespoons so that this test passes

    // TODO: Write one or two additional tests for cupsToTablespoons


    // monthNumToMonthName tests ---------------------------------------------------------------------------
    // TODO: Complete the test below so that it tests all valid months
    @Test
    public void months1through12AreJanuaryThroughDecember() {
        assertEquals("january", ConversionFunctions.monthNumToMonthName(1).toLowerCase());
        assertEquals("february", ConversionFunctions.monthNumToMonthName(2).toLowerCase());
    }

    // TODO: Complete the test below for a variety of invalid month numbers; be sure to include bounds
    // TODO: Run the test and see that it fails. Failing tests reveal bugs.
    // TODO: Fix the implementation of monthNumToMonthName so that this test passes
    @Test
    public void invalidMonthReturnsEmptyString() {
    }
}