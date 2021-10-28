
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void should_add_correctly() {
        assertEquals(8, calculator.add(4, 4));
    }

    @Test
    void should_substract_correctly() {
        assertEquals(0, calculator.sub(4, 4));
    }

    @Test
    void should_multiply_correctly() {
        assertEquals(16, calculator.mult(4, 4));
    }

    @Test
    void should_divide_correctly() {
        assertEquals(1, calculator.div(4, 4));
    }

    @Test
    void should_power_correctly() {
        assertEquals(64, calculator.power(4,3));
    }

   
}