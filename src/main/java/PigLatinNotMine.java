public class PigLatinNotMine {

        public static String pigIt(String str) {
            return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
            //the \\w - mean if only A word character, short for [a-zA-Z_0-9]
            // \\w* mean the end of the world replaced on ay
        }
    }