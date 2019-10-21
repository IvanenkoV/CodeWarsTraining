
import org.junit.jupiter.api.Test;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.runners.JUnit4;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
       assertEquals("))((",DuplicateEncoder.encode("(( @"));
       assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));

    }
    @Test
    public void test2() {
        assertEquals(")()())()(()()(",
                DuplicateEncoderNotMine.encode("Prespecialized"));
        assertEquals("))((",DuplicateEncoderNotMine.encode("(( @"));
        assertEquals("))))())))",DuplicateEncoderNotMine.encode("   ()(   "));
        assertEquals(")))(((",DuplicateEncoderNotMine.encode("YYYlib"));

    }
}