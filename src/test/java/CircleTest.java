
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    Circle circle = new Circle();

    @Test
    public void testAreaWithRadius5() {
        double result = circle.calculateArea(5);
        assertEquals(78.5398, result, 0.001);
    }

    @Test
    public void testAreaWithRadius10() {
        double result = circle.calculateArea(10);
        assertEquals(314.159, result, 0.001);
    }

    @Test
    public void testZeroRadius() {
        double result = circle.calculateArea(0);
        assertEquals(0, result);
    }

    @Test
    public void testNegativeRadius() {
        assertThrows(
            IllegalArgumentException.class,
            () -> circle.calculateArea(-5)
        );
    }
}

