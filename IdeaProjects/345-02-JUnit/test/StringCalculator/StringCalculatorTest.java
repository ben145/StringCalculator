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

        testString = "-1234";
        result = s1.Add(testString);
        assertEquals(-1234,result);
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

    @org.junit.jupiter.api.Test
    void addTestMultipleNumbers() {
        StringCalculator sM = new StringCalculatorImpl();
        String testString = "0,0,0";
        int result = sM.Add(testString);
        assertEquals(0, result);

        testString = "-1,6,-5";
        result = sM.Add(testString);
        assertEquals(0, result);

        testString = "0,1,0";
        result = sM.Add(testString);
        assertEquals(1, result);

        testString = "-1,0,1";
        result = sM.Add(testString);
        assertEquals(0, result);

        testString = "-33,5,17";
        result = sM.Add(testString);
        assertEquals(-11, result);

        testString = "-3,-5,-1";
        result = sM.Add(testString);
        assertEquals(-9, result);
    }
    @org.junit.jupiter.api.Test
    void addTestMultipleNumbersNewLine() {
        StringCalculator sM = new StringCalculatorImpl();
        String testString = "0\n0\n0";
        int result = sM.Add(testString);
        assertEquals(0, result);

        testString = "-1,6\n-5";
        result = sM.Add(testString);
        assertEquals(0, result);

        testString = "0,1,0";
        result = sM.Add(testString);
        assertEquals(1, result);

        testString = "-1,0,1";
        result = sM.Add(testString);
        assertEquals(0, result);

        testString = "-33,5,17";
        result = sM.Add(testString);
        assertEquals(-11, result);

        testString = "-3,-5,-1";
        result = sM.Add(testString);
        assertEquals(-9, result);
    }
}