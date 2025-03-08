import org.example.TriangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaTest {
    @Test
    public void testArea() {
        assertEquals(10.0, TriangleArea.area(4, 5));
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.area(-1, 5));
    }
}