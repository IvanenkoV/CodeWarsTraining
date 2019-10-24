class Persist {
    public static int persistence(long n) {

        int numberOfCicles = 0;
        while (n >= 10) {
            String numberString = String.valueOf(n);
            n = 1;
            int i = 0;
            for (; i < numberString.length(); i++) {

                n = n * Character.digit(numberString.charAt(i), 10);
            }
            if (numberString.length() == 1);
            numberOfCicles++;
        }
        return numberOfCicles;

    }
}