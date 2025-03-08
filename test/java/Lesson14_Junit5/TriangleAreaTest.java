package Lesson14_Junit5;

import org.example.TriangleArea;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaTest {
    @DisplayName("Основание и высота положительные")
    @Test
    public void isDataPositive() {
        assertEquals(10.0, TriangleArea.area(4, 5));}

    @DisplayName("Основание или высота отрицательные")
    @Test
    public void isDataNegative() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.area(-1, 5));
    }
}