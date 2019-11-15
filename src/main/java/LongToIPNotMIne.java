public class LongToIPNotMIne {
    public static String longToIP(final long ip) {


        // (ip >> 24) & 0xFF it mean that take the value after 24 symbols (bite shift) as int
        return ((ip >> 24) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                (ip & 0xFF);
    }
}
