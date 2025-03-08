package Lesson14_Junit5;

import org.example.CompareNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareNumbersTest {
    @DisplayName("Сравнение: число больше")
    @Test
    public void isGreaterThan() {
        assertEquals("5 больше чем 3", CompareNumbers.compare(5, 3));}

    @DisplayName("Сравнение: число меньше")
    @Test
    public void isLessThan() {
        assertEquals("3 меньше чем 5", CompareNumbers.compare(3, 5));}

    @DisplayName("Сравнение: число равно")
    @Test
    public void isEqualTo() {
        assertEquals("5 равен 5", CompareNumbers.compare(5, 5));
    }
}