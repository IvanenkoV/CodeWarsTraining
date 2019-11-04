import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("Oay emporatay oay oresmay !", PigLatin.pigIt("O tempora o mores !"));
    }
    @Test
    public void FixedTests2() {
        assertEquals("igPay atinlay siay oolcay", PigLatinNotMine.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatinNotMine.pigIt("This is my string"));
        assertEquals("Oay emporatay oay oresmay !", PigLatinNotMine.pigIt("O tempora o mores !"));
    }
}