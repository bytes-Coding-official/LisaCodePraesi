import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testTrue() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void testFalse() {
        Assertions.assertEquals(true, false);
    }
}
