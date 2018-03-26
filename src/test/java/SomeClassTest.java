import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {

    @Test
    public void doSomethingTest() {
        SomeClass someClass = new SomeClass();

        int output = someClass.doSomething();

        assertEquals(0, output);
    }
}