package ch09;
public class AKSPrimalityTest {
    private static final long[] c = new long[64];
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            coeff(n);
        }
        System.out.print("Prima:");
        for (int n = 1; n < c.length; n++)
            if (isPrime(n))
                System.out.printf(" %d", n);
 
        System.out.println();
    }
    static void coeff(int n) {
        c[0] = 1;
        for (int i = 0; i < n; c[0] = -c[0], i++) {
            c[1 + i] = 1;
            for (int j = i; j > 0; j--)
                c[j] = c[j - 1] - c[j];
        }
    }
    static boolean isPrime(int n) {
        coeff(n);
        c[0]++;
        c[n]--;
 
        int i = n;
        while (i-- != 0 && c[i] % n == 0)
            continue;
        return i < 0;
    }
}