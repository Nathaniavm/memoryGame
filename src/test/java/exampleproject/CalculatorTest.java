package exampleproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testConstructor() {
        Calculator calculator;

        for (String operator : new String[] { "+", "-", "*", "/" }) {
            calculator = new Calculator(operator);
            assertEquals(operator, calculator.getOperator());
        }

        assertThrows(IllegalArgumentException.class, () -> new Calculator(""));
    }

    @Test
    void testCalculate() {
        Calculator calculator = new Calculator("+");
        assertEquals(3, calculator.calculate(1, 2));

        calculator = new Calculator("-");
        assertEquals(-1, calculator.calculate(1, 2));

        calculator = new Calculator("*");
        assertEquals(2, calculator.calculate(1, 2));

        calculator = new Calculator("/");
        assertEquals(0, calculator.calculate(1, 2));
    }
}
