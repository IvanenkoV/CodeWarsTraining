import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new MultipliesOf3Or5().solution(10));
    }

    @Test
    public void test2() {
        assertEquals(23, new MultiplesNotMine().solution(10));
    }

}