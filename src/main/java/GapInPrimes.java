import com.sun.tools.javac.code.Attribute;

import java.util.ArrayList;
import java.util.List;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long[] results = new long[2];
        List<Long> prime = new ArrayList<>();

        FIRST:
        for (long number = m; number <= n; number++) {
            //Checking prime
            for (long i = 2; i*i <= number; i++) {
                if (number % i == 0) {
                    continue FIRST;
                }
            }
            prime.add(number);
        }
        Long lo = 60l;

                // Check the primes with gap
        SECOND:
        for (int i = 1; i < prime.size(); i++) {
            if (prime.get(i) - prime.get(i - 1) == g) {
                results[0] = prime.get(i - 1);
                results[1] = prime.get(i);
                break SECOND;
            }
        }
        if (results[0] == results[1] && results[0] == 0) return null;
        return results;

    }
}