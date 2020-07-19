import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class WithdrawTest {
  
    @Test
    public void basicTests() {
        assertArrayEquals(new int[] {0, 0, 2}, Challenge.withdraw(40));
        assertArrayEquals(new int[] {2, 1, 0}, Challenge.withdraw(250));
        assertArrayEquals(new int[] {2, 0, 3}, Challenge.withdraw(260));
        assertArrayEquals(new int[] {1, 1, 4}, Challenge.withdraw(230));
        assertArrayEquals(new int[] {0, 0, 3}, Challenge.withdraw(60));
    }
}