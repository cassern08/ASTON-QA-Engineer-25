import org.example.TriangleArea;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class TriangleAreaTest {
    @Test
    public void isDataPositive() {
        assertEquals(TriangleArea.area(4, 5), 10.0);}

    @Test
    public void isDataNegative() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.area(-1, 5));
    }
}