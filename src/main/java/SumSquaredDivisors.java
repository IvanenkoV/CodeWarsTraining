import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {

        String resultString;
        List<String> results = new ArrayList<>();

        for (long i = m; i < n; i++) {
            List<Long> arraySubDivisors = new ArrayList<>();

            for (long j = 1; j <= i; j++) {
                if (i % j == 0) arraySubDivisors.add(j);
            }
            List<Long> list2 = new ArrayList<>();
            long sum = 0;
            for (int k = 0; k < arraySubDivisors.size(); k++) {
                list2.add(arraySubDivisors.get(k) * arraySubDivisors.get(k));
                sum += list2.get(k);
            }

            double sumSqrt = sqrt(sum);
            if (sumSqrt == (long) sumSqrt) {

                results.add("[" + i + ", " + sum + "]");

            }
        }

        resultString = "[";
        for (int i = 0; i < results.size(); i++) {
            resultString = resultString + results.get(i);
            if (i == results.size() - 1) continue;
            resultString += ", ";
        }

        resultString += "]";
        return resultString;
    }
}
