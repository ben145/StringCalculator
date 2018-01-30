package StringCalculator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ben on 1/26/2018.
 */
class StringCalculatorTest {

    @org.junit.jupiter.api.Test
    void addTestEmptyString() {
        StringCalculator sE = new StringCalculatorImpl();
        String testString = "";
        int result = sE.Add(testString);
        assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void addTestOneNumber() {
        StringCalculator s1 = new StringCalculatorImpl();
        String testString = "1";
        int result = s1.Add(testString);
        assertEquals(1, result);

        testString = "387";
        result = s1.Add(testString);
        assertEquals(387, result);

        testString = "0";
        result = s1.Add(testString);
        assertEquals(0, result);

        testString = "-1";
        result = s1.Add(testString);
        assertEquals(-1, result);
    }

    @org.junit.jupiter.api.Test
    void addTestTwoNumbers() {
        StringCalculator s2 = new StringCalculatorImpl();
        String testString = "0,0";
        int result = s2.Add(testString);
        assertEquals(0, result);

        testString = "4,5";
        result = s2.Add(testString);
        assertEquals(9, result);

        testString = "1,-1";
        result = s2.Add(testString);
        assertEquals(0, result);

        testString = "10,0";
        result = s2.Add(testString);
        assertEquals(10, result);

        testString = "6,-7";
        result = s2.Add(testString);
        assertEquals(-1, result);
    }
}