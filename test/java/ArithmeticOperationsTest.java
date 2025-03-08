import org.example.ArithmeticOperations;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticOperationsTest {

    @Test
    public void testAddition() {
        assertEquals(ArithmeticOperations.add(2, 3), 5);
        assertEquals(ArithmeticOperations.add(-1, 1), 0);
        assertEquals(ArithmeticOperations.add(-1, -1), -2);
    }

    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticOperations.subtract(5, 3), 2);
        assertEquals(ArithmeticOperations.subtract(0, 5), -5);
        assertEquals(ArithmeticOperations.subtract(-1, -1), 0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticOperations.multiply(2, 3), 6);
        assertEquals(ArithmeticOperations.multiply(-1, 1), -1);
        assertEquals(ArithmeticOperations.multiply(-1, -1), 1);
    }

    @Test
    public void testDivision() {
        assertEquals(ArithmeticOperations.divide(6, 3), 2.0);
        assertEquals(ArithmeticOperations.divide(-6, 3), -2.0);
        assertEquals(ArithmeticOperations.divide(-6, -3), 2.0);

        // Проверка деления на ноль
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5, 0));
    }
}