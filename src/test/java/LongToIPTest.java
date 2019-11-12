import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongToIPTest {
    @Test
    public void sampleTest() {
        assertEquals("84.58.50.21", LongToIP.longToIP(1413100242L));
        assertEquals("128.32.10.1", LongToIP.longToIP(2149583361L));
        assertEquals("128.114.17.104", LongToIP.longToIP(2154959208L));
        assertEquals("0.0.0.0", LongToIP.longToIP(0));
        assertEquals("128.32.10.1", LongToIP.longToIP(2149583361L));
    }
    @Test
    public void sampleTest2() {
        assertEquals("84.58.50.21", LongToIPNotMIne.longToIP(1413100242L));
        assertEquals("128.32.10.1", LongToIPNotMIne.longToIP(2149583361L));
        assertEquals("128.114.17.104", LongToIPNotMIne.longToIP(2154959208L));
        assertEquals("0.0.0.0", LongToIPNotMIne.longToIP(0));
        assertEquals("128.32.10.1", LongToIPNotMIne.longToIP(2149583361L));
    }
}
