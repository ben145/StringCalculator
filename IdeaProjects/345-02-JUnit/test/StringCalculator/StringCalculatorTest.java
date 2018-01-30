package StringCalculator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ben on 1/26/2018.
 */
class StringCalculatorTest {

    @org.junit.jupiter.api.Test
    void addTest() {
        StringCalculator s1 = new StringCalculatorImpl();
        String testString = "";
        int result = s1.Add(testString);
        assertEquals(0, result);
    }
}