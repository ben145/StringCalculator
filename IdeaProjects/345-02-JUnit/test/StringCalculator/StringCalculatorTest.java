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
}