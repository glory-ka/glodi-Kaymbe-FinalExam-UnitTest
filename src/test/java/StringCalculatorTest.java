import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest
{
    StringCalculator calculator;
    @BeforeEach
    public void setUp ()
    {
        calculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown ()
    {
        calculator = null;
    }

    @Test
    public void TestNegativeNumber ()
    {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.add("-1 5 6"));
        assertEquals("negatives not allowed.", exception.getMessage());
    }

    public void TestNumberGreaterThan1000()
    {
        int actual = calculator.add("1 2 10001");
        assertEquals(3, actual);
    }
}
