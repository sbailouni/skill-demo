import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtraction() {
        assertEquals(1, SkillDemo.subtract(3, 2)); //Fails at first
    }
}
