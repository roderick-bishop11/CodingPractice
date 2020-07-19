import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RotationTest {
  
    @Test
    public void testBasicCases() {
       assertEquals(-1, CalculateRotation.shiftedDiff("hoop", "pooh"));
       assertEquals(2, CalculateRotation.shiftedDiff("coffee", "eecoff"));
      assertEquals(4, CalculateRotation.shiftedDiff("eecoff", "coffee"));
    }
}