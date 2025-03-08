package Lesson14_Junit5;

import org.example.ArithmeticOperations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {
    @DisplayName("Сложение чисел")
    @Test
    public void addNumbers() {
        assertEquals(5, ArithmeticOperations.add(2, 3));}

    @DisplayName("Вычитание чисел")
    @Test
    public void subtractNumbers() {

        assertEquals(1, ArithmeticOperations.subtract(3, 2));}

    @DisplayName("Умножение чисел")
    @Test
    public void multiplyNumbers() {
        assertEquals(6, ArithmeticOperations.multiply(2, 3));}

    @DisplayName("Деление чисел")
    @Test
    public void divideNumbers() {
        assertEquals(2, ArithmeticOperations.divide(4, 2));}

    @DisplayName("Деление числа на ноль")
    @Test
    public void dividingByZero() {

        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(4, 0));
    }
}