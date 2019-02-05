package edu.pcc.cis.conversion;
/**
 *@author Cara Tang and Nicholas Goff
 * @version 2019.02.19
 *
 * Mods for lab 4
 * -Completed the TODO's for lab 4
 * all TODO completed
 * wrote  a test for a negative celsius that converts to a positive fahrenheit
 * wrote a test for a negative celsius that converts to a negative fahrenheit
 * Wrote a test for a celsius value that converts to 0 fahrenheit
 * Wrote a test for 0 cups converts to 0 tablespoons - run the test & see that it passes
 * Wrote a test for 1 cup converts to 16 tablespoons
 * Wrote one or two additional tests for cupsToTablespoons
 * Completed the test below so that it tests all valid months
 * Fixed the implementation of monthNumToMonthName so that this test passes
 */

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
    @Test
    public void celsiusNegative2IsFahrenheit28() {
        assertEquals(28, ConversionFunctions.celsiusToFahrenheit(-2));
    }

    // TODO: Write a test for a negative celsius that converts to a negative fahrenheit
    @Test
    public void celsiusNegative20IsFahrenheitNegative4() {
        assertEquals(-4, ConversionFunctions.celsiusToFahrenheit(-20));
    }

    // TODO: Write a test for a celsius value that converts to 0 fahrenheit
    @Test
    public void celsiusNegative18IsFahrenheit0() {
        assertEquals(0, ConversionFunctions.celsiusToFahrenheit(-18));
    }

    // cupsToTablespoons tests ---------------------------------------------------------------------------
    // TODO: Write a test for 0 cups converts to 0 tablespoons - run the test & see that it passes
    public void cups0ToTablespoons0() {
        assertEquals(0, ConversionFunctions.cupsToTablespoons(0));
    }

    // TODO: Write a test for 1 cup converts to 16 tablespoons
    // TODO: Run the test & see that it fails. Failing tests reveal bugs.
    // TODO: Fix the implementation of cupsToTablespoons so that this test passes

    // TODO: Write one or two additional tests for cupsToTablespoons

    @Test
    public void cups6ToTablespoons96() {
        assertEquals(96, ConversionFunctions.cupsToTablespoons(6));
    }

    @Test
    public void cupsNegative10ToTablespoonsNegative160() {
        assertEquals(-160, ConversionFunctions.cupsToTablespoons(-10));
    }
    // monthNumToMonthName tests ---------------------------------------------------------------------------
    // TODO: Complete the test below so that it tests all valid months
    @Test
    public void months1through12AreJanuaryThroughDecember () {
            assertEquals("january", ConversionFunctions.monthNumToMonthName(1).toLowerCase());
            assertEquals("february", ConversionFunctions.monthNumToMonthName(2).toLowerCase());
            assertEquals("march", ConversionFunctions.monthNumToMonthName(3).toLowerCase());
            assertEquals("april", ConversionFunctions.monthNumToMonthName(4).toLowerCase());
            assertEquals("may", ConversionFunctions.monthNumToMonthName(5).toLowerCase());
            assertEquals("june", ConversionFunctions.monthNumToMonthName(6).toLowerCase());
            assertEquals("july", ConversionFunctions.monthNumToMonthName(7).toLowerCase());
            assertEquals("august", ConversionFunctions.monthNumToMonthName(8).toLowerCase());
            assertEquals("september", ConversionFunctions.monthNumToMonthName(9).toLowerCase());
            assertEquals("october", ConversionFunctions.monthNumToMonthName(10).toLowerCase());
            assertEquals("november", ConversionFunctions.monthNumToMonthName(11).toLowerCase());
            assertEquals("december", ConversionFunctions.monthNumToMonthName(12).toLowerCase());
        }

        // TODO: Complete the test below for a variety of invalid month numbers; be sure to include bounds
        // TODO: Run the test and see that it fails. Failing tests reveal bugs.
        // TODO: Fix the implementation of monthNumToMonthName so that this test passes
        @Test
        public void invalidMonthReturnsEmptyString() {
            assertEquals("", ConversionFunctions.monthNumToMonthName(33));
        }
        @Test
        public void invalidMonthReturnsEmptyString1() {
            assertEquals("", ConversionFunctions.monthNumToMonthName(17));
        }
        @Test
        public void invalidMonthReturnsEmptyString2() {
            assertEquals("", ConversionFunctions.monthNumToMonthName(23));
        }
    }