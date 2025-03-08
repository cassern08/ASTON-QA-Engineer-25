import org.example.FactorialCalculate;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculateTest {
    @Test
    public void isPositiveNumber() {
        assertEquals(FactorialCalculate.factorial(5), 120);}

    @Test
    public void isNumberEqualsOne() {
        assertEquals(1, FactorialCalculate.factorial(1));}

    @Test
    public void isNumberEqualsZero() {
        assertEquals(1, FactorialCalculate.factorial(1));

    }

    @Test
    public void isNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculate.factorial(-1));
    }
}