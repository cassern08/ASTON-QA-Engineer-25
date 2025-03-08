package Lesson14_Junit5;

import Lesson14.FactorialCalculate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class FactorialCalculateTest {
    @DisplayName("Тестирование вычисления факториала для нуля")
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculate.factorial(0));
    }
    @DisplayName("Тестирование вычисления факториала для положительных чисел")
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculate
                .factorial(5));
    }
    @DisplayName("Тестирование вычисления факториала для еденицы")
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculate.factorial(1));
    }
    @DisplayName("Тестирование вычисления факториала исключения для отрицательного числа ")
    @Test
    public void testFactorialThrowsExceptionForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculate.factorial(-1));
    }
        }
