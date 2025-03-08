import org.example.CompareNumbers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CompareNumbersTest {
    @DataProvider(name = "compareData")
    public Object[][] compareData() {
        return new Object[][] {
                {5, 3, "5 больше чем 3"},
                {3, 5, "3 меньше чем 5"},
                {5, 5, "5 равен 5"}
        };
    }

    @Test(dataProvider = "compareData")
    public void testCompare(int a, int b, String expected) {
        assertEquals(CompareNumbers.compare(a, b), expected);
    }
}