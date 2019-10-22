public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n <= 0) return new double[0];
        double[] trib = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) trib[i] = s[i];
            else trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3];
        }
        return trib;
    }
}

