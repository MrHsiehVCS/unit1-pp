package u1pp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;

/**
 * Unit Tests for Unit 2 Programming Project
 */
public class MainTests {
    @Test
    public void averageThreeNumbers_withSameNumber_returnsNumber() {
        double output = Main.averageThreeNumbers(1.0, 1.0, 1.0);
        assertEquals(1.0, output);
    }

    @Test
    public void averageThreeNumbers_withDiffNumber_returnsNumber() {
        double output = Main.averageThreeNumbers(0.0, 1.0, 2.0);
        assertEquals(1.0, output);
    }

    @Test
    public void averageThreeNumbers_withLargeNumber_returnsNumber() {
        double output = Main.averageThreeNumbers(1000000.0, 1000000.0, 4000000.0);
        assertEquals(2000000.0, output);
    }
}
