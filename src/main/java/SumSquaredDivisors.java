import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {

        List<String> results = new ArrayList<>();

        for (long i = m; i < n; i++) {
            List<Long> arraySubDivisors = new ArrayList<>();

            // List of values of natural divisors
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) arraySubDivisors.add(j);
            }
            // the sum of divisors
            long sum = 0;
            for (int k = 0; k < arraySubDivisors.size(); k++) {
                sum += arraySubDivisors.get(k) * arraySubDivisors.get(k);
            }
            double sumSqrt = sqrt(sum);

            // Filling a list with result values for numbers whose squared divisors is a square and then the sum of the squared divisors.
            if (sumSqrt == (long) sumSqrt) {
                results.add("[" + i + ", " + sum + "]");
            }
        }

        return results.toString();
    }
}
